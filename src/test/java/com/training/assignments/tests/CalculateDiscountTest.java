package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.CalculateDiscount;
import com.training.assignments.exception.WrongInputException;

public class CalculateDiscountTest {

	@Test
	public void testToClaculateDiscountForValidInput() throws WrongInputException {
		double result = CalculateDiscount.calculateDiscount(1000.0);
		assertEquals(650.0, result,0.01);
	}
	
	@Test(expected = WrongInputException.class)
	public void testToClaculateDiscountForInValidInput() throws WrongInputException {
		double result = CalculateDiscount.calculateDiscount(-1000.0);
	}


}
