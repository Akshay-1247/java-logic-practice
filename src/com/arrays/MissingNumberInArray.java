package com.arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 7 };

		int sum = 0;
		int expectedSum = (arr.length + 1) * (arr.length + 2) / 2;

		for (int num : arr) {
			sum = sum + num;
		}

		System.out.println("Missing number: " + (expectedSum - sum));
	}
}
