package com.au.challenge.customers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.au.challenge.orders.Order;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.GET,value="customers")
	public List<Customer> getCustomers() {
		return this.customerService.getCustomerList();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="customers/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return this.customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="customers/{id}/orders")
	public List<Order> getCustomerOrders(@PathVariable String id) {
		return this.customerService.getCustomerOrders(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="customers/{id}/order")
	public Order getCustomerOrders(@PathVariable String id, @RequestParam("orderId") String orderId ) {
		return this.customerService.getCustomerOrderById(id,orderId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="customers")
	public void addCustomer(@RequestBody Customer customer) {
		this.customerService.addCustomer(customer);
	}
	
//	@RequestMapping(method=RequestMethod.PUT, value="customers/{id}")
//	public void updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
//		this.customerService.updateCustomer(id,customer);
//	}
	
	@RequestMapping(method=RequestMethod.PUT, value="customers/{id}")
	public void updateCustomer(@PathVariable String id, @RequestBody Map<String, String> params) {
		this.customerService.updateCustomerInstance(id, params);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="customers/{id}")
	public void deleteCustomer(@PathVariable String id, @RequestBody Customer customer) {
		this.customerService.deleteCustomer(id);
	}
	
	

}
