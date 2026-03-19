package com.maps;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfSpecialCharactersInString {

	public static void main(String[] args) {

		String str = "abc@#$$";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toLowerCase().toCharArray()) {
			if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == ' ')) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}

		}

		System.out.println(map);
	}
}
