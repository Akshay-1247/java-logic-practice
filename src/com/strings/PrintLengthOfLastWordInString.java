package com.strings;

public class PrintLengthOfLastWordInString {

	public static void main(String[] args) {

		String str = "Hello world from java  ";
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				count++;
			} else {
				if (count > 0) {
					break;
				}
			}
		}

		System.out.println("Length of last word: " + count);
	}
}
