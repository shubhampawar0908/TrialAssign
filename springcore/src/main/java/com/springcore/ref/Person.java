package com.springcore.ref;

public class Person {
	
	int pid;
	String name;
	Address add;
	public Person(int pid, String name, Address add) {
		super();
		this.pid = pid;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", add=" + add + "]";
	}
	
	

}
