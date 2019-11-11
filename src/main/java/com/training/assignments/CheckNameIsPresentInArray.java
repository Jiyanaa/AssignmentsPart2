package com.training.assignments;

public class CheckNameIsPresentInArray {

	public static int searchNameInArrayAndDisplayCount(String[] names, String name) {
		int count = 0;
		for(int i = 0;i<names.length;i++) {
			if(names[i].equals(name))
				count = count+1;
		}
		return count;
	}
	
}
