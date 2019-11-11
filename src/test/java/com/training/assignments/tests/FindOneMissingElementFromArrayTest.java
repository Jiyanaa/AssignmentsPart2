package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.FindOneMissingElementFromArray;

public class FindOneMissingElementFromArrayTest {

	@Test
	public void testToFindOutMissingNumberFromArray() {
		int[] array = {10,6,7,8};
		int result = FindOneMissingElementFromArray.findOutMissingNumberFromArray(array);
		assertEquals(9, result);
	}
	
	@Test
	public void testToFindOutMissingNumberInSortedNumber() {
		int[] array = {1,2,3,5};
		int result = FindOneMissingElementFromArray.searchMissingNumber(array);
		System.out.println(result);
		assertEquals(4, result);
	}

}
