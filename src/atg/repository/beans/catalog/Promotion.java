package atg.repository.beans.catalog;

import java.util.Map;
import java.util.Set;

import atg.repository.beans.BeanProperty;

public class Promotion {

	@BeanProperty(propertyName = "allowMultiple")
	public Boolean allowMultipleUses;

	@BeanProperty(propertyName = "beginUsable")
	public Long beginUsable;

	@BeanProperty(propertyName = "closenessQualifiers")
	public Set<Object> closenessQualifiers;

	@BeanProperty(propertyName = "creationDate")
	public Long creationDate;

	@BeanProperty(propertyName = "description")
	public String description;

	@BeanProperty(propertyName = "displayName")
	public String displayName;

	@BeanProperty(propertyName = "enabled")
	public Boolean enabled;

	@BeanProperty(propertyName = "endDate")
	public Long endDate;

	@BeanProperty(propertyName = "endUsable")
	public Long endUsable;

	@BeanProperty(propertyName = "evaluateTargetItemsFirst")
	public Boolean evaluateTargetItemsFirst;

	@BeanProperty(propertyName = "excludedPromotions")
	public Set<Object> excludedPromotions;

	@BeanProperty(propertyName = "giveToAnonymousProfiles")
	public Boolean giveToAnonymousProfiles;

	@BeanProperty(propertyName = "global")
	public Boolean globalPromotions;

	@BeanProperty(propertyName = "id")
	public String id;

	@BeanProperty(propertyName = "includedPromotions")
	public Set<Object> includedPromotions;

	@BeanProperty(propertyName = "lastModified")
	public Long lastModifiedDate;

	@BeanProperty(propertyName = "media")
	public Map<String, Object> media;

	@BeanProperty(propertyName = "parentFolder")
	public Object parentFolder;

	@BeanProperty(propertyName = "pmdlRule")
	public String pmdlRule;

	@BeanProperty(propertyName = "priority")
	public Integer priority;

	@BeanProperty(propertyName = "qualifierService")
	public String qualifierService;

	@BeanProperty(propertyName = "relativeExpiration")
	public Boolean relativeExpirationDate;

	@BeanProperty(propertyName = "siteGroups")
	public Set<Object> siteGroups;

	@BeanProperty(propertyName = "sites")
	public Set<Object> sites;

	@BeanProperty(propertyName = "stackingRule")
	public Object stackingRule;

	@BeanProperty(propertyName = "startDate")
	public Long startDate;

	@BeanProperty(propertyName = "template")
	public String template;

	@BeanProperty(propertyName = "templateValues")
	public Map<String, Object> templateValues;

	@BeanProperty(propertyName = "timeUntilExpire")
	public Integer timeUntilExpire;

	@BeanProperty(propertyName = "type")
	public Integer type;

	@BeanProperty(propertyName = "uiAccessLevel")
	public String accessLevel;

	@BeanProperty(propertyName = "uses")
	public Integer usesPerProfile;

	@BeanProperty(propertyName = "version")
	public Integer version;

	public Boolean getAllowMultipleUses() {
		return allowMultipleUses;
	}

	public void setAllowMultipleUses(Boolean allowMultipleUses) {
		this.allowMultipleUses = allowMultipleUses;
	}

	public Long getBeginUsable() {
		return beginUsable;
	}

	public void setBeginUsable(Long beginUsable) {
		this.beginUsable = beginUsable;
	}

	public Set<Object> getClosenessQualifiers() {
		return closenessQualifiers;
	}

	public void setClosenessQualifiers(Set<Object> closenessQualifiers) {
		this.closenessQualifiers = closenessQualifiers;
	}

	public Long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Long creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Long getEndDate() {
		return endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}

	public Long getEndUsable() {
		return endUsable;
	}

	public void setEndUsable(Long endUsable) {
		this.endUsable = endUsable;
	}

	public Boolean getEvaluateTargetItemsFirst() {
		return evaluateTargetItemsFirst;
	}

	public void setEvaluateTargetItemsFirst(Boolean evaluateTargetItemsFirst) {
		this.evaluateTargetItemsFirst = evaluateTargetItemsFirst;
	}

	public Set<Object> getExcludedPromotions() {
		return excludedPromotions;
	}

	public void setExcludedPromotions(Set<Object> excludedPromotions) {
		this.excludedPromotions = excludedPromotions;
	}

	public Boolean getGiveToAnonymousProfiles() {
		return giveToAnonymousProfiles;
	}

	public void setGiveToAnonymousProfiles(Boolean giveToAnonymousProfiles) {
		this.giveToAnonymousProfiles = giveToAnonymousProfiles;
	}

	public Boolean getGlobalPromotions() {
		return globalPromotions;
	}

	public void setGlobalPromotions(Boolean globalPromotions) {
		this.globalPromotions = globalPromotions;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<Object> getIncludedPromotions() {
		return includedPromotions;
	}

	public void setIncludedPromotions(Set<Object> includedPromotions) {
		this.includedPromotions = includedPromotions;
	}

	public Long getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Long lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Map<String, Object> getMedia() {
		return media;
	}

	public void setMedia(Map<String, Object> media) {
		this.media = media;
	}

	public Object getParentFolder() {
		return parentFolder;
	}

	public void setParentFolder(Object parentFolder) {
		this.parentFolder = parentFolder;
	}

	public String getPmdlRule() {
		return pmdlRule;
	}

	public void setPmdlRule(String pmdlRule) {
		this.pmdlRule = pmdlRule;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getQualifierService() {
		return qualifierService;
	}

	public void setQualifierService(String qualifierService) {
		this.qualifierService = qualifierService;
	}

	public Boolean getRelativeExpirationDate() {
		return relativeExpirationDate;
	}

	public void setRelativeExpirationDate(Boolean relativeExpirationDate) {
		this.relativeExpirationDate = relativeExpirationDate;
	}

	public Set<Object> getSiteGroups() {
		return siteGroups;
	}

	public void setSiteGroups(Set<Object> siteGroups) {
		this.siteGroups = siteGroups;
	}

	public Set<Object> getSites() {
		return sites;
	}

	public void setSites(Set<Object> sites) {
		this.sites = sites;
	}

	public Object getStackingRule() {
		return stackingRule;
	}

	public void setStackingRule(Object stackingRule) {
		this.stackingRule = stackingRule;
	}

	public Long getStartDate() {
		return startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Map<String, Object> getTemplateValues() {
		return templateValues;
	}

	public void setTemplateValues(Map<String, Object> templateValues) {
		this.templateValues = templateValues;
	}

	public Integer getTimeUntilExpire() {
		return timeUntilExpire;
	}

	public void setTimeUntilExpire(Integer timeUntilExpire) {
		this.timeUntilExpire = timeUntilExpire;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public Integer getUsesPerProfile() {
		return usesPerProfile;
	}

	public void setUsesPerProfile(Integer usesPerProfile) {
		this.usesPerProfile = usesPerProfile;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
