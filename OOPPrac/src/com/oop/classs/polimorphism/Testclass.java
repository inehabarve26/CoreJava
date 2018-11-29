package com.oop.classs.polimorphism;

public class Testclass {

	public static void main(String[]arg){
		
		Employee e= new Employee();
	
		System.out.println(e.getCompany());
		System.out.println(e.getDesignetion());
		System.out.println(e.getId());
		System.out.println();
		
		e= new Developer();
		System.out.println(e.getCompany());
		System.out.println(e.getDesignetion());
		System.out.println(e.getId());
		
		System.out.println();
		
		e= new Tester();
		System.out.println(e.getCompany());
		System.out.println(e.getDesignetion());
		System.out.println(e.getId());
		
		System.out.println();
		
	}
}
