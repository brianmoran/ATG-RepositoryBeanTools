package atg.repository.beans.giftlist;

import java.util.List;
import java.util.Map;

import atg.repository.beans.BeanProperty;

public class Giftlist {

    @BeanProperty(propertyName = "comments")
    public String comments;

    @BeanProperty(propertyName = "creationDate")
    public Long creationDate;

    @BeanProperty(propertyName = "description")
    public String description;

    @BeanProperty(propertyName = "eventDate")
    public Long eventDate;

    @BeanProperty(propertyName = "eventName")
    public String eventName;

    @BeanProperty(propertyName = "eventType")
    public String eventType;

    @BeanProperty(propertyName = "giftlistItems")
    public List<Object> giftlistItems;

    @BeanProperty(propertyName = "id")
    public String id;

    @BeanProperty(propertyName = "instructions")
    public String instructions;

    @BeanProperty(propertyName = "lastModifiedDate")
    public Long lastModifiedDate;

    @BeanProperty(propertyName = "shippingAddress", repositoryItem = "contactInfo")
    public Object shippingAddress;

    @BeanProperty(propertyName = "siteId")
    public String siteId;

    @BeanProperty(propertyName = "specialInstructions")
    public Map<String, Object> specialInstructions;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public Long getEventDate() {
        return eventDate;
    }

    public void setEventDate(Long eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public List<Object> getGiftlistItems() {
        return giftlistItems;
    }

    public void setGiftlistItems(List<Object> giftlistItems) {
        this.giftlistItems = giftlistItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Object getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Object shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Map<String, Object> getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(Map<String, Object> specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

}
