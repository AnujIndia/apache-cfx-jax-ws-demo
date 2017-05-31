package com.cfx.demo.orders;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.StaxOutInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

public class OrderServiceSoapHeaderOutIntercepter extends
		AbstractSoapInterceptor {

	public OrderServiceSoapHeaderOutIntercepter() {
		super(Phase.WRITE); 
	
	}
	
	public OrderServiceSoapHeaderOutIntercepter(String p) {
		super(Phase.WRITE); 
		this.addBefore(StaxOutInterceptor.class.getName());
	
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		QName qname = new QName("http://www.allstate.com/services/Orders/", "apikey");
		SoapHeader header = (SoapHeader) message.getHeader(qname);
		String apikey = ((Element) header.getObject()).getTextContent();
		System.err.println("API Key - " + apikey);

	}

}
