package com.training.assignments;

public class RemoveDuplicateCharacterFromString {
	
	
	public static String removeDuplicateCharactersFromString(String inputString) {
		String unique= "";
		char[] strArr = inputString.toCharArray();
		for(int i = 0;i<strArr.length;i++) {
			int j;
			for(j = 0;j<i;j++) {
				
				if(strArr[i] == strArr[j]) {
					break;
				}
			}
			//add element in array
			if(i == j) {
				unique += strArr[i];
			}
			
		}
		return unique;
	}
	
}
