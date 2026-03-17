package com.sets;

import java.util.HashSet;
import java.util.Set;

public class PangramWithCollections {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";
		str = str.toLowerCase();

		Set<Character> hashSet = new HashSet<Character>();

		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				hashSet.add(ch);
			}
		}

		if (hashSet.size() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not Pangram");
		}

	}
}
