package com.demo.SeleniumPractice.application;

public class Employee {

	private String empId ;
	private String name;
	private String salary;
	
   public Employee(String empId, String name,String salary) {
	   this.empId = empId;
	   this.name = name;
	   this.salary  = salary;
   }
   
   public void employeeDetails() {
	   System.out.println(empId + " " + name + " " +salary);
   }
	
}
