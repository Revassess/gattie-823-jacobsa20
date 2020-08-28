package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		while (true) {
			int sum = 0;
			for (int i : arr) {
				sum = sum + i;
			}
			System.out.println(sum);
			return sum;
		}
	}
}
