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
package com.design.state;

public class SoldState implements State {
	GumballMachine mGumballMachine;
	
	SoldState(GumballMachine machine) {
		mGumballMachine = machine;
	}
	
	public void insertQuarter() {
		System.out.println("SoldState insertQuarter ignore ...");
	}

	public void ejectQuarter() {
		System.out.println("SoldState ejectQuarter ignore ...");
	}

	public void turnCrank() {
		System.out.println("SoldState turnCrank ignore ...");
	}

	public void dispense() {
		System.out.println("SoldState dispense");
		mGumballMachine.decreaseCount();
		if (mGumballMachine.getmCount() > 0) {
			mGumballMachine.setState(mGumballMachine.getmNoQuarterState());
		} else {
			mGumballMachine.setState(mGumballMachine.getmSoldOutState());
		}
	}

}
