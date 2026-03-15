package com.integers;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int originalNumber = num;

		int rem = 0;
		int sum = 0;

		while (num != 0) {

			rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}

		if (originalNumber == sum) {
			System.out.println(originalNumber + " is Armstrong number");
		} else {
			System.out.println(originalNumber + " is not an Armstrong Number");
		}
	}
}
