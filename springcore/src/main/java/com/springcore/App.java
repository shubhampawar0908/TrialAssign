package com.springcore;

import org.springframework.context.ApplicationContext;
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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Student student=(Student) context.getBean("st");
        
        System.out.println(student);
        System.out.println(student.getStud_id()+" "+student.getStud_name()+" "+student.getAge());
        
    }
}
