package atg.repository.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import atg.nucleus.GenericService;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.userprofiling.ProfileTools;

public class RepositoryBeanTools extends GenericService implements RepositoryBeans {
	private ProfileTools	mProfileTools;

	public void setProfileTools(ProfileTools pProfileTools) {
		mProfileTools = pProfileTools;
	}

	public ProfileTools getProfileTools() {
		return mProfileTools;
	}

	private Map<String, String>	mItemDescriptorToPojoMap;

	public void setItemDescriptorToPojoMap(Map<String, String> pItemDescriptorToPojoMap) {
		mItemDescriptorToPojoMap = pItemDescriptorToPojoMap;
	}

	public Map<String, String> getItemDescriptorToPojoMap() {
		return mItemDescriptorToPojoMap;
	}

	private Map<String, String> mPromotionTypesMap;

	public void setPromotionTypesMap(Map<String, String> pPromotionTypesMap) {
		mPromotionTypesMap = pPromotionTypesMap;
	}

	public Map<String, String> getPromotionTypesMap() {
		return mPromotionTypesMap;
	}

	private Map<String, String> mClaimableTypesMap;

	public void setClaimableTypesMap(Map<String, String> pClaimableTypesMap) {
		mClaimableTypesMap = pClaimableTypesMap;
	}

	public Map<String, String> getClaimableTypesMap() {
		return mClaimableTypesMap;
	}

	@Override
	public void doStartService() throws atg.nucleus.ServiceException {
		super.doStartService();
		logInfo("##### RepositoryBeanTools STARTED #####");
	}

	/**
	 * @param pItem RepositoryItem to operate on. This RepositoryItem must have a Map<K,V> entry in itemDescriptorToPojoMap property.
	 * @return bean Object representing the repositoryItem
	 */
	public Object repositoryItemToPojo(RepositoryItem pItem) {
		Object bean = new Object();
		try {
			bean = createBeanInstance(pItem);
			bean = populateBeanFromRepositoryItem(bean, pItem);
		}
		catch (Exception e) {
			System.out.println(e);
		}

		return bean;
	}

	/**
	 * @param pItem RepositoryItem to operate on. This RepositoryItem must have a Map<K,V> entry in itemDescriptorToPojoMap property.
	 * @return
	 * @throws RepositoryException
	 */
	private final Object createBeanInstance(RepositoryItem pItem) throws RepositoryException {

		String itemDescriptorName = pItem.getItemDescriptor().getItemDescriptorName();

		if (isLoggingDebug()) {
			logDebug("Start: createBeanInstance for item descritpor " + itemDescriptorName);
		}

		String key = null;
		String fullyQualifiedClassName = null;
		Object bean = null;

		try {
			key = itemDescriptorName.trim();

			if (getItemDescriptorToPojoMap().containsKey(key)) {
				fullyQualifiedClassName = getItemDescriptorToPojoMap().get(key);
			}
			else if (getPromotionTypesMap().containsKey(key)) {
				Iterator iter = getPromotionTypesMap().entrySet().iterator();
				while (iter.hasNext()) {
					Map.Entry kv = (Map.Entry) iter.next();
					if (kv.getKey().toString().equalsIgnoreCase(key)) {
						key = kv.getValue().toString();
						fullyQualifiedClassName = getItemDescriptorToPojoMap().get(key);
						break;
					}
				}
			}
			else if (getClaimableTypesMap().containsKey(key)) {
				Iterator iter = getClaimableTypesMap().entrySet().iterator();
				while (iter.hasNext()) {
					Map.Entry kv = (Map.Entry) iter.next();
					if (kv.getKey().toString().equalsIgnoreCase(key)) {
						key = kv.getValue().toString();
						fullyQualifiedClassName = getItemDescriptorToPojoMap().get(key);
						break;
					}
				}
			}

			if (fullyQualifiedClassName == null) {
				return null;
			}

			Class<?> beanClass = null;
			beanClass = (Class<?>) Class.forName(fullyQualifiedClassName);

			bean = beanClass.newInstance();

			if (isLoggingDebug() && bean != null) {
				logDebug("Create new instance of " + bean.getClass().getSimpleName());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		if (isLoggingDebug()) {
			logDebug("End: createBeanInstance");
		}

		return bean;

	}


	private final Object populateBeanFromRepositoryItem(Object bean, RepositoryItem pItem) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass(), Object.class);
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

		for (PropertyDescriptor pd : propertyDescriptors) {
			Method setter = pd.getWriteMethod();
			Field field = null;

			try {
				field = bean.getClass().getField(pd.getName());
			}
			catch (Exception ex) {
				logWarning("Retrieving the fieldname failed for " + pd.getName(), ex);
				continue;
			}

			if (field == null)
				continue;

			String propertyName = null;
			Object value = null;
			String reference = null;

			// Check for @BeanProperty annotation which overrides field.getName()
			if (field.isAnnotationPresent(BeanProperty.class)) {
				BeanProperty beanAnnotation = field.getAnnotation(BeanProperty.class);
				propertyName = beanAnnotation.propertyName();
				reference = beanAnnotation.repositoryItem();
			}

			if (isLoggingDebug())
				logDebug("Mapping " + propertyName);

			try {
				value = pItem.getPropertyValue(propertyName);
			}
			catch (Exception ex) {
				logError("Property not found in repositoryItem, continuing...", ex);
				continue;
			}

			if (value == null)
				continue;


			wrapObject(bean, value, reference, setter);

		}

	return bean;
}

