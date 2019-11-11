package com.training.assignments;

import com.training.assignments.exception.NullInputStringException;
import com.training.assignments.exception.WrongInputException;

public class RemoveExtraSpacesAndDeleteParticularElementFromString {

	/*public static String reduceSpaceAndDuplicateWord(String sentence, String word, int position) throws WrongInputException {
		String[] strArr = sentence.split("\\W+");
		if(position > strArr.length) {
			throw new WrongInputException("Please Enter valid position.");
		}
		String updatedString = "";
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals(word) && i == position - 1) {
				continue;
			}
			else if(i == strArr.length - 1) {
				updatedString = updatedString+strArr[0];
			}
			else {
				updatedString = updatedString + strArr[i]+" ";
			}
		}
		return updatedString;
	}*/

	public static String removeExtraSpacesAndDeleteSpecifiedWordFromString(String s, String word, int position) throws NullInputStringException {
		//String newStr = input.trim().replaceAll("\\s{2,}", " ");
		if(s==null || s.isEmpty() || s.isBlank()) {
			throw new NullInputStringException("Please Enter non empty string.");
		}
		if(!(s.contains(word))) {
			return "Word to be deleted is not in string";
		}
		
		
		String[] words = s.split("\\s+");
		String result="";
		for (int i = 0; i < words.length; i++) {
		    words[i] = words[i].replaceAll("[^\\w[,]]", "");
		    int currPosition=i;
		    if(words[i].equals(word) && position==currPosition+1) {
		    	continue;
		    }
		    else {
		    	result =  result + words[i]+" ";
		    }
		}
		return result;
	}
	
	

}
