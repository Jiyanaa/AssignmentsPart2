package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.CheckNameIsPresentInArray;

public class CheckNameIsPresentInArrayTest {

	@Test
	public void testToCountNumberOfOccurencesOfNameInArray() {
		String[] names = {"Dave", "Ann", "George", "Sam", 
				"Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		int count = CheckNameIsPresentInArray.searchNameInArrayAndDisplayCount(names,"Sam");
		System.out.println(count);
		assertEquals(2, count);
	}
	
	@Test
	public void testToCountNumberOfOccurencesOfNameNotInArray() {
		String[] names = {"Dave", "Ann", "George", "Sam", 
				"Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		int count = CheckNameIsPresentInArray.searchNameInArrayAndDisplayCount(names,"Anagha");
		System.out.println(count);
		assertEquals(0, count);
	}

}
