package com.sets;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsFromArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 1, 2, 1 };

		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> duplicateSet = new HashSet<Integer>();

		for (int num : a) {
			if (!seen.add(num)) {
				duplicateSet.add(num);
			}
		}

		seen.removeAll(duplicateSet);
		System.out.println(seen);
	}

}
