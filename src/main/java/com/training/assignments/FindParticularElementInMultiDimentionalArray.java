package com.training.assignments;

public class FindParticularElementInMultiDimentionalArray {

	public static boolean searchNumberInTwoDimentionalArray(int number) {
		int[][] array = {{1,2,3,5},{2,4,5,5},{3,3,9,5}};
		
		for(int i = 0;i<array.length;i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i][j]==number) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean searchNumberInMultiDimentionalArray(int number) {
		int[][][] array = {
				{{43,14,5},{98,23,21}},
				{{65,19,20},{30,14,62}}
		};
		
		for(int i = 0;i<array.length;i++) {
			for (int j = 0; j < array.length; j++) {
				for(int k=0;k < array.length; k++) {
					if(array[i][j][k]==number) {
						return true;
					}	
				}
			}
		}
		return false;
	}
	
}
