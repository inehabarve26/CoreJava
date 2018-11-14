package com.oop.expert;

/**
 * 
 * @author NEHA
 * @description : Tester of calculator.
 */
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setA(20);
		c.setB(10);
		int aValue = c.add();
		
		System.out.println("Addition: " + aValue);// Concatenation
		int sValue = c.subs();
		System.out.println("Subtraction: " + sValue);
		int mValue = c.multi();
		System.out.println("Multiplication: " + mValue);
		int dValue = c.div();
		System.out.println("Division: " + dValue);
	}
}