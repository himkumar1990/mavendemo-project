package com.demo.SeleniumPractice.stepDefs;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.SeleniumPractice.application.Address;
import com.demo.SeleniumPractice.application.Employee;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstStepDefinition extends CoreStep{



	@Given("^I get an Employee$")
	public void i_get_an_Employee() throws Throwable {
	   reference.employee = new Employee("1", "him", "5k");
	   reference.employee.employeeDetails();
	}

	@When("^I get employes address$")
	public void i_get_employes_salary() throws Throwable {
		reference.address  = new Address("102", "99", "blore", "india");
	    reference.address.addressDetails();
	}

	@Then("^I link employee salary with address$")
	public void i_link_employee_salary_with_employee() throws Throwable {
	  reference.address.addressDetails();
	  reference.employee.employeeDetails();
	}

}
