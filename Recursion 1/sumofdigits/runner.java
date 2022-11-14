package com.acts.sumofdigits;

import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = s.nextInt();
		System.out.println(solution.sumOfDigits(n));
	}
}
