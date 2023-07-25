package com.SF_Tuts.Vedant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.SF_Tuts.Vedant")
public class AppConfig {
	@Bean
	public Samsung getSamsung() {
		return new Samsung();
	}
	
	@Bean
	public SnapDragon getSnapDragon() {
		return new SnapDragon();
	}
	
//	@Bean(name = "getMediaTek")
//	public MediaTek getMeddiatTek() {
//		return new MediaTek();
//	}
//	
//	@Bean
//	public Motorola getMotorola() {
//		return new Motorola();
//	}
}
