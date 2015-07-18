package atg.repository.beans.profile;

import atg.repository.beans.BeanProperty;

public class ContactInfo {

	@BeanProperty(propertyName = "address1")
	public String	address1;

	@BeanProperty(propertyName = "address2")
	public String	address2;

	@BeanProperty(propertyName = "address3")
	public String	address3;

	@BeanProperty(propertyName = "altPhoneNumber")
	public String	altPhoneNumber;

	@BeanProperty(propertyName = "city")
	public String	city;

	@BeanProperty(propertyName = "companyName")
	public String	companyName;

	@BeanProperty(propertyName = "country")
	public String	country;

	@BeanProperty(propertyName = "county")
	public String	county;

	@BeanProperty(propertyName = "faxNumber")
	public String	faxNumber;

	@BeanProperty(propertyName = "firstName")
	public String	firstName;

	@BeanProperty(propertyName = "id")
	public String	id;

	@BeanProperty(propertyName = "lastName")
	public String	lastName;

	@BeanProperty(propertyName = "middleName")
	public String	middleName;

	@BeanProperty(propertyName = "phoneNumber")
	public String	phoneNumber;

	@BeanProperty(propertyName = "postalCode")
	public String	postalCode;

	@BeanProperty(propertyName = "state")
	public String	state;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAltPhoneNumber() {
		return altPhoneNumber;
	}

	public void setAltPhoneNumber(String altPhoneNumber) {
		this.altPhoneNumber = altPhoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
