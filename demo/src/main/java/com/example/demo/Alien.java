package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int aid;
	private String aName;
	@Autowired
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Object Created");
	}
	
	public int getId() {
		return this.aid;
	}
	
	public void setId(int id) {
		this.aid = id;
	}
	
	public String getName() {
		return this.aName;
	}
	
	public void setName(String name) {
		this.aName = name;
	}
	
	public void alienInf() {
		System.out.println("Alien is a tech group started by vedant dhenge");
		laptop.displayInfo();
	}
}
