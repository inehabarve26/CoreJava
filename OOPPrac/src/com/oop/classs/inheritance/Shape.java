package com.oop.classs.inheritance;
 public class Shape {
 	private int borderWidth = 10;
	private String color = "Red";
 	public int getBorderWidth() {
		return borderWidth;
	}
 	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
 	public String getColor() {
		return color;
	}
 	public void setColor(String color) {
		this.color = color;
	}
 	public double area() {
		return 100.0;
	}
 } 