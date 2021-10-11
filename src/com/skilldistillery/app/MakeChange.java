package com.skilldistillery.app;

import java.util.Scanner;

//		TEST CONDITIONS
//		Amount: .67, Tendered: .50, Result: Error message
//		Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//		Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dimes, 1 nickel, 1 penny.
//		Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//		Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.

public class MakeChange {

//	scanner created for user input

	static Scanner sc = new Scanner(System.in);

//  boolean created for continuous user interaction

	static boolean keepGoing = true;

//  main method to fore code execution	

	public static void main(String[] args) {

		// store greeting and checkout option

		menu();
		int checkout = sc.nextInt();

		if (checkout == 1) {
			register();

		} else if (checkout == 2) {

			// quit option message

			System.out.println("Please restart the program when you are ready to checkout!");
		}

	}
	
//  Checkout menu 

	public static void menu() {
		System.out.println("***************************************");
		System.out.println("*                                     *");
		System.out.println("*                                     *");
		System.out.println("*    ~ Welcome to Ryan's Grocers ~    *");
		System.out.println("*                                     *");
		System.out.println("*      Are you ready to checkout?     *");
		System.out.println("*                                     *");
		System.out.println("*  Please type 1 or 2 then hit Enter  *");
		System.out.println("*                                     *");
		System.out.println("*     1.   Yes                        *");
		System.out.println("*                                     *");
		System.out.println("*     2.   No                         *");
		System.out.println("*                                     *");
		System.out.println("*                                     *");
		System.out.println("***************************************");
	}

// method created for register functionality
	
	public static void register() {

		// continuous loop until quit

		while (keepGoing) {

			// amount inits

			double price, amtPaid, change;

			// total currency amounts needed for change

			double pennies, nickels, dimes, quarters, oneDollar, fiveDollars, tenDollars, twentyDollars, fiftyDollars, hundredDollars;

			// User Story #1
			// The user is prompted asking for the price of the item.
			
			System.out.println("");
			System.out.print("Please enter the price of the item: $");
			price = sc.nextDouble();

			// User Story #2
			// The user is then prompted asking how much money was tendered by the customer.

			System.out.print("\nPlease enter amount given to cashier: $");
			amtPaid = sc.nextDouble();

			// (Optional repeat of item price and how much was paid)
			// System.out.printf("\nThe price of item you entered is: $%.2f\n\nThe amount paid to cashier: $%.2f\n", price, amtPaid);

			// User Story #3
			// Display an appropriate message if the customer provided too little money or
			// the exact amount.

			if (amtPaid < price) {
				System.out.println("\nYou do not have enough money.\n\nPlease restart the program when you have enough.\n\nGoodbye.");
				break;
				
				
			} else if (amtPaid == price) {
				System.out.println("\nYou paid the exact amount, no change returned.");
			}

			// User Story #4
			// If the amount tendered is more than the cost of the item, display the number
			// of bills and coins that should be given to the customer.
			if (amtPaid > price) {

				change = amtPaid - price;
				System.out.printf("\nYour change is: $%.2f\n", change);
				System.out.println("\nGiven back to you in the following bills and or coins.\n");

				hundredDollars = (int) (change / 100);
				if (hundredDollars > 0) {
					change = change % 100;
					if (hundredDollars > 1) {
						System.out.println((int) hundredDollars + " Hundred dollar bills");
						
					} else {
						System.out.println((int) hundredDollars + " Hundred dollar bill");
					}
				}
				fiftyDollars = (int) (change / 50);
				if (fiftyDollars > 0) {
					change = change % 50;
					if (fiftyDollars > 1) {
						System.out.println((int) fiftyDollars + " Fifty dollar bills");
						
					} else {
						System.out.println((int) fiftyDollars + " Fifty dollar bill");
					}
				}

				twentyDollars = (int) (change / 20);
				if (twentyDollars > 0) {
					change = change % 20;
					if(twentyDollars > 1) {
						System.out.println((int) twentyDollars + " Twenty dollar bills");
					} else {
					System.out.println((int) twentyDollars + " Twenty dollar bill");
					}
				}

				tenDollars = (int) (change / 10);
				if (tenDollars > 0) {
					change = change % 10;
					if (tenDollars > 1) {
						System.out.println((int) tenDollars + " Ten dollar bills");
					} else {
						System.out.println((int) tenDollars + " Ten dollar bill");
						
					}
				}

				fiveDollars = (int) (change / 5);
				if (fiveDollars > 0) {
					change = change % 5;
					if (fiveDollars > 1) {
						System.out.println((int) fiveDollars + " Five dollar bills");
					} else {
						System.out.println((int) fiveDollars + " Five dollar bill");
					}
				}

				oneDollar = (int) (change / 1);
				if (oneDollar > 0) {
					change = change % 1;
					if(oneDollar > 1) {
						System.out.println((int) oneDollar + " One dollar bills");
					} else {
						System.out.println((int) oneDollar + " One dollar bill");
					}
				}
				change *= 100 + .05;
				
				
				quarters = (int) (change / 25);
				if (quarters > 0) {
					change = change % 25;
					if (quarters > 1) {
						System.out.println((int) quarters + " quarters");
					} else {
						System.out.println((int) quarters + " quarter");
					}
				}

				dimes = (int) (change / 10);
				if (dimes > 0) {
					change = change % 10;
					if(dimes > 1) {
						System.out.println((int) dimes + " dimes");
					} else {
						System.out.println((int) dimes + " dime");
					}
				}

				nickels = (int) (change / 05);
				if (nickels > 0) {
					change = change % 05;
					if(nickels > 1) {
						System.out.println((int) nickels + " nickels");
					} else {
						System.out.println((int) nickels + " nickel");
					}
				}

				pennies = (int) (change / 01);
				if (pennies > 0) {
					change = change % 01;
					if(pennies > 1) {
						System.out.println((int) pennies + " pennies");
					} else {
						System.out.println((int) pennies + " penny");
					}
				}
			}

			System.out.print("\nWould you like to enter another item? (y/n): ");

			String option = sc.next();

			if (!option.equals("y")) {
				System.out.println("Thank you for using my store. Have a great day!");
				keepGoing = false;
			}

		}
		sc.close();
	}
}
