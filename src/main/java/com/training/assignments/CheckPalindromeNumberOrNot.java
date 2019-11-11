package com.training.assignments;

public class CheckPalindromeNumberOrNot {

	public static boolean palindromeNumber(int number) {
		int originalNo = number;
		char[] charArr= String.valueOf(originalNo).toCharArray();
		
		/*int remainder=0,result=0;
		while(number!=0) {
			remainder = number%10;
			result = result*10+remainder;
			number/=10;
		}
		
		if(result == originalNo) {
			return true;
		}*/
		
		int j = 0;
		String temp = "";
		for(int i= charArr.length-1;i>=0;i--) {
			temp	+= charArr[i];
		}
		
		String inputString = String.valueOf(originalNo);
		System.out.println("Input No:"+inputString+"\nReverse No:"+temp);
		if(temp.equals(inputString)) {
			return true;
			
		}
		return false;		
	}

}
