package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.ReverseWordFromString;
import com.training.assignments.exception.NullInputStringException;

public class ReverseWordFromStringTest {

	@Test
	public void testToConvertStringToReverseStringWithValidInput() throws NullInputStringException {
		String originalString = "Let's take LeetCode contest";
		
		String actualOutput = ReverseWordFromString.reverseEachWordFromString(originalString);
		String expectedOutput = "s'teL ekat edoCteeL tsetnoc ";
		
		System.out.print(originalString + "\n"+ actualOutput);
		assertEquals(expectedOutput,actualOutput);
		
	}
	
	@Test(expected = NullInputStringException.class)
	public void testForEmptyInputStringValue() throws NullInputStringException {
		String inputString = " ";
		ReverseWordFromString.reverseEachWordFromString(inputString);
	}

}
