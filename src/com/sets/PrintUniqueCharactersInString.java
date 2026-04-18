package com.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharactersInString {

	public static void main(String[] args) {

		String str = "aabbccddaaee";

		Set<Character> set = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {

			if (set.add(ch)) {
				sb.append(ch);
			}

		}
		System.out.println(sb);
	}
}
