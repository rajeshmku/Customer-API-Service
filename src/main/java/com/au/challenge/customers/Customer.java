package com.au.challenge.customers;

import java.util.List;

import com.au.challenge.orders.Order;

public class Customer {
	
	private String customerID;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Address mailingAddress;
	private Address permanentAddress;
	private List<Order> orders;
	
	public Customer() {
		
	}
	
	public Customer(String customerID, String firstName, String lastName, String phone, String email,
			Address mailingAddress, Address permanentAddress, List<Order> orders) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.mailingAddress = mailingAddress;
		this.permanentAddress = permanentAddress;
		this.orders = orders;
	}

	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getMailingAddress() {
		return mailingAddress;
	}
	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
