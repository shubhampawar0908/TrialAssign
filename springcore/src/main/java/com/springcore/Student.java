package com.springcore;

public class Student {
	
	int stud_id;
	String stud_name;
	int age;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int stud_id, String stud_name, int age) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.age = age;
	}
	
	
	public Student()
	{
		
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", age=" + age + "]";
	}
	
	

}
