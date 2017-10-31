package com.au.challenge.database;

import java.util.HashMap;
import java.util.Map;

import com.au.challenge.customers.Customer;
import com.au.challenge.orders.Order;
import com.au.challenge.products.Product;

public class DatabaseClass {
	
	private static Map<Long, Customer> customers= new HashMap<Long, Customer>();
	private static Map<Long, Order> orders= new HashMap<Long, Order>();
	private static Map<Long, Product> products= new HashMap<Long, Product>();
	
	public static Map<Long, Customer> getCustomers() {
		return customers;
	}
	
	public static Map<Long, Order> getOrders() {
		return orders;
	}
	
	public static Map<Long, Product> getProducts() {
		return products;
	}
	
}
