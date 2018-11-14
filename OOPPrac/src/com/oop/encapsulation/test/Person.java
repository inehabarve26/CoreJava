package com.oop.encapsulation.test;

public class Person {
	
	private int uid = 112;
	private String name = "ABC";
	private String address = "Indore";
	private double blackMoney = 55555000000000.666;
	private double monthlyIncome = 50000.00;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMonthlyIncome() {
		return monthlyIncome / 2.5;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
}