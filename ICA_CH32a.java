/***************************************************
*
*	file: ICA_CH32a.java
*	author: Yousef Kassira
*	class: CS 140 - Intro to Comp Science
*
*	assignment: ICA Chapter 3 Part 2A
*	date last modified: 4/26/17
*
*	purpose: This program uses a switch statement to verify that the 
*	user is inputing an integer between 0 and 9.
*************************************************************************/
import java.util.Scanner; 
public class ICA_CH32a
{
//method: main
//purpose: This program uses a switch statement to verify that the
//         user is inputing an integer between 0 and 9.
	public static void main(String[] args)
	{
		int age;
	
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Insert Number");
		age = keyboard.nextInt();

		switch (age)
		{
		case 0:
			System.out.println("You pressed number " + age);
		break;
		
		case 1:
			System.out.println("You pressed number " + age);
		break;
		
		case 2:
			System.out.println("You pressed number " + age);
		break;

		case 3:
			System.out.println("You pressed number " + age);
		break;
		
		case 4:
			System.out.println("You pressed number " + age);
		break;

		case 5:
			System.out.println("You pressed number " + age);
		break;
		
		case 6:
			System.out.println("You pressed number " + age);
		break;
		
		case 7:
			System.out.println("You pressed number " + age);
		break;
		
		case 8:
			System.out.println("You pressed number " + age);
		break;

		case 9:
			System.out.println("You pressed number " + age);
		break;
		
		default:
			System.out.println("Not Allowed");
		}
		keyboard.close();
	}
}  


