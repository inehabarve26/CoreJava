package com.coll.frmwrk.arr;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementationClasses {
	public static void main(String[] args) {
		// Interface object = new ConcreateClass();
		// Random order
		Set s = new HashSet();
		s.add(40);
		s.add(20);
		s.add(70);
		s.add(30);
		s.add(90);
		System.out.println(s);

		// Maintain insertion order
		Set s1 = new LinkedHashSet();
		s1.add(40);
		s1.add(20);
		s1.add(70);
		s1.add(30);
		s1.add(90);
		System.out.println(s1);

		// Sorted
		Set s2 = new TreeSet();
		s2.add(40);
		s2.add(20);
		s2.add(70);
		s2.add(30);
		s2.add(90);
		System.out.println(s2);
	}
}
