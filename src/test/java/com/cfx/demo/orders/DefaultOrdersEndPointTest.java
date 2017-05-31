package com.cfx.demo.orders;

import static org.junit.Assert.*;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.allstate.services.order.ObjectFactory;
import com.allstate.services.order.OrderInqueryResponse;
import com.allstate.services.order.OrderInqueryType;
import com.allstate.services.orders.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-bean.xml"})
public class DefaultOrdersEndPointTest {
	
	@Autowired
	private JaxWsProxyFactoryBean testOrdersClient;
	
	private Orders orderServices;
	private OrderInqueryType orderInqueryType;

	@Before
	public void setUp() throws Exception {
		orderServices = testOrdersClient.create(Orders.class);
		ObjectFactory objFactory = new ObjectFactory();
		orderInqueryType = objFactory.createOrderInqueryType();
		orderInqueryType.setAccountId(999);
		orderInqueryType.setOrderQuantity(4);
		orderInqueryType.setEna13(93213);
		orderInqueryType.setUniqueOrderId(12345);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessOrderPlacement() {
		
		OrderInqueryResponse response = orderServices.processOrderPlacement(orderInqueryType);
		assertTrue(response.getAccount().getAccountId()== 999);
		
		
	}

}
