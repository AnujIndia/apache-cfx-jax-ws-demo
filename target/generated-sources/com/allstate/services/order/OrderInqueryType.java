
package com.allstate.services.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderInqueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInqueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uniqueOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ena13" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInqueryType", propOrder = {
    "uniqueOrderId",
    "orderQuantity",
    "accountId",
    "ena13"
})
public class OrderInqueryType {

    protected int uniqueOrderId;
    protected int orderQuantity;
    protected int accountId;
    protected double ena13;

    /**
     * Gets the value of the uniqueOrderId property.
     * 
     */
    public int getUniqueOrderId() {
        return uniqueOrderId;
    }

    /**
     * Sets the value of the uniqueOrderId property.
     * 
     */
    public void setUniqueOrderId(int value) {
        this.uniqueOrderId = value;
    }

    /**
     * Gets the value of the orderQuantity property.
     * 
     */
    public int getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     */
    public void setOrderQuantity(int value) {
        this.orderQuantity = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the ena13 property.
     * 
     */
    public double getEna13() {
        return ena13;
    }

    /**
     * Sets the value of the ena13 property.
     * 
     */
    public void setEna13(double value) {
        this.ena13 = value;
    }

}
