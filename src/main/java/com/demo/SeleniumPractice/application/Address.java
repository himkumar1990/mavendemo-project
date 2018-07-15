package com.demo.SeleniumPractice.application;

public class Address {

	private String houseNo;
	private String roadNo;
	private String city;
	private String country;
	
	public Address(String houseNo,String roadNo, String city, String country){
		this.houseNo= houseNo;
		this.roadNo = roadNo;
		this.city = city;
		this.country  = country;
	}
	
	public void addressDetails() {
		System.out.println(houseNo+" " + city);
	}
}
