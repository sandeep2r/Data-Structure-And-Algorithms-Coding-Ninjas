package com.acts.checkStringPalindrome;

import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}
