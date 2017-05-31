package com.cfx.demo.orders;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.allstate.services.order.AccountType;
import com.allstate.services.order.BookType;
import com.allstate.services.order.ObjectFactory;
import com.allstate.services.order.OrderInqueryResponse;
import com.allstate.services.order.OrderItemType;
import com.allstate.services.order.OrderStatusType;
import com.allstate.services.order.OrderType;

@Service
public class DefaultOrderService implements OrderService {

	@Override
	public OrderInqueryResponse processOrder(int uniqueOrderId,
			int orderQuantity, int accountId, double ena13) {
		ObjectFactory objFactory = new ObjectFactory();
		OrderInqueryResponse response = objFactory.createOrderInqueryResponse();
		AccountType objAccountType = objFactory.createAccountType();
		objAccountType.setAccountId(accountId);
		response.setAccount(objAccountType);

		OrderItemType objOrderItemType = objFactory.createOrderItemType();
		BookType objBookType = objFactory.createBookType();
		objBookType.setEan13(ena13);
		objBookType.setTitile("A CFX Book");
		objOrderItemType.setBook(objBookType);

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date(System.currentTimeMillis()));
		try {
			XMLGregorianCalendar objxmlcal = javax.xml.datatype.DatatypeFactory
					.newInstance().newXMLGregorianCalendar(cal);
			
			objOrderItemType.setExpectedShipmentDate(objxmlcal);
			objOrderItemType.setLineNumber(Integer.valueOf(1));
			objOrderItemType.setPrice(new BigDecimal(5));
			objOrderItemType.setQuantityShipped(orderQuantity);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		OrderType objOrderType = objFactory.createOrderType();
		objOrderType.setOrderItems(objOrderItemType);
		objOrderType.setOrderStatus(OrderStatusType.READY);
		response.setOrder(objOrderType);
		return response;

	}

}
