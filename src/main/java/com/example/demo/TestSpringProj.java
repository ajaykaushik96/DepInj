package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProj {
	public static void main ( String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Restaurant restaurantobj = (Restaurant) context.getBean("RestaurantBean");
		restaurantobj.greetcustomer();
		
	}

}
