package com.training.assignments;

public class FindOneMissingElementFromArray {

	public static int findOutMissingNumberFromArray(int[] array) {
		int n = array.length;
		int temp=0;
		//code to sort array in ascending order
		for(int i = 0 ;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int j = 0,missingNumber=0;
		//code to find out missing number
		for(int i = 0;i<array.length-1;i++) {
				j=i+1;
				if(array[i]+1!=array[j]) {
					System.out.print(array[i]+1);
					missingNumber = array[i]+1;
				}
		}

		return missingNumber ;
	}
	
	
	public static int searchMissingNumber(int array[]) {
		int a=0,b=array.length-1;
		int mid = 0;
		while((b-a)>1) {
			mid = (a + b) / 2;
			if((array[a] - a) != (array[mid] - mid))
				b = mid;
			else if ((array[b] -b) != (array[mid] - mid))
				a = mid;
		}
	
		return (array[mid] + 1);
	}

}
