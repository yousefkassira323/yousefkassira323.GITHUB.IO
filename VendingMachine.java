/*************************************************
*
*       file: VendingMachine.java
*       author: Yousef Kassira
*       class: CS 140- Intro to Comp Science
*
*       assignment - Lab 2, Task 3
*       date last modified: 5/2/17
*
*       purpose: This program asks for a price input and
*               returns change based upon the price. 
*******************************************************/
import java.util.Scanner;
public class VendingMachine
{			
//method:main
//purpose: This program asks for a price input and
//	 returns change based upon the price.
			public static void main(String[] args)
			{
					
					final int PENNIES_PER_QUARTER = 25;
					final int 	PENNIES_PER_DIME = 10;
					final int PENNIES_PER_NICKEL = 5;
					final int PENNIES_PER_DOLLAR = 100;
					int quarters;
					int dimes;
					int nickels; 
					int price;
					final int bill = 1;
					
					 
					
					Scanner keyboard = new Scanner(System.in);
					
					System.out.print("Enter price of item ");
					System.out.println("(from 25 cents to a dollar, in 5-cent incriments): ");
					price = keyboard.nextInt();
					
					int change = (bill * PENNIES_PER_DOLLAR) - price; 
					quarters = change/25;
					change = change % PENNIES_PER_QUARTER;
					dimes = change/10; 
					nickels = change/5;
					
					System.out.println("You bought an item for " + price + " cents and gave me a dollar,");
					System.out.println("So your change is");
					System.out.println((int)quarters +" quarters ");
					System.out.println((int)dimes+ " dimes, and ");
					System.out.println((int)nickels+ " nickels.");
			}
}
