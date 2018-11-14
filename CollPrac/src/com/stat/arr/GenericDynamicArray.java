package com.stat.arr;

/**
 * 
 * @author NCS
 * @definition [] is the notation of an array.
 * @definition Generic Array: We can have only homogeneous element.
 * @drawback They did not have shifting, searching, sorting, deletion, swapping,
 *           get Max, get Minimum, shuffle, reverse, do synchronize algorithms
 *           by themselves.
 */
public class GenericDynamicArray {
	public static void main(String[] args) {
		String[] s = { "B", "S", "E", "T" };// Dynamic/Elastic array , 1
		// Because we did not set the size of this array.

		for (String val : s) {
			System.out.print(val + "\t");
		}

		System.out.println();

		int[] i = { 10, 30, 20 };// , ""

		boolean[] b = { true, false, false };// , 6

	}
}