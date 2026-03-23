package com.maps;

import java.util.HashMap;
import java.util.Map;

public class FindTheFrequencyOfWordsInString {

	public static void main(String[] args) {

		String str = "My name is Akshay Akshay";
		String words[] = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}
}
