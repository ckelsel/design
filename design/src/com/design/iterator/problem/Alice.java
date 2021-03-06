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
package com.design.iterator.problem;

import java.util.ArrayList;

public class Alice {
	public void printMenu() {
		PancakeHouseMenu menu1 = new PancakeHouseMenu();
		ArrayList list = menu1.getMenuItems();
		for (int i = 0; i < list.size(); ++i) {
			MenuItem item = (MenuItem) list.get(i);
			System.out.println("name: " + item.getName());
			System.out.println("description: " + item.getDescription());
			System.out.println("price: " + item.getPrice());
		}
		
		DinerMenu menu2 = new DinerMenu();
		MenuItem[] list2 = menu2.getMenuItems();
		for (int i = 0; i < list2.length; ++i) {
			MenuItem item = list2[i];
			System.out.println("name: " + item.getName());
			System.out.println("description: " + item.getDescription());
			System.out.println("price: " + item.getPrice());
		}
	}
}
