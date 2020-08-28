package com.revature.tier1;

import java.util.stream.IntStream;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if (arr.equals(null)) {
			return 0;
		}
//		int sum = 0;
//		while (true) {
//
//			for (int i : arr) {
//				sum = sum + i;
//			}
		int suma = IntStream.of(arr).sum();
		return suma;

	}

}
