package sF_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Motorola moto_phone = factory.getBean(Motorola.class);
		moto_phone.config();
	}
}
