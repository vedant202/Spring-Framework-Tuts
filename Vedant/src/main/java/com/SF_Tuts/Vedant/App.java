package com.SF_Tuts.Vedant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
//        Vehicle obj = (Vehicle)context.getBean("bike");
//        obj.Drive();
        
//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);
        
//        Car car = (Car) context.getBean("car");
//        System.out.println(car.carTyre());
        
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
//        Samsung phone = factory.getBean(Samsung.class);
//        phone.config();
        
        Motorola moto_phone = factory.getBean(Motorola.class);
        moto_phone.config();
    }
}
