package atg.repository.beans.profile;


import java.util.List;
import java.util.Map;
import java.util.Set;


import atg.repository.beans.BeanProperty;

public class User {
	@BeanProperty(propertyName = "activePromotions")
	public List<Object>			activePromotions;

	@BeanProperty(propertyName = "allCreditCards")
	public Map<String, Object>	allCreditCards;

	@BeanProperty(propertyName = "allowPartialShipment")
	public Boolean				allowPartialShipment;

	@BeanProperty(propertyName = "allSecondaryAddresses", repositoryItem = "contactInfo")
	public Map<String, Object>	allSecondaryAddresses;

	@BeanProperty(propertyName = "autoLogin")
	public Boolean				autoLogin;

	@BeanProperty(propertyName = "billingAddress", repositoryItem = "contactInfo")
	public Object				billingAddress;

	@BeanProperty(propertyName = "creditCards")
	public Map<String, Object>	creditCards;

	@BeanProperty(propertyName = "currentLocation")
	public String				currentLocation;

	@BeanProperty(propertyName = "customerId")
	public String				customerId;

	@BeanProperty(propertyName = "dateOfBirth")
	public Long					dateOfBirth;

	@BeanProperty(propertyName = "daytimeTelephoneNumber")
	public String				daytimeTelephoneNumber;

	@BeanProperty(propertyName = "defaultCarrier")
	public String				defaultCarrier;

	@BeanProperty(propertyName = "defaultCreditCard")
	public Object				defaultCreditCard;

	@BeanProperty(propertyName = "description")
	public String				description;

	@BeanProperty(propertyName = "email")
	public String				email;

	@BeanProperty(propertyName = "emailStatus")
	public String				emailStatus;

	@BeanProperty(propertyName = "employeeId")
	public String				employeeId;

	@BeanProperty(propertyName = "entries")
	public List<Object>			entries;

	@BeanProperty(propertyName = "expressCheckout")
	public Boolean				expressCheckout;

	@BeanProperty(propertyName = "firstName")
	public String				firstName;

	@BeanProperty(propertyName = "gender")
	public String				gender;

	@BeanProperty(propertyName = "giftlist", repositoryItem = "gift-list")
	public Object				giftlist;

	@BeanProperty(propertyName = "giftlistAddresses")
	public Map<String, Object>	giftlistAddresses;

	@BeanProperty(propertyName = "giftlists", repositoryItem = "gift-list")
	public List<Object>			giftlists;

	@BeanProperty(propertyName = "guest")
	public Boolean				guest;

	@BeanProperty(propertyName = "guestUserStatus")
	public String				guestUserStatus;

	@BeanProperty(propertyName = "homeAddress", repositoryItem = "contactInfo")
	public Object				homeAddress;

	@BeanProperty(propertyName = "id")
	public String				id;

	@BeanProperty(propertyName = "lastName")
	public String				lastName;

	@BeanProperty(propertyName = "locale")
	public String				locale;

	@BeanProperty(propertyName = "login")
	public String				login;

	@BeanProperty(propertyName = "loyaltyId")
	public String				loyaltyId;

	@BeanProperty(propertyName = "middleName")
	public String				middleName;

	@BeanProperty(propertyName = "optInEmail")
	public Boolean				optInEmail;

	@BeanProperty(propertyName = "orderListing")
	public String				orderListing;

	@BeanProperty(propertyName = "orderPriceLimit")
	public String				orderPriceLimit;

	@BeanProperty(propertyName = "otherGiftlists")
	public List<Object>			otherGiftlists;

	@BeanProperty(propertyName = "preferredLanguage")
	public String				preferredLanguage;

	@BeanProperty(propertyName = "promoCode")
	public String				promoCode;

	@BeanProperty(propertyName = "receiveEmail")
	public String				receiveEmail;

	@BeanProperty(propertyName = "registrationDate")
	public Long			registrationDate;

	@BeanProperty(propertyName = "secondaryAddresses", repositoryItem = "contactInfo")
	public Map<String, Object>	secondaryAddresses;

	@BeanProperty(propertyName = "securityStatus")
	public Integer				securityStatus;

	@BeanProperty(propertyName = "shippingAddress", repositoryItem = "contactInfo")
	public Object				shippingAddress;

	@BeanProperty(propertyName = "type")
	public String				type;

	@BeanProperty(propertyName = "usedPromotions")
	public Set<Object>			usedPromotions;

	@BeanProperty(propertyName = "userType")
	public Integer				userType;

	@BeanProperty(propertyName = "wishlist", repositoryItem = "gift-list")
	public Object				wishlist;

	public List<Object> getActivePromotions() {
		return activePromotions;
	}

	public void setActivePromotions(List<Object> activePromotions) {
		this.activePromotions = activePromotions;
	}

