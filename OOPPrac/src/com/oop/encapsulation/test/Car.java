package com.oop.encapsulation.test;

public class Car {
	private String modelNo;
	private String name;
	private String company;
	private String owner;
	private String billingDate;
	private int warrenty;

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	public int getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
}