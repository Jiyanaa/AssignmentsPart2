package com.training.assignments;

import com.training.assignments.exception.WrongInputException;

public class CalculateDiscount {

	public static double calculateDiscount(double newItem) throws WrongInputException {
		if(newItem<0) {
			throw new WrongInputException("price should not be less than 0");
		}
		double discount = newItem * 35/100;
		double newItemPrice = newItem - discount;
		System.out.print("New item price is with 35% discount:"+newItemPrice);
		return newItemPrice;
	}

}
