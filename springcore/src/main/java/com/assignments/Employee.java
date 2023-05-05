package com.assignments;

public class Employee {
	
	int empId;
	String empName;
	String job;
	float salary;
	
	public Employee()
	{
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, String job, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.job = job;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
	

}
