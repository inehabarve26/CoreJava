package com.coll.frmwrk.arr;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementationClass {
	public static void main(String[] args) {

		Map m = new HashMap();
		m.put("1", "one");
		m.put("2", "two");
		m.put("3", "three");
		m.put("4", "four");
		m.put("5", "five");
		m.put("6", "six");

		System.out.println(m);

		Map m1 = new LinkedHashMap();
		m1.put("1", "one");
		m1.put("2", "two");
		m1.put("3", "three");
		m1.put("4", "four");
		m1.put("5", "five");
		m1.put("6", "six");

		System.out.println(m1);

		Map m2 = new TreeMap();
		m2.put("2", "one");
		m2.put("1", "two");
		m2.put("0", "three");
		m2.put("5", "four");
		m2.put("4", "five");
		m2.put("3", "six");

		System.out.println(m2);
	}
}
