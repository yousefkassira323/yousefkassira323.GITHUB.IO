/*************************************************************
*	file: Kassira_Program2b.java
*	author: Yousef Kassira
*	class: CS 140 - Introduction to Computer Science
*
*	assignment: Program 2 - Part B
*	date last modified: 4/20/2017
*
*	purpose: This program uses a scanner to detect input
*	from the keyboard to convert meters to miles, feet and inches.
*
*************************************************************************/
import java.util.Scanner;
public class Kassira_Program2b
{
//method: string
//purpose: this method uses variables in order to complete conversions
// of meters to miles, feet and inches. 

	public static void main(String[] args)
	{
		double meters;
		double metersToMiles;
		double metersToFeet;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter Meters: ");
		meters = keyboard.nextDouble();
		double inches = meters*39.6;
		metersToMiles = (int)inches/63360;
		metersToFeet = (int)(inches-metersToMiles*63360)/12;
		double inch =(inches-metersToMiles*63360-metersToFeet*12);

		System.out.println((int)meters + "meter(s) converts to " + (int)metersToMiles + "mile(s), " + (int)metersToFeet + "feet, " + Math.round(inch*10)/10.0 + "inch(es).");
		keyboard.close();
		}
}
