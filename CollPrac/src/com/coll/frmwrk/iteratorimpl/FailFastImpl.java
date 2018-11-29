package com.coll.frmwrk.iteratorimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Million dollar question : Fail fats and Fail safe strategy
public class FailFastImpl {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("A");// 0
		l.add("B");// 1
		l.add("C");// 2
		l.add("D");// 3

		System.out.println("-----------------");
		System.out.println("For loop");

		// System.out.println(l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		System.out.println("-----------------");
		System.out.println("For Each loop");

		for (Object object : l) {
			System.out.println(object);
		}

		System.out.println("-----------------");
		System.out.println("Iterator");

		Iterator it = l.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

	}
}
