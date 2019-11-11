package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.IdentifyPalindromeFromArray;

public class IdentifyPalindromeFromArrayTest {

	@Test
	public void testToCheckPalindromeString() {
		String[] str = {"hema","sas","mam"};
		String actual = IdentifyPalindromeFromArray.checkPalindrom(str);
		String expected="sas mam ";
		assertEquals(expected,actual);
		
	}

}
