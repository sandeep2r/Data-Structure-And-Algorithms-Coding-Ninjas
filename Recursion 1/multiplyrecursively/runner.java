package com.acts.multiplyrecursively;

import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(solution.multiplyTwoIntegers(m, n));
	}
}
