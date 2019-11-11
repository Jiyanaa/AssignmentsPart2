package com.training.assignments;

public class IdentifyPalindromeFromArray {
	
	public static String checkPalindrom(String[] str){
		String result = "";
		 for(int k=0 ;k<str.length;k++){
		    String originalString = str[k];
	        int charLength = originalString.length();
	        
	        System.out.println(originalString+" length is:"+charLength);
	        
		    String[] words = originalString.split(" ");
		    String reversedString = "";
		    for (int i = 0; i < words.length; i++){
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) {
	               reverseWord = reverseWord + word.charAt(j);
	               
	           }
		       reversedString = reversedString + reverseWord + " ";
		       
		    }
		    reversedString = reversedString.trim();
		    
		    if(reversedString.equals(originalString)){
		        System.out.println(originalString+" is palindrome.");
		        result=result + originalString+" ";		        
		    }
		    else{
		        System.out.println(originalString+" is not palindrome.");
		    }

		 }
		return result;
	}
		 
}
