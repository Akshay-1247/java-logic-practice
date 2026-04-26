package com.maps;

import java.util.HashMap;
import java.util.Map;

public class FindTheMaxQuantity {

	public static void main(String[] args) {

		String arr[] = { "xyz 10", "abc 3", "xyz 20","abc 100" };

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String str : arr) {
			String data[] = str.split(" ");
			String name = data[0];
			int value = Integer.parseInt(data[1]);
			map.put(name, map.getOrDefault(name, 0) + value);
		}
		int max = 0;
		String product = "";
		for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() > max) {
				max = entrySet.getValue();
			}
			product = entrySet.getKey();
		}
		System.out.println(product + ": " + max);
	}
}
