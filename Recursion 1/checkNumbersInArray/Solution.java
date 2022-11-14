package com.acts.checkNumbersInArray;

public class Solution {
	public static boolean checkNumber(int input[],int x) {
		return checkNumber(input,x,0);
	}
	

	private static boolean checkNumber(int input[], int x,int startIndex) {
		if(startIndex==input.length) {
			return false;
		}
		
		if(input[startIndex]==x) {
			return true;
		}
			
	
		return checkNumber(input,x,startIndex+1);
	}

}


//
//public static int sum(int input[]) {
//	return sum(input,0);
//	
//}
//
//private static int sum(int input[],int startIndex){
//    if(startIndex==input.length)
//        return 0;
//    int ans=input[startIndex]+sum(input,startIndex+1);
//    return ans;
//
//}