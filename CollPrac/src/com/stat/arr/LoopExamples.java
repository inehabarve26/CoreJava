package com.stat.arr;

public class LoopExamples {
	public static void main(String[] args) {

		String[] str = { "1", "2", "3", "4" };

		for (int i = 0; i < str.length; i++) {
			String sv = str[i];
			System.out.print(sv + "\t");
		}

		System.out.println("-------------------");

		for (String s : str) {
			System.out.print(s + "\t");
		}

		System.out.println("-------------------");

		int i = 0;
		while (i < str.length) {
			// System.out.print(str[i] + "\t");
			String sv = str[i];
			System.out.print(sv + "\t");
			i++;
		}
	}
}
