package com.maps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int target = 9;

		int result[] = calculateTwoSum(arr, target);
		System.out.println(result[0] + " " + result[1]);
	}

	public static int[] calculateTwoSum(int arr[], int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int compliment = target - arr[i];
			if (map.containsKey(compliment)) {
				int result[] = { map.get(compliment), i };
				return result;
			}
			map.put(arr[i], i);
		}
		return null;

	}
}
