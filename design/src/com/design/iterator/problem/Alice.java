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
