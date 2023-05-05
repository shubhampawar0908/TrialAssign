package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {
		
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
		
		EmployeeInfo empInfo=contex.getBean("emp",EmployeeInfo.class);
		
		System.out.println(empInfo.getNames());
		System.out.println(empInfo.getPhones());
		
		
		System.out.println();
		System.out.println("List of names:");
	    for (String i : empInfo.getNames()) {
	    	
	    	System.out.println(i);
			
		}
	    System.out.println();
	    System.out.println("List of phones:");
	    for (String i : empInfo.getPhones()) {
	    	
	    	System.out.println(i);
			
		}

	}

}