	public Map<String, Object> getAllCreditCards() {
		return allCreditCards;
	}

	public void setAllCreditCards(Map<String, Object> allCreditCards) {
		this.allCreditCards = allCreditCards;
	}

	public Boolean isAllowPartialShipment() {
		return allowPartialShipment;
	}

	public void setAllowPartialShipment(Boolean allowPartialShipment) {
		this.allowPartialShipment = allowPartialShipment;
	}

	public Map<String, Object> getAllSecondaryAddresses() {
		return allSecondaryAddresses;
	}

	public void setAllSecondaryAddresses(Map<String, Object> allSecondaryAddresses) {
		this.allSecondaryAddresses = allSecondaryAddresses;
	}

	public Boolean isAutoLogin() {
		return autoLogin;
	}

	public void setAutoLogin(Boolean autoLogin) {
		this.autoLogin = autoLogin;
	}

	public Object getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Map<String, Object> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(Map<String, Object> creditCards) {
		this.creditCards = creditCards;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Long getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDaytimeTelephoneNumber() {
		return daytimeTelephoneNumber;
	}

	public void setDaytimeTelephoneNumber(String daytimeTelephoneNumber) {
		this.daytimeTelephoneNumber = daytimeTelephoneNumber;
	}

	public String getDefaultCarrier() {
		return defaultCarrier;
	}

	public void setDefaultCarrier(String defaultCarrier) {
		this.defaultCarrier = defaultCarrier;
	}

	public Object getDefaultCreditCard() {
		return defaultCreditCard;
	}

	public void setDefaultCreditCard(Object defaultCreditCard) {
		this.defaultCreditCard = defaultCreditCard;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public List<Object> getEntries() {
		return entries;
	}

	public void setEntries(List<Object> entries) {
		this.entries = entries;
	}

	public Boolean isExpressCheckout() {
		return expressCheckout;
	}

	public void setExpressCheckout(Boolean expressCheckout) {
		this.expressCheckout = expressCheckout;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Object getGiftlist() {
		return giftlist;
	}

	public void setGiftlist(Object giftlist) {
		this.giftlist = giftlist;
	}

	public Map<String, Object> getGiftlistAddresses() {
		return giftlistAddresses;
	}

	public void setGiftlistAddresses(Map<String, Object> giftlistAddresses) {
		this.giftlistAddresses = giftlistAddresses;
	}

	public List<Object> getGiftlists() {
		return giftlists;
	}

	public void setGiftlists(List<Object> giftlists) {
		this.giftlists = giftlists;
	}

	public Boolean isGuest() {
		return guest;
	}

	public void setGuest(Boolean guest) {
		this.guest = guest;
	}

	public String getGuestUserStatus() {
		return guestUserStatus;
	}

	public void setGuestUserStatus(String guestUserStatus) {
		this.guestUserStatus = guestUserStatus;
	}

	public Object getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Object homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLoyaltyId() {
		return loyaltyId;
	}

	public void setLoyaltyId(String loyaltyId) {
		this.loyaltyId = loyaltyId;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Boolean isOptInEmail() {
		return optInEmail;
	}

	public void setOptInEmail(Boolean optInEmail) {
		this.optInEmail = optInEmail;
	}

	public String getOrderListing() {
		return orderListing;
	}

	public void setOrderListing(String orderListing) {
		this.orderListing = orderListing;
	}

	public String getOrderPriceLimit() {
		return orderPriceLimit;
	}

	public void setOrderPriceLimit(String orderPriceLimit) {
		this.orderPriceLimit = orderPriceLimit;
	}

	public List<Object> getOtherGiftlists() {
		return otherGiftlists;
	}

	public void setOtherGiftlists(List<Object> otherGiftlists) {
		this.otherGiftlists = otherGiftlists;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getReceiveEmail() {
		return receiveEmail;
	}

	public void setReceiveEmail(String receiveEmail) {
		this.receiveEmail = receiveEmail;
	}

	public Long getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Long registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Map<String, Object> getSecondaryAddresses() {
		return secondaryAddresses;
	}

	public void setSecondaryAddresses(Map<String, Object> secondaryAddresses) {
		this.secondaryAddresses = secondaryAddresses;
	}

	public Integer getSecurityStatus() {
		return securityStatus;
	}

	public void setSecurityStatus(Integer securityStatus) {
		this.securityStatus = securityStatus;
	}

	public Object getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Object shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<Object> getUsedPromotions() {
		return usedPromotions;
	}

	public void setUsedPromotions(Set<Object> usedPromotions) {
		this.usedPromotions = usedPromotions;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Object getWishlist() {
		return wishlist;
	}

	public void setWishlist(Object wishlist) {
		this.wishlist = wishlist;
	}
}
