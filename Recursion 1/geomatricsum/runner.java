package com.acts.geomatricsum;

import java.text.DecimalFormat;
import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int k = s.nextInt();
		double ans = solution.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}
