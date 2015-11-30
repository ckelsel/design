package com.design.duck;

public class greenDuck extends duck {
	quackable mquack = new quackSlient();
	flyable mfly = new flyWithWing();
	
	void display() {
		System.out.println("i am a greenDuck");

	}
	
	void peformQuack() {
		mquack.quack();
	}
	

	void peformFly() {
		mfly.fly();
	}
}
