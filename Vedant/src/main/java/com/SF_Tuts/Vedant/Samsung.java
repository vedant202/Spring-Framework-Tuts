package com.SF_Tuts.Vedant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Samsung {
	@Autowired
	SnapDragon cpu;
	
	public void setCpu(SnapDragon cpu) {
		this.cpu = cpu;
	}
	
	public SnapDragon getCpu() {
		return cpu;
	}
	public void config() {
		System.out.println("4gb Ram 12mp rear camera Octa Core");
		cpu.process();
	}
	

}
