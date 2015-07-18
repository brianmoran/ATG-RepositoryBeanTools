package atg.repository.beans.order;

import java.util.List;
import java.util.Map;
import java.util.Set;

import atg.repository.beans.BeanProperty;

public class Order {

	@BeanProperty(propertyName = "agentId")
	public String agentId;

	@BeanProperty(propertyName = "billingIsSameAsShipping")
	public Boolean billingIsSameAsShipping;

	@BeanProperty(propertyName = "catalogKeyCode")
	public String catalogKeyCode;

	@BeanProperty(propertyName = "commerceItems", repositoryItem = "commerceItem")
	public List<Object> commerceItems;

	@BeanProperty(propertyName = "completedDate")
	public Long completedDate;

	@BeanProperty(propertyName = "costCenters")
	public List<Object> costCenters;

	@BeanProperty(propertyName = "couponCode")
	public String couponCode;

	@BeanProperty(propertyName = "createdByOrderId")
	public String createdByOrderId;

	@BeanProperty(propertyName = "creationDate")
	public Long creationDate;

	@BeanProperty(propertyName = "creationSiteId")
	public String creationSiteId;

	@BeanProperty(propertyName = "creditCardAuthorizationAttempts")
	public Integer creditCardAuthorizationAttempts;

	@BeanProperty(propertyName = "description")
	public String description;

	@BeanProperty(propertyName = "ecometryOrderNumber")
	public String ecometryOrderNumber;

	@BeanProperty(propertyName = "ecometryResponse")
	public String ecometryResponse;

	@BeanProperty(propertyName = "explicitlySaved")
	public Boolean explicitlySaved;

	@BeanProperty(propertyName = "giftCardNumber")
	public String giftCardNumber;

	@BeanProperty(propertyName = "gwp")
	public Boolean gwp; //gift with purchase

	@BeanProperty(propertyName = "gwpMarkers")
	public Set<Object>	 gwpMarkers;

	@BeanProperty(propertyName = "id")
	public String id;

	@BeanProperty(propertyName = "jSessionId")
	public String jSessionId;

	@BeanProperty(propertyName = "lastModifiedDate")
	public Long lastModifiedDate;

	@BeanProperty(propertyName = "manualAdjustments")
	public List<Object> manualAdjustments;

	@BeanProperty(propertyName = "paymentGroups")
	public List<Object> paymentGroups;

	@BeanProperty(propertyName = "priceInfo", repositoryItem="priceInfo")
	public Object priceInfo;

	@BeanProperty(propertyName = "profileId")
	public String profileId;

	@BeanProperty(propertyName = "promotionCode")
	public String promotionCode;

	public Object orderLineItemCountCustomProperty;

	public Object orderMessagesCustomProperty;

	@BeanProperty(propertyName = "relatedOrders")
	public List<Object> relatedOrders;

	@BeanProperty(propertyName = "reservationStatus")
	public List<Object> reservationStatus;

	@BeanProperty(propertyName = "shippingGroups")
	public List<Object> shippingGroups;

	@BeanProperty(propertyName = "siteId")
	public String siteId;

	@BeanProperty(propertyName = "specialInstructions")
	public Map<String, Object> specialInstructions;

	@BeanProperty(propertyName = "state")
	public String state;

	@BeanProperty(propertyName = "sterlingOrderNumber")
	public String sterlingOrderNumber;

	@BeanProperty(propertyName = "submittedDate")
	public Long submittedDate;

	@BeanProperty(propertyName = "taxPriceInfo", repositoryItem="priceInfo")
	public Object taxPriceInfo;

	// not in repository
	public Long cartCount;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
	 * @return the billingIsSameAsShipping
	 */
	public Boolean getBillingIsSameAsShipping() {
		return billingIsSameAsShipping;
	}

	/**
	 * @param billingIsSameAsShipping the billingIsSameAsShipping to set
	 */
	public void setBillingIsSameAsShipping(Boolean billingIsSameAsShipping) {
		this.billingIsSameAsShipping = billingIsSameAsShipping;
	}

	/**
	 * @return the catalogKeyCode
	 */
	public String getCatalogKeyCode() {
		return catalogKeyCode;
	}

	/**
	 * @param catalogKeyCode the catalogKeyCode to set
	 */
	public void setCatalogKeyCode(String catalogKeyCode) {
		this.catalogKeyCode = catalogKeyCode;
	}

	/**
	 * @return the commerceItems
	 */
	public List<Object> getCommerceItems() {
		return commerceItems;
	}

