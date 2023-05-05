package com.springcore.ci;

public class Employee {
	
	
	int empId;
	String empName;
	
	public Employee()
	{
		
	}
	public Employee(int empId)
	{
		this.empId=empId;
	}
	
	public Employee(String  empName)
	{
		this.empName=empName;
	}
	
	public Employee(int empId,String  empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
    public void show()
    {
    	System.out.println(empId+" "+empName);
    }

}
