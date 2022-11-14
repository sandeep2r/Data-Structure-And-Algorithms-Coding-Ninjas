package com.acts.checkStringPalindrome;

public class solution {

	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input,0,input.length()-1);
	}
	
	
	
	private static boolean isStringPalindrome(String input,int startIndex,int lastIndex) {
		if(startIndex==lastIndex) {
			return true;
		}
		if(input.length()<=1) {
			return false;
		}
		if(input.charAt(startIndex)==input.charAt(lastIndex)) {
			return true;
		}
	 
		
		return isStringPalindrome(input,startIndex+1,lastIndex-1);
	}

}

//public class CheckPalindromeRecursive {
//
//	public static boolean isStringPalindrome(String input) {
//		if(input.length()<=1)
//		{
//			return true;
//		}
//		else if(input.charAt(0)!=input.charAt(input.length()-1))
//		{
//			return false;	
//		}
//		return isStringPalindrome(input.substring(1, input.length()-1));
//
//	}
//	public static void main(String[] args) {
//		System.out.println(isStringPalindrome("racecar"));
//	}
//
//}