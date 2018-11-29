package com.coll.frmwrk.historical.arr;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

//Hashmap can contain a single null as a key but HashTable can't.
public class HistoricalHashtableClassesImplementation {
	public static void main(String[] args) {

		// HashMap is asynchronized (Means more then one thread can access it at
		// a same time.)
		Map map = new HashMap();
		map.put(null, "Value null");
		map.put("A", "Value 1");
		map.put("B", "Value 2");
		map.put("C", "Value 3");
		map.put("D", "Value 4");

		System.out.println(map);

		System.out.println("keySet " + map.keySet());
		System.out.println("values " + map.values());

		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(map.get(str));
		}

		System.out.println("--------------");

		// Hashtable is a historical by nature and it is synchronized by type.
		Hashtable ht = new Hashtable();
		// Hashtable does not allow null key.
		// ht.put(null, "Value 1");
		ht.put("A", "Value 1");
		ht.put("B", "Value 2");
		ht.put("C", "Value 3");
		ht.put("D", "Value 4");

		System.out.println(ht);

		Enumeration e = ht.keys();
		while (e.hasMoreElements()) {
			String str = (String) e.nextElement();
			System.out.println(ht.get(str));
		}
	}
}