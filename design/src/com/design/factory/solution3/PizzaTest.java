package com.design.factory.solution3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.design.factory.solution1.Pizza;
import com.design.factory.solution2.PizzaStore;

public class PizzaTest {

	@Test
	public void test() {
		PizzaStore store = new PizzaStore(new CaliforniaPizzaFactory());
		Pizza pizza = store.orderPizza("clam");
	}
	
	@Test
	public void test2() {
		PizzaStore store = new PizzaStore(new NYPizzaFactory());
		Pizza pizza = store.orderPizza("clam");
	}
}
