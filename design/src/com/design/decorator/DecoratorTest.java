/**
 * Copyright (C) 2015 KunMing Xie <ckelsel@hotmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package com.design.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {
		Beverage coffee = new DarkRoast();
		System.out.println(coffee.getDescprition() + ": " + coffee.cost());
		
		coffee = new Soy(coffee);
		System.out.println(coffee.getDescprition() + ": " + coffee.cost());
		
		coffee = new Soy(coffee);
		System.out.println(coffee.getDescprition() + ": " + coffee.cost());
		
		coffee = new Mocha(coffee);
		System.out.println(coffee.getDescprition() + ": " + coffee.cost());
		
	}

}
