package com.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("configEmpProd.xml");
		
		Employee emp= (Employee) context.getBean("emp");
		Product prod=(Product) context.getBean("pd");
		
		
		System.out.println(emp);
		System.out.println(prod);

	}

}
