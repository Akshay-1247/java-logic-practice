package com.maps;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfCharactersInString {

	public static void main(String[] args) {

		String str = "madam";

		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(mp);
	}
}
