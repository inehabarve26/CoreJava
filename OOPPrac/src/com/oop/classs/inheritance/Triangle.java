package com.oop.classs.inheritance;

public class Triangle extends Shape {
	private double height = 4.32;
	private double breadth = 5.62;

	@Override
	public int getBorderWidth() {
		return 96;
	}

	@Override
	public String getColor() {
		System.out.println(super.getColor());
		return "Black ";
	}

	@Override
	public double area() {
		return (height * breadth) * 0.50;
	}
}