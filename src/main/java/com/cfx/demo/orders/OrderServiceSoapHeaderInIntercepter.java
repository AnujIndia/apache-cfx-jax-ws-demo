package com.cfx.demo.orders;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.phase.Phase;

public class OrderServiceSoapHeaderInIntercepter extends AbstractSoapInterceptor {

	public OrderServiceSoapHeaderInIntercepter() {
		super(Phase.USER_PROTOCOL);
	}
	public OrderServiceSoapHeaderInIntercepter(String p) {
		super(Phase.USER_PROTOCOL);
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		QName qname = new QName("http://www.allstate.com/services/Orders/", "apikey");
		
		String apikey = "a1b2c3d4e5";
		try {
			SoapHeader header = new SoapHeader(qname, apikey, new JAXBDataBinding(apikey.getClass()));
			message.getHeaders().add(header);
		} catch (Exception e) {
			throw new Fault(e);
		}
	}

}
