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

import java.util.ArrayList;

import com.design.iterator.problem.MenuItem;

public class DinerMenuIterator implements MenuIterator {
	MenuItem[] menu;
	int index;
	
	public DinerMenuIterator(MenuItem[] menu) {
		this.menu = menu;
		index = 0;
	}

	public boolean hasNext() {
		if (index < menu.length)
			return true;
		else
			return false;
	}

	public Object next() {
		return menu[index++];
	}

}
