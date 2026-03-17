package com.arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 44, 555, 6666, 33, 2, 11 };

		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println("Largest number: " + largest);
	}
}
