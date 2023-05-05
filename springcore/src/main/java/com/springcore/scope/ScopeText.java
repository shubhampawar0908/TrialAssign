package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeText {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/scope/scopeconfig.xml");

		A a = context.getBean("a", A.class);
		A a1 = context.getBean("a", A.class);
		A a2 = context.getBean("a", A.class);

		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		
	
		

	}

}