	/**
	 * Method that controls the wrapping of RepositoryItem properties to the Pojo properties.
	 *
	 * @param bean - Class being operated on.
	 * @param value - RepositoryItem property value
	 * @param reference - RepositoryItem reference if the Pojo will drill down on a RepositoryItem property value
	 * @param setter - Setter method for the Bean Class
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	private final void wrapObject(Object bean, Object value, String reference, Method setter) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (isLoggingDebug()) {
			logDebug("Start: wrapObjectValue()");
		}

		try{
			if (value instanceof RepositoryItem) {
				if (reference != null && !getItemDescriptorToPojoMap().containsKey(reference)) {
					// Only map the repositoryId
					RepositoryItem ri = (RepositoryItem) value;
					setter.invoke(bean, ri.getRepositoryId());
				}
				else {
					// Map the entire RepositoryItem to Pojo
					Object innerBean = null;
					innerBean = repositoryItemToPojo((RepositoryItem) value);
					setter.invoke(bean, innerBean);
				}
			}
			else if (value instanceof String && value != null) {
				setter.invoke(bean, (String) value);
			}
			else if (value instanceof Boolean && value != null) {
				setter.invoke(bean, (Boolean) value);
			}
			else if (value instanceof Integer && value != null) {
				setter.invoke(bean, (Integer) value);
			}
			else if (value instanceof Double && value != null) {
				setter.invoke(bean, (Double) value);
			}
			else if (value instanceof Object[] || value.getClass().isArray()) {
				Object[] array = (Object[]) value;
				if (array != null && array.length > 0)
					setter.invoke(bean, (Object[]) array);
			}
			else if (value instanceof Set) {
				setter.invoke(bean, wrapSet(bean, setter, (Set) value, reference));
			}
			else if (value instanceof List) {
				setter.invoke(bean, wrapList(bean, setter, (List) value, reference));
			}
			else if (value instanceof Map) {
				setter.invoke(bean, wrapMap(bean, setter, (Map) value, reference));
			}
			else if (value instanceof Timestamp) {
				Timestamp ts = (Timestamp) value;
				setter.invoke(bean, ((Long) ts.getTime()));
			}
			else if (value instanceof Date) {
				Date d = (Date) value;
				setter.invoke(bean, ((Long) d.getTime()));
			} else {
				setter.invoke(bean, (Object) value);
			}

			if (isLoggingDebug()) {
				logDebug("End: wrapObjectValue()");
			}
		}catch(Exception e){
			logError("Wrapper method FAILED for " + bean + ", value = " + value + ", reference (if applicable) = " + reference, e);
		}
	}

	/**
	 * Wraps a RepositoryItem list property to a list where the value is a repositoryId.
	 *
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	private final List wrapList(Object bean, Method setter, List pList, String reference) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (isLoggingDebug()) {
			logDebug("Start: wrapList()");
		}

		List list = new ArrayList();

		for (Object o : pList) {
			if (o instanceof RepositoryItem) {
				RepositoryItem ri = (RepositoryItem) o;

				if (reference != null && getItemDescriptorToPojoMap().containsKey(reference)) {
					// Map the entire RepositoryItem to Pojo
					Object innerBean = null;
					innerBean = repositoryItemToPojo(ri);
					list.add(innerBean);
				}
				else {
					list.add(ri.getRepositoryId());
					if (isLoggingDebug())
						logDebug("Adding " + ri.getRepositoryId() + " to list");
				}
				setter.invoke(bean, list);
			}
			else {
				setter.invoke(bean, o);
			}
		}

		if (isLoggingDebug()) {
			logDebug("End: wrapList()");
		}

		return list;
	}

	/**
	 * Wraps a RepositoryItem set property to a set where the value is the repositoryId.
	 *
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	private final Set wrapSet(Object bean, Method setter, Set pSet, String reference) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (isLoggingDebug()) {
			logDebug("Start: wrapSet()");
		}

		Set set = new HashSet();

		for (Object o : pSet) {
			if (o instanceof RepositoryItem) {
				RepositoryItem ri = (RepositoryItem) o;

				if (reference != null && getItemDescriptorToPojoMap().containsKey(reference)) {
					// Map the entire RepositoryItem to Pojo
					Object innerBean = null;
					innerBean = repositoryItemToPojo(ri);
					set.add(innerBean);
				}
				else {
					set.add(ri.getRepositoryId());
					if (isLoggingDebug())
						logDebug("Adding " + ri.getRepositoryId() + " to list");
				}
				setter.invoke(bean, set);
			}
			else {
				setter.invoke(bean, o);
			}
		}
		if (isLoggingDebug()) {
			logDebug("End: wrapSet()");
		}

		return set;
	}

	/**
	 * Wraps a RepositoryItem map property to a map where the value is the repositoryId.
	 */
	private final Map wrapMap(Object bean, Method setter, Map pMap, String reference) {
		if (isLoggingDebug()) {
			logDebug("Start: wrapMap()");
		}

		Map map = new HashMap();

		for (Object key : pMap.keySet()) {
			Object val = pMap.get((String) key);
			if (val instanceof RepositoryItem) {
				RepositoryItem ri = (RepositoryItem) val;

				if (reference != null && getItemDescriptorToPojoMap().containsKey(reference)) {
					// Map the entire RepositoryItem to Pojo
					Object innerBean = null;
					innerBean = repositoryItemToPojo(ri);
					map.put((String) key, innerBean);
				}
				else {
					map.put((String) key, ri.getRepositoryId());
				}
			}
			else {
				map.put((String) key, pMap.get(key));
			}

			if (isLoggingDebug())
				logDebug("Adding " + key + " | " + pMap.get(key) + " to map");
		}

		if (isLoggingDebug()) {
			logDebug("End: wrapMap()");
		}

		return map;
	}

}
