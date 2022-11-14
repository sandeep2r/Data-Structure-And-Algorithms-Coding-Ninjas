package com.acts.countZeros;

public class solution {
	static int count =0;
	public static int countZerosRec(int input){
		
		if(input==0) {
			return 1;
		}
		int ld = input%10;
		{
			if(ld==0) {
				count++;
			}
		}
		 countZerosRec(input/10);
		return count;
		
		
		
	}

	
}
