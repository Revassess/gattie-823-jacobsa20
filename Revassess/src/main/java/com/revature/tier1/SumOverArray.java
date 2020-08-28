package com.revature.tier1;

import java.util.stream.IntStream;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if (arr.length==0) {
			return 0;
		}
		int sum1 = 0;
		for (int i : arr) {
			sum1 = sum1 + i;

		}
		return sum1;
//		try(arr.length == 0){
//			return 0;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}

	}

}
