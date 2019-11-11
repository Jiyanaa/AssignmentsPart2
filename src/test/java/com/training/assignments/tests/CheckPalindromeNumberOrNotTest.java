package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.CheckPalindromeNumberOrNot;

public class CheckPalindromeNumberOrNotTest {

	@Test
	public void testToCheckPalindromeForPositiveInteger() {
		boolean result = CheckPalindromeNumberOrNot.palindromeNumber(121);
		System.out.println("Output:"+result);
		assertEquals(true, result);
	}
	
	@Test
	public void testToCheckPalindromeForNegativeInteger() {
		boolean result = CheckPalindromeNumberOrNot.palindromeNumber(-121);
		System.out.println("Output:"+result);
		assertEquals(false, result);
	}
	
	@Test
	public void testTocheckPalindromeForAnyValidInput() {
		boolean result = CheckPalindromeNumberOrNot.palindromeNumber(10);
		System.out.println("Output:"+result);
		assertEquals(false, result);
	}

}
