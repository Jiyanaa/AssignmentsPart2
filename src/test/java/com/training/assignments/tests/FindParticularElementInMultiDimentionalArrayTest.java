package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.FindParticularElementInMultiDimentionalArray;

public class FindParticularElementInMultiDimentionalArrayTest {

	@Test
	public void testToSearchElementInTwoDimentionalArray() {
		
		boolean actual =FindParticularElementInMultiDimentionalArray.searchNumberInTwoDimentionalArray(4);
		System.out.println(actual);
		assertEquals(true, actual);
	}
	
	@Test
	public void testToSearchElementInMultiDimentionalArray() {
		
		boolean actual =FindParticularElementInMultiDimentionalArray.searchNumberInMultiDimentionalArray(19);
		System.out.println(actual);
		assertEquals(true, actual);
	}


}
