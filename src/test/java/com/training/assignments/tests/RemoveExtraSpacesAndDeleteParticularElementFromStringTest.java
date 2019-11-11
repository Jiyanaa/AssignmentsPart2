package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.RemoveExtraSpacesAndDeleteParticularElementFromString;
import com.training.assignments.exception.NullInputStringException;
import com.training.assignments.exception.WrongInputException;

public class RemoveExtraSpacesAndDeleteParticularElementFromStringTest {

	@Test
	public void testToReduceSpaceAndDeleteRepeatedWordFromStringWithValidInput() throws NullInputStringException {
		String input = "Welcome,	to  India and to mumbai also";	
		String result = RemoveExtraSpacesAndDeleteParticularElementFromString.removeExtraSpacesAndDeleteSpecifiedWordFromString(input,"to",5);
		System.out.println(result);
		String expected = "Welcome, to India and mumbai also "; 
		assertEquals(expected, result);
	}
	
	@Test(expected = NullInputStringException.class)
	public void testForWrongInputAsEmptyString() throws NullInputStringException {
		String input = null;
		RemoveExtraSpacesAndDeleteParticularElementFromString.removeExtraSpacesAndDeleteSpecifiedWordFromString(input, "hello", 0);	
	}
	
	@Test
	public void testForRemoveWordWhichNotPresentInString() throws NullInputStringException {
		String input = "Welcome,	to  India and to mumbai also";	
		String result = RemoveExtraSpacesAndDeleteParticularElementFromString.removeExtraSpacesAndDeleteSpecifiedWordFromString(input, "hello", 0);	
		assertEquals("Word to be deleted is not in string", result);
	}

}
