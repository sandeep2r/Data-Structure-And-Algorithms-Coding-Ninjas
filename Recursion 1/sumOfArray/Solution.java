package com.acts.sumOfArray;

public class Solution {
	public static int sum(int input[]) {
		return sum(input,0);
		
	}

	private static int sum(int input[],int startIndex){
        if(startIndex==input.length)
            return 0;
        int ans=input[startIndex]+sum(input,startIndex+1);
        return ans;

}

}

//basic solution iterative

//if(input.length==0) {
//	return 0;
//}
//int ans = 0;
//for(int i = 0;i<input.length;i++) {
//	ans = ans + input[i];
//}
//
//return ans;