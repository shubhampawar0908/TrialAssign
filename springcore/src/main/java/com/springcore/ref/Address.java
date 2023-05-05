package com.springcore.ref;

public class Address {
	
	
	String street;
	String city;
	int pincode;
	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
