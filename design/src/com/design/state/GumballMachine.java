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

public class GumballMachine {
	int mCount;
	State mCurrentState;
	NoQuarterState mNoQuarterState;
	HasQuarterState mHasQuarterState;
	SoldOutState mSoldOutState;
	SoldState mSoldState;
	WinnerState mWinnerState;
	
	GumballMachine(int numGumball) {
		mCount = numGumball;
		mNoQuarterState = new NoQuarterState(this);
		mHasQuarterState = new HasQuarterState(this);
		mSoldOutState = new SoldOutState(this);
		mSoldState = new SoldState(this);
		mWinnerState = new WinnerState(this);
		
		if (mCount > 0) {
			mCurrentState = mNoQuarterState;
		} else {
			mCurrentState = mSoldOutState;
		}
	}
	

	public void insertQuarter() {
		mCurrentState.insertQuarter();
	}

	public void ejectQuarter() {
		mCurrentState.ejectQuarter();
	}

	public void turnCrank() {
		mCurrentState.turnCrank();
		mCurrentState.dispense();
	}
	
	public void setState(State state) {
		mCurrentState = state;
	}
	
	public void decreaseCount() {
		if (mCount > 0) {
			mCount--;
			setState(mNoQuarterState);
		} else {
			mHasQuarterState.ejectQuarter();
			setState(mSoldOutState);
		}
	}


	public int getmCount() {
		return mCount;
	}


	public State getmCurrentState() {
		return mCurrentState;
	}


	public NoQuarterState getmNoQuarterState() {
		return mNoQuarterState;
	}


	public HasQuarterState getmHasQuarterState() {
		return mHasQuarterState;
	}


	public SoldOutState getmSoldOutState() {
		return mSoldOutState;
	}


	public SoldState getmSoldState() {
		return mSoldState;
	}


	public WinnerState getmWinnerState() {
		return mWinnerState;
	}
	
}
