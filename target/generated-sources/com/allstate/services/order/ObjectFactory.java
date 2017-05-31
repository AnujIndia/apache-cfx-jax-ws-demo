
package com.allstate.services.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.allstate.services.order package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderInquery_QNAME = new QName("http://www.allstate.com/services/Order", "orderInquery");
    private final static QName _OrderInqueryResponse_QNAME = new QName("http://www.allstate.com/services/Order", "orderInqueryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.allstate.services.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link OrderInqueryResponse }
     * 
     */
    public OrderInqueryResponse createOrderInqueryResponse() {
        return new OrderInqueryResponse();
    }

    /**
     * Create an instance of {@link OrderInqueryType }
     * 
     */
    public OrderInqueryType createOrderInqueryType() {
        return new OrderInqueryType();
    }

    /**
     * Create an instance of {@link OrderItemType }
     * 
     */
    public OrderItemType createOrderItemType() {
        return new OrderItemType();
    }

    /**
     * Create an instance of {@link BookType }
     * 
     */
    public BookType createBookType() {
        return new BookType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInqueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.allstate.com/services/Order", name = "orderInquery")
    public JAXBElement<OrderInqueryType> createOrderInquery(OrderInqueryType value) {
        return new JAXBElement<OrderInqueryType>(_OrderInquery_QNAME, OrderInqueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInqueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.allstate.com/services/Order", name = "orderInqueryResponse")
    public JAXBElement<OrderInqueryResponse> createOrderInqueryResponse(OrderInqueryResponse value) {
        return new JAXBElement<OrderInqueryResponse>(_OrderInqueryResponse_QNAME, OrderInqueryResponse.class, null, value);
    }

}
