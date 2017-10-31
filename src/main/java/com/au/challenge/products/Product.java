package com.au.challenge.products;

public class Product {
	
	private String id;
	private String type;
	private String name;
	private double price;
	
	public Product() {
		
	}
		
	public Product(String id, String type, String name, double price) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