	/**
	 * @param commerceItems the commerceItems to set
	 */
	public void setCommerceItems(List<Object> commerceItems) {
		this.commerceItems = commerceItems;
	}

	/**
	 * @return the completedDate
	 */
	public Long getCompletedDate() {
		return completedDate;
	}

	/**
	 * @param completedDate the completedDate to set
	 */
	public void setCompletedDate(Long completedDate) {
		this.completedDate = completedDate;
	}

	/**
	 * @return the costCenters
	 */
	public List<Object> getCostCenters() {
		return costCenters;
	}

	/**
	 * @param costCenters the costCenters to set
	 */
	public void setCostCenters(List<Object> costCenters) {
		this.costCenters = costCenters;
	}

	/**
	 * @return the couponCode
	 */
	public String getCouponCode() {
		return couponCode;
	}

	/**
	 * @param couponCode the couponCode to set
	 */
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * @return the createdByOrderId
	 */
	public String getCreatedByOrderId() {
		return createdByOrderId;
	}

	/**
	 * @param createdByOrderId the createdByOrderId to set
	 */
	public void setCreatedByOrderId(String createdByOrderId) {
		this.createdByOrderId = createdByOrderId;
	}

	/**
	 * @return the creationDate
	 */
	public Long getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Long creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the creationSiteId
	 */
	public String getCreationSiteId() {
		return creationSiteId;
	}

	/**
	 * @param creationSiteId the creationSiteId to set
	 */
	public void setCreationSiteId(String creationSiteId) {
		this.creationSiteId = creationSiteId;
	}

	/**
	 * @return the creditCardAuthorizationAttempts
	 */
	public Integer getCreditCardAuthorizationAttempts() {
		return creditCardAuthorizationAttempts;
	}

