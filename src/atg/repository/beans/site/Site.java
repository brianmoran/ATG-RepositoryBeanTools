package atg.repository.beans.site;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import atg.repository.beans.BeanProperty;

public class Site {

    @BeanProperty(propertyName = "id")
    public String id;

    @BeanProperty(propertyName = "description")
    public String description;

    @BeanProperty(propertyName = "name")
    public String name;

    @BeanProperty(propertyName = "enabled")
    public Boolean enabled;

    @BeanProperty(propertyName = "siteName")
    public String siteName;

    @BeanProperty(propertyName = "productionURL")
    public String productionURL;

    @BeanProperty(propertyName = "brandCode")
    public String brandCode;

    @BeanProperty(propertyName = "brandCurrency")
    public String brandCurrency;

    @BeanProperty(propertyName = "creditCardTypes")
    public Set<Object> creditCardTypes;

    @BeanProperty(propertyName = "currencies")
    public List<Object> currencies;

    @BeanProperty(propertyName = "giftCardSupportedCurrencies")
    public List<String> giftCardSupportedCurrencies;

    // not set by mapper
    private Map<String, Object> brandConfig = new HashMap<String, Object>();

    public List<String> getGiftCardSupportedCurrencies() {
        return giftCardSupportedCurrencies;
    }

    public void setGiftCardSupportedCurrencies(List<String> giftCardSupportedCurrencies) {
        this.giftCardSupportedCurrencies = giftCardSupportedCurrencies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getProductionURL() {
        return productionURL;
    }

    public void setProductionURL(String productionURL) {
        this.productionURL = productionURL;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandCurrency() {
        return brandCurrency;
    }

    public void setBrandCurrency(String brandCurrency) {
        this.brandCurrency = brandCurrency;
    }

    public Set<Object> getCreditCardTypes() {
        return creditCardTypes;
    }

    public void setCreditCardTypes(Set<Object> creditCardTypes) {
        this.creditCardTypes = creditCardTypes;
    }

    public List<Object> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Object> currencies) {
        this.currencies = currencies;
    }

    public Map<String, Object> getBrandConfig() {
        return brandConfig;
    }

    public void setBrandConfig(Map<String, Object> brandConfig) {
        this.brandConfig = brandConfig;
    }
}
