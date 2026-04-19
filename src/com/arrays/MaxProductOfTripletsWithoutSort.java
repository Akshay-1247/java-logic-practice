package com.arrays;

public class MaxProductOfTripletsWithoutSort {

	public static void main(String[] args) {

		int a[] = { 7, 5, 3, 2, -10, -20 };

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int num : a) {
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3) {
				max3 = num;
			}else if(num<min1) {
				min2=min1;
				min1=num;
			}else if(num<min2) {
				min2=num;
			}
		}
		
		int result1 = max2*max2*max3;
		int result2 = min1*min2*max1;
		
		System.out.println(Math.max(result1, result2));
	}
}
