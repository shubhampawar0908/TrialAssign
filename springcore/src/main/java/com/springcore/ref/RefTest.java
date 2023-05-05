package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		Student student =context.getBean("student",Student.class);
		Person person=context.getBean("person",Person.class);
		Employee employee=context.getBean("employee",Employee.class);
		
		System.out.println(student);
		System.out.println(person);
		System.out.println(employee);
		
		
		

	}

}
