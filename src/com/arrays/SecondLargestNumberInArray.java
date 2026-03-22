package com.arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 855, 85 };

		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = num;
			} else if (num > secondLargestNumber && num < largestNumber) {
				secondLargestNumber = num;
			}
		}

		System.out.println("Second largest number: " + secondLargestNumber);
	}
}
