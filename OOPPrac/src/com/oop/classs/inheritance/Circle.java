package com.oop.classs.inheritance;

/**
 * @author NEHA
 * @Example: Method Overriding : When child wants to change the definition of
 *           their parental properties then it will override those properties in
 *           their body.
 *
 */
public class Circle extends Shape {
	private double pi = 3.14;
	private double radius = 2.33;

	/**
	 * Example 1 of method overriding
	 */
	@Override
	public int getBorderWidth() {
		return 30;
	}

	/**
	 * Example 2 of method overriding
	 */
	@Override
	public double area() {
		return pi * radius * radius;
	}

	/**
	 * Example 3 of method overriding
	 */
	@Override
	public String getColor() {
		return "Indigo";
	}
}