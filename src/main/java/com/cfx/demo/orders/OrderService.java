package com.cfx.demo.orders;

import com.allstate.services.order.OrderInqueryResponse;

public interface OrderService {
	public OrderInqueryResponse processOrder(int uniqueOrderId,
			int orderQuantity, int accountId, double ena13);

}
