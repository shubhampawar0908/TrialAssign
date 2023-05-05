package com.springcore.ref;

public class Employee {
	
	int empid;
	String name;
	Address add;

	public Employee(int empid, String name, Address add) {
		super();
		this.empid = empid;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", add=" + add + "]";
	}

}
