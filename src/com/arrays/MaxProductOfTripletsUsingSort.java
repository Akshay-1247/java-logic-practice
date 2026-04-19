package com.arrays;

import java.util.Arrays;

public class MaxProductOfTripletsUsingSort {

	public static void main(String[] args) {

		int a[] = { -20, -10, 5, 0, -20 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int length = a.length;
		int result1 = a[length - 1] * a[length - 2] * a[length - 3];
		int result2 = a[0] * a[1] * a[length - 1];
		
		int result=Math.max(result1, result2);
		System.out.println(result);
		
	}
}
