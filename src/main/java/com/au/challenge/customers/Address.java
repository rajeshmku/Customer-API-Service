package com.au.challenge.customers;

public class Address {

	private String firstLine;
	private String secondLine;
	private String suburb;
	private String City;
	private String Country;
	private int postcode;
	
	public Address() {
		
	}
	
	
	public Address(String firstLine, String secondLine, String suburb, String city, String country, int postcode) {
		super();
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.suburb = suburb;
		City = city;
		Country = country;
		this.postcode = postcode;
	}


	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	public String getSecondLine() {
		return secondLine;
	}
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
}
