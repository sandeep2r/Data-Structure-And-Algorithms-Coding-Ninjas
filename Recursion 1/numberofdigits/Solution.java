package com.acts.numberofdigits;

public class Solution {

	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		int small = count(n/10);
		int ans = small + 1;

		return ans;
	}

}
