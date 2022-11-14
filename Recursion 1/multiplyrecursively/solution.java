package com.acts.multiplyrecursively;

public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		if(n==0) {
			return 0;
		}
		int product = m + multiplyTwoIntegers(m,n-1);
		return product;
	}

}
