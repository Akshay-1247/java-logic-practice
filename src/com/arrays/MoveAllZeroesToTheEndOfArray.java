package com.arrays;

public class MoveAllZeroesToTheEndOfArray {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 9 };
		int putNonZeroValue = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[putNonZeroValue];
				arr[putNonZeroValue] = arr[i];
				arr[i] = temp;
				putNonZeroValue++;
			}
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
