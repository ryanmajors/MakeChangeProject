package com.skilldistillery.app;

import java.util.Scanner;

//		TEST CONDITIONS
//		Amount: .67, Tendered: .50, Result: Error message
//		Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//		Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//		Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//		Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.

public class MakeChange {

	public static void main(String[] args) {

//		input scanner to get price and amount tendered

		Scanner sc = new Scanner(System.in);

//		amount inits

		double price = 0;
		double amtPaid = 0;
		double change = 0;

//		total currency amounts needed for change

		double totalPennies;
		double totalNickles;
		double totalDimes;
		double totalQuarters;
		double total1Dollars;
		double total5Dollars;
		double total10Dollars;
		double total20Dollars;
		double total50Dollars;

		boolean keepGoing = true;

//		store greeting

		System.out.println("Welcome to my store!");

//		User Story #1
//		The user is prompted asking for the price of the item.
		while (keepGoing) {
			System.out.println("");
			System.out.print("Please enter the price of the item: ");
			price = sc.nextDouble();

//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.

			System.out.print("Please enter amount tendered: ");
			amtPaid = sc.nextDouble();

			System.out.println("Price of item you entered is: " + price + " Amount tendered: " + amtPaid);

//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.

			if (amtPaid < price) {
				System.out.println("You need to provide more money");
			} else if (amtPaid == price) {
				System.out.println("You paid the exact amount, no change returned.");
			}

//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
			if (amtPaid > price) {

				change = amtPaid - price;
				System.out.println("Your change is: " + change);

				total50Dollars = (int) (change / 50);
				if (total50Dollars > 0) {
					change = change % 50;
					System.out.println("This many fifties" + total50Dollars);
				}

				total20Dollars = (int) (change / 20);
				if (total20Dollars > 0) {
					change = change % 20;
					System.out.println("This many twenties: " + total20Dollars);
				}

				total10Dollars = (int) (change / 10);
				if (total10Dollars > 0) {
					change = change % 10;
					System.out.println("This many tens: " + total10Dollars);
				}

				total5Dollars = (int) (change / 5);
				if (total5Dollars > 0) {
					change = change % 5;
					System.out.println("This many fives:  " + total5Dollars);
				}

				total1Dollars = (int) (change / 1);
				if (total1Dollars > 0) {
					System.out.println("This many ones:  " + total1Dollars);
				}
				change = change % 1;
				change *= 100 + .05;

				totalQuarters = (int) (change / 25);
				if (totalQuarters > 0) {
					change = change % 25;
					System.out.println("This many quarters:  " + totalQuarters);
				}

				totalDimes = (int) (change / 10);
				if (totalDimes > 0) {
					change = change % 10;
					System.out.println("This many dimes: " + totalDimes);
				}

				totalNickles = (int) (change / 05);
				if (totalNickles > 0) {
					change = change % 05;
					System.out.println("This many nickels: " + totalNickles);
				}

				totalPennies = (int) (change / 01);
				if (totalPennies > 0) {
					change = change % 01;
					System.out.println("This many pennies:  " + totalPennies);
				}
			}
			
			System.out.print("Would you like to enter another item? (y/n): ");

			String option = sc.next();
			
			if(!option.equals("y")) {
				System.out.println("Thank you for using my store. Have a great day!");
				keepGoing = false;
			}
			
		}

		sc.close();
	}

}
