package com.coll.frmwrk.historical.arr;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//Fail fast and Fail Safe strategy
public class HistoricalVectorClassesImplementation {
	public static void main(String[] args) {

		// ArrayList is asynchronized (Means more then one can access it at a
		// same time.)
		List l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");

		System.out.println(l);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

		System.out.println("--------------");

		// Vector is a historical by nature and it is synchronized by type.
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");

		System.out.println(v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			String str = (String) e.nextElement();
			System.out.println(str);
		}
	}
}