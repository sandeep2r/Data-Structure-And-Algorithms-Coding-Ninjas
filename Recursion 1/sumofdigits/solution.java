package com.acts.sumofdigits;

public class solution {
	static int smallAns = 0;
	public static int sumOfDigits(int input){
		
		if(input==0) {
			return 0;
		}
		smallAns = smallAns + input%10;
		
		sumOfDigits(input/10);
		
		
		return smallAns;
	}

}


//
//if(input==0) {
//	return 1;
//}
//int ld = input%10;
//{
//	if(ld==0) {
//		count++;
//	}
//}
// countZerosRec(input/10);
//return count;
