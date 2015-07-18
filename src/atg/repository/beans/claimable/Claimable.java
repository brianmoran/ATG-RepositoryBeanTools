package atg.repository.beans.claimable;


import java.util.Set;

import atg.repository.beans.BeanProperty;

public class Claimable {

	@BeanProperty(propertyName = "displayName")
	public String couponName;

	@BeanProperty(propertyName = "encrypted")
	public Boolean encrypted;

	@BeanProperty(propertyName = "expirationDate")
	public Long expirationDate;

	@BeanProperty(propertyName = "id")
	public String id;

	@BeanProperty(propertyName = "lastModified")
	public Long lastModifiedDate;

	@BeanProperty(propertyName = "maxUses")
	public Integer maxUses;

	@BeanProperty(propertyName = "promotions")
	public Set<Object> promotions;

	@BeanProperty(propertyName = "status")
	public String status;

	@BeanProperty(propertyName = "startDate")
	public Long startDate;

	@BeanProperty(propertyName = "type")
	public Integer type;

	@BeanProperty(propertyName = "uses")
	public Integer uses;

	@BeanProperty(propertyName = "version")
	public Integer version;

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Boolean getEncrypted() {
		return encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
	}

	public Long getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Long expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Long lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Integer getMaxUses() {
		return maxUses;
	}

	public void setMaxUses(Integer maxUses) {
		this.maxUses = maxUses;
	}

	public Set<Object> getPromotions() {
		return promotions;
	}

	public void setPromotions(Set<Object> promotions) {
		this.promotions = promotions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getStartDate() {
		return startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getUses() {
		return uses;
	}

	public void setUses(Integer uses) {
		this.uses = uses;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
