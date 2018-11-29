package com.coll.frmwrk.iteratorimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Iterator has one extra method remove(), which removes the current element after reading.
public class IteratorRemoveImplementation {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");

		System.out.println("Before iterator");
		System.out.println(l);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			// it.remove();
			System.out.println(str);
		}

		System.out.println("After iterator");
		System.out.println(l);
	}
}