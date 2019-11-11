package com.training.assignments;

import com.training.assignments.exception.NullInputStringException;

public class ReverseWordFromString {
	
	//using string class
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
	
	
	public static String reverseEachWordFromString(String inputString) throws NullInputStringException {
		if(inputString==null || inputString.isEmpty() || inputString.isBlank()) {
			throw new NullInputStringException("Please Enter non empty string.");
		}
		
		String[] wordFromString = inputString.split(" ");
		String outputString = "";
		for (int i = 0; i < wordFromString.length; i++)
		{
	           String word = wordFromString[i]; 
	           String reverse = "";
	           for (int j = word.length()-1; j >= 0; j--) 
	           {
	        	   reverse = reverse + word.charAt(j);
	           }
	           outputString = outputString + reverse + " ";
		}
		return outputString;
	}

}
