package com.strings;

public class DecodeString {

	public static void main(String[] args) {

		String input = "d3m4t2b0a1";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i = i + 2) {
			char alphabet = input.charAt(i);
			int count = Character.getNumericValue(input.charAt(i + 1));
			for (int j = 0; j < count; j++) {
				sb.append(alphabet);
			}
		}

		System.out.println(input + ": " + sb);
	}
}
