package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		Payment p=context.getBean("payment",Payment.class);
		
		
		System.out.println(p);
		

	}

}
