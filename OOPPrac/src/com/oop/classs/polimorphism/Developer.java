package com.oop.classs.polimorphism;

public class Developer extends Employee{

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "12345";
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return "tcs";
	}

	@Override
	public String getDesignetion() {
		System.out.println(super.getDesignetion());
		return "Developer";
	}
	
	
	

}
