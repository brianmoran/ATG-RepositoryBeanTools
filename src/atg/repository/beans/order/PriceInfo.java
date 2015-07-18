package atg.repository.beans.order;

import java.util.List;
import java.util.Map;

import atg.repository.beans.BeanProperty;

public class PriceInfo {

    @BeanProperty(propertyName = "adjustments")
    public List<Object> adjustments;

    @BeanProperty(propertyName = "amount")
    public Double amount;

    @BeanProperty(propertyName = "amountIsFinal")
    public Boolean amountIsFinal;

    @BeanProperty(propertyName = "currencyCode")
    public String currencyCode;

    @BeanProperty(propertyName = "currentPriceDetails")
    public List<Object> currentPriceDetails;

    @BeanProperty(propertyName = "discounted")
    public Boolean discounted;

    @BeanProperty(propertyName = "dutyAmount")
    public Double dutyAmount;

    @BeanProperty(propertyName = "freight")
    public Double freight;

    @BeanProperty(propertyName = "listPrice")
    public Double listPrice;

    @BeanProperty(propertyName = "manualAdjustmentTotal")
    public Double manualAdjustmentTotal;

    @BeanProperty(propertyName = "nonTaxableShippingItemsSubtotalPriceInfos")
    public Map<String, Object> nonTaxableShippingItemsSubtotalPriceInfos;

    @BeanProperty(propertyName = "onSale")
    public Boolean onSale;

    @BeanProperty(propertyName = "orderDiscountShare")
    public Double orderDiscountShare;

    @BeanProperty(propertyName = "overweightCharge")
    public Double overweightCharge;

    @BeanProperty(propertyName = "priceList")
    public Object priceList;

    @BeanProperty(propertyName = "quantityDiscounted")
    public Long quantityDiscounted;

    @BeanProperty(propertyName = "rawSubtotal")
    public Double rawSubTotal;

    @BeanProperty(propertyName = "rawTotalPrice")
    public Double rawTotalPrice;

    @BeanProperty(propertyName = "salePrice")
    public Double salePrice;

    @BeanProperty(propertyName = "shipping")
    public Double shipping;

    @BeanProperty(propertyName = "shippingChargeAmount")
    public Double shippingChargeAmount;

    @BeanProperty(propertyName = "shippingItemsSubtotalPriceInfos")
    public Map<String, Object> shippingItemsSubtotalPriceInfos;

    @BeanProperty(propertyName = "tax")
    public Double tax;

    @BeanProperty(propertyName = "taxableShippingItemsSubtotalPriceInfos")
    public Double taxableShippingItemsSubtotalPriceInfos;

    @BeanProperty(propertyName = "type")
    public String type;

    public List<Object> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Object> adjustments) {
        this.adjustments = adjustments;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean isAmountIsFinal() {
        return amountIsFinal;
    }

    public void setAmountIsFinal(Boolean amountIsFinal) {
        this.amountIsFinal = amountIsFinal;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<Object> getCurrentPriceDetails() {
        return currentPriceDetails;
    }

    public void setCurrentPriceDetails(List<Object> currentPriceDetails) {
        this.currentPriceDetails = currentPriceDetails;
    }

    public Boolean isDiscounted() {
        return discounted;
    }

    public void setDiscounted(Boolean discounted) {
        this.discounted = discounted;
    }

    public Double getDutyAmount() {
        return dutyAmount;
    }

    public void setDutyAmount(Double dutyAmount) {
        this.dutyAmount = dutyAmount;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getManualAdjustmentTotal() {
        return manualAdjustmentTotal;
    }

    public void setManualAdjustmentTotal(Double manualAdjustmentTotal) {
        this.manualAdjustmentTotal = manualAdjustmentTotal;
    }

    public Map<String, Object> getNonTaxableShippingItemsSubtotalPriceInfos() {
        return nonTaxableShippingItemsSubtotalPriceInfos;
    }

    public void setNonTaxableShippingItemsSubtotalPriceInfos(Map<String, Object> nonTaxableShippingItemsSubtotalPriceInfos) {
        this.nonTaxableShippingItemsSubtotalPriceInfos = nonTaxableShippingItemsSubtotalPriceInfos;
    }

    public Boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public Double getOrderDiscountShare() {
        return orderDiscountShare;
    }

    public void setOrderDiscountShare(Double orderDiscountShare) {
        this.orderDiscountShare = orderDiscountShare;
    }

    public Double getOverweightCharge() {
        return overweightCharge;
    }

    public void setOverweightCharge(Double overweightCharge) {
        this.overweightCharge = overweightCharge;
    }

    public Object getPriceList() {
        return priceList;
    }

    public void setPriceList(Object priceList) {
        this.priceList = priceList;
    }

    public Long getQuantityDiscounted() {
        return quantityDiscounted;
    }

    public void setQuantityDiscounted(Long quantityDiscounted) {
        this.quantityDiscounted = quantityDiscounted;
    }

    public Double getRawSubTotal() {
        return rawSubTotal;
    }

    public void setRawSubTotal(Double rawSubTotal) {
        this.rawSubTotal = rawSubTotal;
    }

    public Double getRawTotalPrice() {
        return rawTotalPrice;
    }

    public void setRawTotalPrice(Double rawTotalPrice) {
        this.rawTotalPrice = rawTotalPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getShipping() {
        return shipping;
    }

    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }

    public Double getShippingChargeAmount() {
        return shippingChargeAmount;
    }

    public void setShippingChargeAmount(Double shippingChargeAmount) {
        this.shippingChargeAmount = shippingChargeAmount;
    }

    public Map<String, Object> getShippingItemsSubtotalPriceInfos() {
        return shippingItemsSubtotalPriceInfos;
    }

    public void setShippingItemsSubtotalPriceInfos(Map<String, Object> shippingItemsSubtotalPriceInfos) {
        this.shippingItemsSubtotalPriceInfos = shippingItemsSubtotalPriceInfos;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTaxableShippingItemsSubtotalPriceInfos() {
        return taxableShippingItemsSubtotalPriceInfos;
    }

    public void setTaxableShippingItemsSubtotalPriceInfos(Double taxableShippingItemsSubtotalPriceInfos) {
        this.taxableShippingItemsSubtotalPriceInfos = taxableShippingItemsSubtotalPriceInfos;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
