package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.RemoveDuplicateCharacterFromString;

public class RemoveDuplicateCharacterFromStringTest {

	@Test
	public void testForRemoveDuplicateCharacters() {
		String result = RemoveDuplicateCharacterFromString.removeDuplicateCharactersFromString("hello");
		System.out.println(result);
		assertEquals("helo", result);
	}

}
