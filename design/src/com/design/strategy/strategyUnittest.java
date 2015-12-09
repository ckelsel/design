package com.design.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class strategyUnittest {

	@Test
	public void test() {
		greenDuck duck = new greenDuck();
		duck.peformFly();
		duck.peformQuack();
		duck.display();
	}

}
