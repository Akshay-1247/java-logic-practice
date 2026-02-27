package com.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		String str = "swiss";

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

		for (char ch : map.keySet()) {
			if (map.get(ch) == 1) {
				System.out.println("First non-repeating character: " + ch);
				break;
			}
		}
	}
}
