package com.acts.lastIndexOfNumber;

public class Solution {
	 public static int firstIndex(int input[], int x) {
	        //method overloading
	        return firstIndex(input,x,0);		

	    }
	    private static int firstIndex(int input[],int x,int lastIndex){
	        if(lastIndex==input.length)
	            return -1;
	        if(input[lastIndex]==x)
	            return lastIndex;
	        return firstIndex(input,x,lastIndex+1);
	        }

}

