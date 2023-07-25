package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private String name;
	private int model_no;
	private String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void displayInfo() {
		System.out.println("Dell Inspiration 15 4gb ram and 1TB Hard disk ");
	}
}
