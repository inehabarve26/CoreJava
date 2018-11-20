package com.coll.frmwrk.arr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListImplementationClass {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("A");// 0
		l.add("B");// 1
		l.add("C");// 2
		l.add("D");// 3
		l.add("E");// 4
		l.add("F");// 5
		System.out.println(l);

		System.out.println(l.get(1));

		List l1 = new LinkedList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		l1.add("F");
		System.out.println(l1);

		System.out.println(l1.get(1));

	}
}
