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
package com.design.factory.solution2;

import com.design.factory.solution1.Pizza;

public class PizzaStore {
	SimplePizzaFactory mFactory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		mFactory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = mFactory.createPizza(type);
		

		pizza.prepare();
		pizza.back();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
