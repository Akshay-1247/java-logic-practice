package com.arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";

		char s1arr[] = str1.toCharArray();
		char s2arr[] = str2.toCharArray();

		Arrays.sort(s1arr);
		Arrays.sort(s2arr);

		if (s1arr.length != s2arr.length) {
			System.out.println("Not Anagram. Lengths dont match");
		} else {
			if (Arrays.equals(s1arr, s2arr)) {
				System.out.println("Anagrams");
			} else {
				System.out.println("Not Anagrams");
			}
		}
	}
}
