package com.design.template.solution1;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		System.out.println("prepareRecipe tea:");
		Drink tea = new Tea();
		tea.prepareRecipe();
		
		System.out.println("\nprepareRecipe coffee:");
		Drink coffee = new Coffee();
		coffee.prepareRecipe();
	}

}
