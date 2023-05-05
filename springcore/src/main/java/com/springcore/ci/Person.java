package com.springcore.ci;

public class Person {
	
	String pname;
	int pid;
	public Person(String pname, int pid) {
		super();
		this.pname = pname;
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + "]";
	}
	
	
	

}
