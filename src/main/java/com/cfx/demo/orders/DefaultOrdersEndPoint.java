package com.cfx.demo.orders;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.allstate.services.order.AccountType;
import com.allstate.services.order.ObjectFactory;
import com.allstate.services.order.OrderInqueryResponse;
import com.allstate.services.order.OrderInqueryType;
import com.allstate.services.orders.Orders;

@WebService(portName = "OrdersSOAP", serviceName = "Orders", endpointInterface = "com.allstate.services.orders.Orders", targetNamespace = "http://www.allstate.com/services/Orders/")
public class DefaultOrdersEndPoint implements Orders {

	@Autowired
	private OrderService objOrderService;

	@Override
	public OrderInqueryResponse processOrderPlacement(
			OrderInqueryType orderInquery) {
		/*
		 * ObjectFactory objFactory = new ObjectFactory(); OrderInqueryResponse
		 * response = objFactory.createOrderInqueryResponse(); AccountType
		 * objAccountType = objFactory.createAccountType();
		 * objAccountType.setAccountId(1); response.setAccount(objAccountType);
		 * return response;
		 */
		OrderInqueryResponse response = objOrderService.processOrder(
				orderInquery.getUniqueOrderId(),
				orderInquery.getOrderQuantity(), orderInquery.getAccountId(),
				orderInquery.getEna13());

		return response;
	}

}
