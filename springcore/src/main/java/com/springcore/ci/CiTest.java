package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		
		Person ps=(Person) context.getBean("person");
		
		//System.out.println(ps);
		
		Employee emp1=(Employee) context.getBean("emp1");
		Employee emp2=(Employee) context.getBean("emp2");
		Employee emp3=(Employee) context.getBean("emp3");
//		System.out.println(emp1);
//		System.out.println(emp2);
		
		emp1.show();
		emp2.show();
		emp3.show();
		
		
	}

}
