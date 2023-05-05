package com.springcore.ref;

public class Student {
	
	int Id;
	String name;
	int age;
	Address add;
	public Student(int id, String name, int age, Address add) {
		super();
		this.Id = id;
		this.name = name;
		this.age = age;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + ", add=" + add + "]";
	}
	
	
	
	

}
