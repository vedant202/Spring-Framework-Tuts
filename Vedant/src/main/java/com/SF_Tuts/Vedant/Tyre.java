package com.SF_Tuts.Vedant;

public class Tyre {
	private String brand;
	
	public Tyre(String brand) {
		super();
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
//	The value is assign to brand using Setters (Setter Injection) and we are setting the propert in spring.xml
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String toString() {
		return "Tyre [brand="+brand+"]";
	}
}
