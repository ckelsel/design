/**-------------------------------------------------------------------------
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
package com.design.iterator.solution1;

import com.design.iterator.problem.MenuItem;

public class Alice {
	private void print(MenuIterator iter) {

		while (iter.hasNext()) {
			MenuItem item = (MenuItem) iter.next();
			System.out.println("name: " + item.getName());
			System.out.println("description: " + item.getDescription());
			System.out.println("price: " + item.getPrice());
		}
	}
	
	public void printMenu() {
		PancakeHouseMenu menu1 = new PancakeHouseMenu();
		MenuIterator iter = menu1.createIterator();
		System.out.println("PancakeHouseMenu:");
		print(iter);
		
		DinerMenu menu2 = new DinerMenu();
		iter = menu2.createIterator();
		System.out.println("\nDinerMenu:");
		print(iter);
	}
}
