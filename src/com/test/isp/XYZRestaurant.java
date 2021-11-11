package com.test.isp;

public class XYZRestaurant implements VegRestaurant,NonVegRestaurant {

	@Override
	public void nonVegMeals() {
		System.out.println("We serve Nonveg Meals");
		
	}

	@Override
	public void vegMeals() {
		System.out.println("We serve veg Meals");
		
	}

}
