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
package com.design.factory.solution3;

import com.design.factory.solution1.CheesePizza;
import com.design.factory.solution1.ClamPizza;
import com.design.factory.solution1.GreekPizza;
import com.design.factory.solution1.Pizza;
import com.design.factory.solution1.VeggiePizza;
import com.design.factory.solution2.SimplePizzaFactory;

public class NYPizzaFactory extends SimplePizzaFactory {
	public static Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("vegggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
