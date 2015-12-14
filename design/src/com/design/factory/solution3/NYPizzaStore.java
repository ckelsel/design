package com.design.factory.solution3;

import com.design.factory.solution1.Pizza;
import com.design.factory.solution2.SimplePizzaFactory;

public class NYPizzaStore {
	SimplePizzaFactory mFactory;
	
	public NYPizzaStore(SimplePizzaFactory factory) {
		mFactory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = mFactory.createPizza(type);
		

		pizza.prepare();
		pizza.back();
		pizza.box();
		return pizza;
	}
}
