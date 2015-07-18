# ATG-RepositoryBeanTools
ATG module which maps a RepositoryItem to a POJO

### RULES TO FOLLOW
- ALL members are PUBLIC since reflection can only be applied to public fields. 
- Use @BeanProperty(propertyName="someProperty") to define the relationship between the repositoryItem property and the POJO property.
- If you just want the RepositoryItem id, don't add repositoryItem="" property to annotation. 
- Set repositoryItem="itemDescriptorName" in the @BeanProperty annotation to recursively map RepositoryItems
- Make sure that there is an itemDescriptor=path.to.Class mapping in RepositoryBeansTools.properties for itemDescriptorToPojoMap. 
- Collections must contain Object values: List<Object>, Set<Object> etc... 
- Maps must contain Object values: Map<String,Object> etc...


### ATG Component Configuration file:
```
##This is the main property that needs to be edited.
##The syntax is <item-descriptor>=<fully-qualified-class-name>
itemDescriptorToPojoMap=\
	user=atg.repository.beans.profile.User,\
	contactInfo=atg.repository.beans.profile.ContactInfo,\
	gift-list=atg.repository.beans.giftlist.Giftlist,\
	siteConfiguration=atg.repository.beans.site.Site,\
	order=atg.repository.beans.order.Order,\
	priceInfo=atg.repository.beans.order.PriceInfo,\
	commerceItem=atg.repository.beans.order.CommerceItem,\
	claimable=atg.repository.beans.claimable.Claimable,\
	promotion=atg.repository.beans.catalog.Promotion,\
	language=atg.repository.beans.site.Language,\
	currencyList=atg.repository.beans.site.Currencies
```

### Create POJO's and annotate the members that you want to convert
``` java
package atg.repository.beans.order;

import java.util.List;
import java.util.Map;
import java.util.Set;

import atg.repository.beans.BeanProperty;

public class Order {

  // For the given order, the commerceItems itemDescriptor will be retrieved as a List of RepositoryItems
	@BeanProperty(propertyName = "commerceItems", repositoryItem = "commerceItem")
	public List<Object> commerceItems;

	@BeanProperty(propertyName = "creationDate")
	public Long creationDate;

	@BeanProperty(propertyName = "giftCardNumber")
	public String giftCardNumber;

	@BeanProperty(propertyName = "id")
	public String id;

	@BeanProperty(propertyName = "paymentGroups")
	public List<Object> paymentGroups;

	@BeanProperty(propertyName = "profileId")
	public String profileId;

	@BeanProperty(propertyName = "promotionCode")
	public String promotionCode;

	@BeanProperty(propertyName = "shippingGroups")
	public List<Object> shippingGroups;

	@BeanProperty(propertyName = "siteId")
	public String siteId;

	@BeanProperty(propertyName = "specialInstructions")
	public Map<String, Object> specialInstructions;
	
	@BeanProperty(propertyName = "submittedDate")
	public Long submittedDate;

  /* Getters/Setters ommitted for brevity */

}

```

### To put all of this to use, do something like this:
```
RepositoryBeanTools repositoryBeanTools = getRepositoryBeanTools();
Order myOrder = (Order) repositoryBeanTools.repositoryItemToPojo(orderRepositoryItem);
```
