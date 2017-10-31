package com.au.challenge.customers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.au.challenge.orders.Order;

@Service
public class CustomerService {
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerService() {
		Address mailingAddress = getMailingAddress();
		Address permanentAddress = getPermanentAddress();
		List<Order> orders = new ArrayList<Order>();
		this.customers.add(new Customer("1","Rajesh","Andavan","0412325743","rajeshmku@gmail.com",mailingAddress,permanentAddress,getAppleOrders()));
		this.customers.add(new Customer("2","James","Vasanth","0412325743","James@gmail.com",mailingAddress,permanentAddress,getGoogleOrders()));
		this.customers.add(new Customer("3","Rose","Taylor","0412325743","Rose@gmail.com",mailingAddress,permanentAddress,getSamsungOrders()));
		this.customers.add(new Customer("4","Saran","Tiwari","0412325743","Saran@gmail.com",mailingAddress,permanentAddress,orders));
		this.customers.add(new Customer("5","Abdul","Rahmaan","0412325743","Abdul@gmail.com",mailingAddress,permanentAddress,orders));
	}
	
	@Cacheable("customers")
	public List<Customer> getCustomerList() {	
		return this.customers;
	}
	
	public Address getMailingAddress(){
		return new Address("16/14-16","Allen Street","Harris Park","Sydney","AUS",2150);
	}
	
	public Address getPermanentAddress() {
		return new Address("16/14-16","Allen Street","Harris Park","Sydney","AUS",2150);
	}
	
	public Customer getCustomer(String id) {
		try {
			return customers.stream().filter(t -> t.getCustomerID().equals(id)).findFirst().get();
		}
		catch(NoSuchElementException ex) {
			return null;
		}
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	public void updateCustomer(String id, Customer customer) {
		for(int i=0;i<this.customers.size();i++) {
			if(customers.get(i).getCustomerID().equals(customer.getCustomerID())) {
				this.customers.add(i, customer);
				return;
			}
		}
	}
	
	public void updateCustomerInstance(String id, Map<String, String> params) {
		Customer customer = this.customers.stream().filter(t -> t.getCustomerID().equals(id)).findFirst().get();
		params.entrySet().stream().forEach(param -> {
			if(param.getKey().equalsIgnoreCase("Email")) {
				customer.setEmail(param.getValue());
			}
			if(param.getKey().equalsIgnoreCase("FirstName")) {
				customer.setFirstName(param.getValue());
			}
			if(param.getKey().equalsIgnoreCase("LastName")) {
				customer.setLastName(param.getValue());
			}
			if(param.getKey().equalsIgnoreCase("Phone")) {
				customer.setPhone(param.getValue());
			}
		});
		updateCustomer(id, customer);
	}

	public void deleteCustomer(String id) {
		this.customers.removeIf(t -> t.getCustomerID().equals(id));
	}

	public List<Order> getCustomerOrders(String id) {
		Customer aCustomer = customers.stream().filter(t -> t.getCustomerID().equals(id)).findFirst().get();
		return aCustomer.getOrders();
	}
	
	public Order getCustomerOrderById(String id, String orderId) {
		Customer aCustomer = customers.stream().filter(t -> t.getCustomerID().equals(id)).findFirst().get();
		return aCustomer.getOrders().stream().filter(t -> t.getId().equals(orderId)).findFirst().get();
	}
	
	public List<Order> getAppleOrders(){
		List<Order> orders = new ArrayList();
		orders.add(new Order("SYD001","1","APPLE_IPAD_PRO","Apple ipad pro 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Raised"));
		orders.add(new Order("SYD002","1","APPLE_IPHONE_8","Apple iphone 8 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Raised"));
		orders.add(new Order("SYD003","1","APPLE_IMAC_PRO","Apple iMac Pro 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Raised"));
		orders.add(new Order("SYD004","1","APPLE_TV","Apple Tv 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Raised"));
		return orders;
	}
	
	public List<Order> getGoogleOrders(){
		List<Order> orders = new ArrayList();
		orders.add(new Order("BRS001","2","GOOGLE_PIXEL","Google Pixcel phone 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Processed"));
		orders.add(new Order("BRS002","2","GOOGLE_Nexus","Google Nexus phone 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Processed"));
		orders.add(new Order("BRS003","2","GOOGLE_HOME","Google home device 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Processed"));
		return orders;
	}
	
	public List<Order> getSamsungOrders(){
		List<Order> orders = new ArrayList();
		orders.add(new Order("MEL001","3","SAMSUNG_GALAXY_8","Samsung galaxy edge 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Completed"));
		orders.add(new Order("MEL002","3","SAMSUNG_TV","Samsung television 2017"," "+LocalDate.now() + " "+ LocalTime.now(),"Completed"));
		orders.add(new Order("MEL003","3","SAMSUNG_SOUND_BAR","Samsung sound bar, 1300 watts"," "+LocalDate.now() + " "+ LocalTime.now(),"Completed"));
		orders.add(new Order("MEL004","3","SAMSUNG_WATCH","Samsung watch for Android mobiles"," "+LocalDate.now() + " "+ LocalTime.now(),"Completed"));
		return orders;
	}

	

}
