package com.sets;

import java.util.TreeSet;

public class FindSecondLargestNumberFromStringUsingSet {

	public static void main(String[] args) {

		String str = "ab23h9847";
		findSecondLargestNumber(str);
	}

	private static void findSecondLargestNumber(String str) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		int num;
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				num = ch - '0';
				set.add(num);
			}
		}
		set.pollLast();
		System.out.println("Second Largest Integer: " + set.last());
	}
}
