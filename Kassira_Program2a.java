/***********************************************************
*       file: Kassira_Program2a.java
*       author: Yousef Kassira
*       class: CS 141 - Introduction To Computer Science
*
*       assignment: Prograam 2 - Part A
*       date last modified: 4/20/2017
*
*       purpose: This program accepts input from the keyboard, and 
*	converts miles,feet and inches to meters.
*********************************************************************/
 import java.util.Scanner;
public class Kassira_Program2a
{
//method:String method
//purpose: this method helps convert Miles, inches and feet into 
// meters. 
	public static void main(String[] args)
	{
		double miles;
		double feet;
		double inches;
		double milesToMeters;
		double feetToMeters;
		double inchesToMeters;
		
		

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter Miles:");
		miles = keyboard.nextDouble();
		milesToMeters = miles*5280/3.3;
		
		System.out.println("Enter Feet:");
		feet = keyboard.nextDouble();

		feetToMeters = feet/3.3;
		
	
		System.out.println("Enter Inches:");
		inches = keyboard.nextDouble();
		inchesToMeters = (inches/12)/3.3;
		

		System.out.println((int)miles +  " mile(s), " + (int)feet +  " feet, " + (int)inches + " inche(s)" + " converts to  " + Math.round((milesToMeters + feetToMeters + inchesToMeters)*10)/10.0 + " meter(s)");
		keyboard.close();
		}
}
		
		
