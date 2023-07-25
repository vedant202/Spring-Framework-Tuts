package com.SF_Tuts.Vedant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Motorola {
	@Autowired
	
	Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}
	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}
	
	public void config() {
		System.out.println("8GB Ram 64 gb storage 20mp rear camera and the best and toughest smartphone");
		cpu.process();
	}
	
	
}
