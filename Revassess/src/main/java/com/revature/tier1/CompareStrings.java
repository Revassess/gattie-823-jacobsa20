package com.revature.tier1;

public class CompareStrings {

	public static boolean compareStrings(String s1, String s2) {

		// make sure s1 and s2 ignore case sensitivity

		//System.out.println("Compare " + s1 + " with " + s2 + "=" + s1.equalsIgnoreCase(s2));

		if (s1.equalsIgnoreCase(s2)) {
			return true;
		} else {
			return false;
		}
	}
}