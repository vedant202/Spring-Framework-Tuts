package com.SF_Tuts.Vedant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	
	public void setTyre(Tyre t) {
		this.tyre = t;	
		}
	public Tyre getTyre() {
		return tyre;
	}
	
	public String carTyre() {
		return "Car Tyre="+tyre.getBrand();
	}
	
	public void Drive() {
		System.out.println("Chaal rahi hai...");
	}
}
