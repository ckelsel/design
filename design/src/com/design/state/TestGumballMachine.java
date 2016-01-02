package com.design.state;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGumballMachine {

	@Test
	public void test() {
		System.out.println("test:");
		GumballMachine m = new GumballMachine(3);
		m.insertQuarter();
		m.ejectQuarter();
		m.turnCrank();
	}

	@Test
	public void test2() {
		System.out.println("test2:");
		GumballMachine m = new GumballMachine(3);
		m.insertQuarter();
		m.turnCrank();
		m.turnCrank();
	}
}
