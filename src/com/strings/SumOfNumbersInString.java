package com.strings;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		String str = "a100b020c30";

		int sum = 0;
		int currentNum = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				currentNum = currentNum * 10 + (ch - '0');
			} else {
				sum = sum + currentNum;
				currentNum = 0;
			}
		}
		sum = sum + currentNum;

		System.out.println("Sum of numbers: " + sum);

	}
}
