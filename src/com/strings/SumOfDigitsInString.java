package com.strings;

public class SumOfDigitsInString {

	public static void main(String[] args) {

		String str = "a1b2c345";
		StringBuilder sb = new StringBuilder();

		int sum = 0;

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum = sum + ch - '0';
			}else {
				sb.append(ch);
			}
		}
		System.out.println(sum);
		System.out.println(sb);
	}
}
