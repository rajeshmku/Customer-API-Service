package com.au.challenge.orders;

import java.util.Date;

public class Order {
	
	private String id;
	private String customerId;
	private String productId;
	private String orderDesc;
	private String orderDate;
	private String orderStatus;
	
	public Order() {
		
	}
	
	public Order(String id, String customerId, String productId, String orderDesc, String orderDate, String orderStatus) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
		this.orderDesc = orderDesc;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}  
	
}
