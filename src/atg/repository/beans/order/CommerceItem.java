package atg.repository.beans.order;

import java.util.List;
import java.util.Set;

import atg.repository.beans.BeanProperty;

public class CommerceItem {

	@BeanProperty(propertyName = "catalogId")
	public String catalogId;

	@BeanProperty(propertyName = "catalogKey")
	public String catalogKey;

	@BeanProperty(propertyName = "catalogRefId")
	public String catalogRefId;

	@BeanProperty(propertyName = "categoryId")
	public String categoryId;

	@BeanProperty(propertyName = "commerceItemClassType")
	public String commerceItemClassType;

	@BeanProperty(propertyName = "discountable")
	public Boolean discountable;

	@BeanProperty(propertyName = "egiftCardMessage")
	public String egiftCardMessage;

	@BeanProperty(propertyName = "egiftCardRecipientEmail")
	public String egiftCardRecipientEmail;

	@BeanProperty(propertyName = "egiftCardRecipientName")
	public String egiftCardRecipientName;

	@BeanProperty(propertyName = "egiftCardScheduledDeliveryDate")
	public Long egiftCardScheduledDeliveryDate;

	@BeanProperty(propertyName = "giftWrappable")
	public Boolean giftWrappable;

	@BeanProperty(propertyName = "isLowInventory")
	public String isLowInventory;

	@BeanProperty(propertyName = "markers")
	public Set<Object>	 markers;

	@BeanProperty(propertyName = "order")
	public Object order;

	@BeanProperty(propertyName = "overweightCharge")
	public Double overweightCharge;

	@BeanProperty(propertyName = "priceInfo", repositoryItem = "priceInfo")
	public Object priceInfo;

	@BeanProperty(propertyName = "productId")
	public String productId;

	@BeanProperty(propertyName = "quantity")
	public Long quantity;

	@BeanProperty(propertyName = "reservations")
	public List<Object> reservations;

	@BeanProperty(propertyName = "siteId")
	public String siteId;

	@BeanProperty(propertyName = "state")
	public String state;

	@BeanProperty(propertyName = "stateDetail")
	public String stateDetail;

	@BeanProperty(propertyName = "type")
	public String type;


	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogKey() {
		return catalogKey;
	}

	public void setCatalogKey(String catalogKey) {
		this.catalogKey = catalogKey;
	}

	public String getCatalogRefId() {
		return catalogRefId;
	}

	public void setCatalogRefId(String catalogRefId) {
		this.catalogRefId = catalogRefId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCommerceItemClassType() {
		return commerceItemClassType;
	}

	public void setCommerceItemClassType(String commerceItemClassType) {
		this.commerceItemClassType = commerceItemClassType;
	}

	public Boolean isDiscountable() {
		return discountable;
	}

	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}

	public String getEgiftCardMessage() {
		return egiftCardMessage;
	}

	public void setEgiftCardMessage(String egiftCardMessage) {
		this.egiftCardMessage = egiftCardMessage;
	}

	public String getEgiftCardRecipientEmail() {
		return egiftCardRecipientEmail;
	}

	public void setEgiftCardRecipientEmail(String egiftCardRecipientEmail) {
		this.egiftCardRecipientEmail = egiftCardRecipientEmail;
	}

	public String getEgiftCardRecipientName() {
		return egiftCardRecipientName;
	}

	public void setEgiftCardRecipientName(String egiftCardRecipientName) {
		this.egiftCardRecipientName = egiftCardRecipientName;
	}

	public Long getEgiftCardScheduledDeliveryDate() {
		return egiftCardScheduledDeliveryDate;
	}

	public void setEgiftCardScheduledDeliveryDate(Long egiftCardScheduledDeliveryDate) {
		this.egiftCardScheduledDeliveryDate = egiftCardScheduledDeliveryDate;
	}

	public Boolean isGiftWrappable() {
		return giftWrappable;
	}

	public void setGiftWrappable(Boolean giftWrappable) {
		this.giftWrappable = giftWrappable;
	}

	public String getIsLowInventory() {
		return isLowInventory;
	}

	public void setIsLowInventory(String isLowInventory) {
		this.isLowInventory = isLowInventory;
	}

	public Set<Object> getMarkers() {
		return markers;
	}

	public void setMarkers(Set<Object> markers) {
		this.markers = markers;
	}

	public Object getOrder() {
		return order;
	}

	public void setOrder(Object order) {
		this.order = order;
	}

	public Double getOverweightCharge() {
		return overweightCharge;
	}

	public void setOverweightCharge(Double overweightCharge) {
		this.overweightCharge = overweightCharge;
	}

	public Object getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(Object priceInfo) {
		this.priceInfo = priceInfo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public List<Object> getReservations() {
		return reservations;
	}

	public void setReservations(List<Object> reservations) {
		this.reservations = reservations;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateDetail() {
		return stateDetail;
	}

	public void setStateDetail(String stateDetail) {
		this.stateDetail = stateDetail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
