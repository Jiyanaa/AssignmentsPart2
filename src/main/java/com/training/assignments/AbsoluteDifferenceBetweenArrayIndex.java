package com.training.assignments;

public class AbsoluteDifferenceBetweenArrayIndex {
	
	public static int findAbsoluteDifferenceBetweenTwoDistinctIndices(int[] inputArray,int k) {
		int difference =  0;
		for(int i = 0 ;i<inputArray.length-1;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(i==j) {
					continue;
				}
				else {
					if(inputArray[i]==inputArray[j]) {
						difference = Math.abs(j-i);
						if(difference<=k) {
							return difference;
						}
					}
				}
			}
		}
		return difference=0;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,0,2,0};
		int r= findAbsoluteDifferenceBetweenTwoDistinctIndices(arr, 1);
		System.out.println(r);
	}
}
