package com.arrays;

public class LinearSearchInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 66, 5, 77, 8 };
		int num = 77;
		boolean isPresent = false;
		int position = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				isPresent = true;
				position = i;
			}
		}

		if (isPresent) {
			System.out.println(num + " is available on the index: " + position);
		} else {
			System.out.println(num + " is not present");
		}
	}
}
