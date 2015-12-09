package com.design.duck;

public class greenDuck extends duck {
	quackable mquack = new quackSlient();
	flyable mfly = new flyWithWing();
	
	public void display() {
		System.out.println("i am a greenDuck");

	}
	
	public void peformQuack() {
		mquack.quack();
	}
	

	public void peformFly() {
		mfly.fly();
	}
}