	/**
	 * @param creditCardAuthorizationAttempts the creditCardAuthorizationAttempts to set
	 */
	public void setCreditCardAuthorizationAttempts(Integer creditCardAuthorizationAttempts) {
		this.creditCardAuthorizationAttempts = creditCardAuthorizationAttempts;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the ecometryOrderNumber
	 */
	public String getEcometryOrderNumber() {
		return ecometryOrderNumber;
	}

	/**
	 * @param ecometryOrderNumber the ecometryOrderNumber to set
	 */
	public void setEcometryOrderNumber(String ecometryOrderNumber) {
		this.ecometryOrderNumber = ecometryOrderNumber;
	}

	/**
	 * @return the ecometryResponse
	 */
	public String getEcometryResponse() {
		return ecometryResponse;
	}

	/**
	 * @param ecometryResponse the ecometryResponse to set
	 */
	public void setEcometryResponse(String ecometryResponse) {
		this.ecometryResponse = ecometryResponse;
	}

	/**
	 * @return the explicitlySaved
	 */
	public Boolean getExplicitlySaved() {
		return explicitlySaved;
	}

	/**
	 * @param explicitlySaved the explicitlySaved to set
	 */
	public void setExplicitlySaved(Boolean explicitlySaved) {
		this.explicitlySaved = explicitlySaved;
	}

	/**
	 * @return the giftCardNumber
	 */
	public String getGiftCardNumber() {
		return giftCardNumber;
	}

	/**
	 * @param giftCardNumber the giftCardNumber to set
	 */
	public void setGiftCardNumber(String giftCardNumber) {
		this.giftCardNumber = giftCardNumber;
	}

	/**
	 * @return the gwp
	 */
	public Boolean getGwp() {
		return gwp;
	}

	/**
	 * @param gwp the gwp to set
	 */
	public void setGwp(Boolean gwp) {
		this.gwp = gwp;
	}

	/**
	 * @return the gwpMarkers
	 */
	public Set<Object>	 getGwpMarkers() {
		return gwpMarkers;
	}

	/**
	 * @param gwpMarkers the gwpMarkers to set
	 */
	public void setGwpMarkers(Set<Object>	 gwpMarkers) {
		this.gwpMarkers = gwpMarkers;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the jSessionId
	 */
	public String getjSessionId() {
		return jSessionId;
	}

	/**
	 * @param jSessionId the jSessionId to set
	 */
	public void setjSessionId(String jSessionId) {
		this.jSessionId = jSessionId;
	}

	/**
	 * @return the lastModifiedDate
	 */
	public Long getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * @param lastModifiedDate the lastModifiedDate to set
	 */
	public void setLastModifiedDate(Long lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	/**
	 * @return the manualAdjustments
	 */
	public List<Object> getManualAdjustments() {
		return manualAdjustments;
	}

	/**
	 * @param manualAdjustments the manualAdjustments to set
	 */
	public void setManualAdjustments(List<Object> manualAdjustments) {
		this.manualAdjustments = manualAdjustments;
	}

	/**
	 * @return the paymentGroups
	 */
	public List<Object> getPaymentGroups() {
		return paymentGroups;
	}

	/**
	 * @param paymentGroups the paymentGroups to set
	 */
	public void setPaymentGroups(List<Object> paymentGroups) {
		this.paymentGroups = paymentGroups;
	}

	/**
	 * @return the priceInfo
	 */
	public Object getPriceInfo() {
		return priceInfo;
	}

	/**
	 * @param priceInfo the priceInfo to set
	 */
	public void setPriceInfo(Object priceInfo) {
		this.priceInfo = priceInfo;
	}

	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	/**
	 * @return the promotionCode
	 */
	public String getPromotionCode() {
		return promotionCode;
	}

	/**
	 * @param promotionCode the promotionCode to set
	 */
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	/**
	 * @return the relatedOrders
	 */
	public List<Object> getRelatedOrders() {
		return relatedOrders;
	}

	/**
	 * @param relatedOrders the relatedOrders to set
	 */
	public void setRelatedOrders(List<Object> relatedOrders) {
		this.relatedOrders = relatedOrders;
	}

	/**
	 * @return the reservationStatus
	 */
	public List<Object> getReservationStatus() {
		return reservationStatus;
	}

	/**
	 * @param reservationStatus the reservationStatus to set
	 */
	public void setReservationStatus(List<Object> reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	/**
	 * @return the shippingGroups
	 */
	public List<Object> getShippingGroups() {
		return shippingGroups;
	}

	/**
	 * @param shippingGroups the shippingGroups to set
	 */
	public void setShippingGroups(List<Object> shippingGroups) {
		this.shippingGroups = shippingGroups;
	}

	/**
	 * @return the siteId
	 */
	public String getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the specialInstructions
	 */
	public Map<String, Object> getSpecialInstructions() {
		return specialInstructions;
	}

	/**
	 * @param specialInstructions the specialInstructions to set
	 */
	public void setSpecialInstructions(Map<String, Object> specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the sterlingOrderNumber
	 */
	public String getSterlingOrderNumber() {
		return sterlingOrderNumber;
	}

	/**
	 * @param sterlingOrderNumber the sterlingOrderNumber to set
	 */
	public void setSterlingOrderNumber(String sterlingOrderNumber) {
		this.sterlingOrderNumber = sterlingOrderNumber;
	}

	/**
	 * @return the submittedDate
	 */
	public Long getSubmittedDate() {
		return submittedDate;
	}

	/**
	 * @param submittedDate the submittedDate to set
	 */
	public void setSubmittedDate(Long submittedDate) {
		this.submittedDate = submittedDate;
	}

	/**
	 * @return the taxPriceInfo
	 */
	public Object getTaxPriceInfo() {
		return taxPriceInfo;
	}

	/**
	 * @param taxPriceInfo the taxPriceInfo to set
	 */
	public void setTaxPriceInfo(Object taxPriceInfo) {
		this.taxPriceInfo = taxPriceInfo;
	}

	/**
	 * @return the cartCount
	 */
	public Long getCartCount() {
		return cartCount;
	}

	/**
	 * @param cartCount the cartCount to set
	 */
	public void setCartCount(Long cartCount) {
		this.cartCount = cartCount;
	}

	/**
	 * @return the orderLineItemCountCustomProperty
	 */
	public Object getOrderLineItemCountCustomProperty() {
		return orderLineItemCountCustomProperty;
	}

	/**
	 * @param orderLineItemCountCustomProperty the orderLineItemCountCustomProperty to set
	 */
	public void setOrderLineItemCountCustomProperty(Object orderLineItemCountCustomProperty) {
		this.orderLineItemCountCustomProperty = orderLineItemCountCustomProperty;
	}

	/**
	 * @return the orderMessagesCustomProperty
	 */
	public Object getOrderMessagesCustomProperty() {
		return orderMessagesCustomProperty;
	}

	/**
	 * @param orderMessagesCustomProperty the orderMessagesCustomProperty to set
	 */
	public void setOrderMessagesCustomProperty(Object orderMessagesCustomProperty) {
		this.orderMessagesCustomProperty = orderMessagesCustomProperty;
	}


}
