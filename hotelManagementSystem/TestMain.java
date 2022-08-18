package com.hotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("# FOOD CAFE SHOP #");
		System.out.println("-------------------------");
		ArrayList<Food> foodlist = new ArrayList<>();
		ManageFood managefood = new ManageFood();
		int select;
		Scanner sc = new Scanner(System.in);

		do {
			Menumain();
			select = Integer.parseInt(sc.nextLine());
			switch (select) {

			case 1:

				do {
					MenuManageFood();
					select = Integer.parseInt(sc.nextLine());
					switch (select) {
					case 1:
						managefood.sc();
						break;
					case 2:
						managefood.print();
						managefood.EditFood();
						break;
					case 3:
						managefood.print();
						managefood.DeleteFood();
						break;
					case 4:
						managefood.PrintOrder();

						break;
					case 5:
						managefood.search();
						break;
					case 0:
						System.out.println("BACK");
						break;

					default:
						break;
					}

				} while (select != 0);
				break;
			case 2:

				do {
					MenuOrder();
					select = Integer.parseInt(sc.nextLine());
					switch (select) {
					case 1:
						managefood.print();
						managefood.Price();
						break;

					case 0:
						System.out.println("BACK");
						break;

					default:
						break;
					}

				} while (select != 0);
				break;
				
			default:
				break;
				
			}
		} while (select != 3);
	}

	static void MenuManageFood() {
		System.out.println("------------------");
		System.out.println("MENU MANAGE FOOD");
		System.out.println("------------------");
		System.out.println("0. BACK to MENU MAIN");
		System.out.println("1. Add food");
		System.out.println("2. Edit food");
		System.out.println("3. Delete food");
		System.out.println("4. Print info table Order");
		System.out.println("5. Payment");
		System.out.println("----------------------------------");
		System.out.println("select");
	}

	static void MenuOrder() {
		System.out.println("-------------");
		System.out.println("MENU ORDER");
		System.out.println("-------------");
		System.out.println("0. BACK to MENU MAIN");
		System.out.println("1. Print menu food and order");
		System.out.println("----------------------------------");
		System.out.println("select");
	}

	static void Menumain() {
		System.out.println("------------------");
		System.out.println("MENU MAIN");
		System.out.println("------------------");
		System.out.println("1. Manage Food");
		System.out.println("2. Manage Order");
		System.out.println("3.EXIT");
	}

}
