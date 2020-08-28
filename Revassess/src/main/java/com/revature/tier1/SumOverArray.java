package com.revature.tier1;

import java.util.stream.IntStream;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

//		int sum = 0;
//		while (true) {
//
//			for (int i : arr) {
//				sum = sum + i;
//			}
		if (arr.equals(0)) {
			return 0;
		} else {
			while (true) {
				int suma = IntStream.of(arr).sum();
				return suma;
			}

		}

	}

}
