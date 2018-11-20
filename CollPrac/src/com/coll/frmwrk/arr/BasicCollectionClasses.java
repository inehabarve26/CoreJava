package com.coll.frmwrk.arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicCollectionClasses {
	public static void main(String[] args) {
		// Equal & Hashcode policy : Million Dollar question

		// Interface object = new ConcreateCLass();
		Set s = new HashSet();
		s.add(1);
		s.add(1);
		s.add(3);
		s.add(1);
		s.add(4);

		System.out.println(s);

		List l = new ArrayList();
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);

		// int i = 10;
		// i = 20;
		// System.out.println(i);

		// Map can not contain duplicate keys but can contain duplicate values.
		Map m = new HashMap();
		m.put(1, "ABC");
		m.put(2, "POL");
		m.put(3, "MJK");
		m.put(1, "TYU");
		m.put(4, "ABC");
		System.out.println(m);
	}
}