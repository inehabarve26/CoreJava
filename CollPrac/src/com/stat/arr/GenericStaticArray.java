package com.stat.arr;

/**
 * 
 * @author NCS
 * @definition [] is the notation of an array.
 */
public class GenericStaticArray {
	public static void main(String[] args) {
		String[] s = new String[5];// Static/Bounded/Fixed array
		// Because we have set the size of this array.
		s[0] = "ABC";
		s[1] = "OPL";
		s[2] = "JKL";
		s[3] = "RTH";
		s[4] = "CVB";
		// s[5] = "CVB";// It will raise ArrayIndeOutOfBoundException

		for (String val : s) {
			System.out.print(val + "\t");
		}

	}
}