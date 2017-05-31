
package com.allstate.services.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ean13" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="titile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookType", propOrder = {
    "ean13",
    "titile"
})
public class BookType {

    protected double ean13;
    @XmlElement(required = true)
    protected String titile;

    /**
     * Gets the value of the ean13 property.
     * 
     */
    public double getEan13() {
        return ean13;
    }

    /**
     * Sets the value of the ean13 property.
     * 
     */
    public void setEan13(double value) {
        this.ean13 = value;
    }

    /**
     * Gets the value of the titile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitile() {
        return titile;
    }

    /**
     * Sets the value of the titile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitile(String value) {
        this.titile = value;
    }

}
