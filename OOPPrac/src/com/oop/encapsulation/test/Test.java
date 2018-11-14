package com.oop.encapsulation.test;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("KL");
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getMonthlyIncome());
	}
}