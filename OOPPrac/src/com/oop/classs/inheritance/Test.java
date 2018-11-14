package com.oop.classs.inheritance;

/**
 * 
 * @author NEHA
 * @Example : This is the example of Polymorphism in the terms of Classes.
 *
 */
public class Test {
	public static void main(String[] args) {
		Shape s = new Shape();
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		System.out.println(s.area());
		System.out.println();
		
		// Circle c = new Circle();
		s = new Circle();
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		System.out.println(s.area());
		System.out.println();
		
		// Triangle t = new Triangle();
		s = new Triangle();
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		System.out.println(s.area());
	}
}