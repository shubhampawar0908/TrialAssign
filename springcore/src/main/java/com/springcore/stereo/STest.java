package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class STest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereo/config.xml");
		
		Course c=context.getBean("course",Course.class);
		
		System.out.println(c);

	}

}
