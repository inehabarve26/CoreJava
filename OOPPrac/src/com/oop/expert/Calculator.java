package com.oop.expert;

/**
 * 
 * @author NEHA
 * @Expert Class : A truly encapsulated body is call an Expert class. The output
 *         of the encapsulation is an Expert class.
 *
 */
public class Calculator {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int subs() {
		return a - b;
	}

	public int multi() {
		return a * b;
	}

	public int div() {
		return a / b;
	}
}