/**************************************************
*
*	file: Kassira_Invoice.java
*	author: Yousef Kassira
*	class: CS 140 - Introduction to Computer Science
*
*	assignment: Program 3 
*	date last modified: 4/30/17
*
*	purpose: This program uses switch and if statements to create
*	an invoice of a gas purchase. It will also apply a 10 cent  discount if the
*	customer is a member.
****************************************************************************************/ 
import java.util.Scanner;
public class Kassira_Invoice
{
//method: main
//purpose: purpose: This program uses switch and if statements to create
//        an invoice of a gas purchase. It will also apply a 10 cent  discount if the 
//        customer is a member.

	public static void main(String[] args)
	{
		final double EIGHT_SEVEN = 2.47;
		final double EIGHT_NINE = 2.58;
		final double NINE_ONE = 2.61; 
		final double COUNTY = .07;
		final double CITY = .0375; 
		final double DISCOUNT = -.10;  
		int quality; 
		int gallons;
		String member = ("yes");
		String member2 = (new String(member));
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Are you a member?");
		member = keyboard.nextLine();
		
		System.out.println("Quality of gas: ");
		quality = keyboard.nextInt();  
		
		System.out.println("Gallons Sold: ");
		gallons = keyboard.nextInt();
		
		double gasPrice;
		
		switch (quality)
		{
			case 87:
			gasPrice = EIGHT_SEVEN;
			if(member.equals(member2))
			{
				gasPrice =  EIGHT_SEVEN-.10; 
				System.out.println("         INVOICE FOR GASOLINE");
                System.out.println("          Member Status: " + member);
                System.out.println("      Gasoline Sold/Price: " + gallons + " @ $" + gasPrice );
                System.out.println();
                System.out.printf("          Subtotal: $%6.2f \n", gasPrice*gallons);
                System.out.printf("        County Tax: $%6.2f \n", gasPrice*gallons*COUNTY);
                System.out.printf("          City Tax: $%6.2f \n", gasPrice*gallons*CITY);
                System.out.println("                  --------------");
                System.out.printf("              Total: $%6.2f \n", (gasPrice*gallons*COUNTY+ gasPrice*gallons*CITY +gasPrice*gallons));
			}
		else
		{
				System.out.println("         INVOICE FOR GASOLINE");
                System.out.println("          Member Status: " + member);
                System.out.println("      Gasoline Sold/Price: " + gallons + " @ $" + gasPrice );
                System.out.println();
                System.out.printf("          Subtotal: $%6.2f \n", gasPrice*gallons);
                System.out.printf("        County Tax: $%6.2f \n", gasPrice*gallons*COUNTY);
                System.out.printf("          City Tax: $%6.2f \n", gasPrice*gallons*CITY);
                System.out.println("                  --------------");
                System.out.printf("              Total: $%6.2f \n", (gasPrice*gallons*COUNTY+ gasPrice*gallons*CITY +gasPrice*gallons));
		}
			
			
		
		break;
		
			
			
			case 89:
			gasPrice = EIGHT_NINE;		
		if(member.equals(member2))
			{
				gasPrice =  EIGHT_NINE-.10; 
				System.out.println("         INVOICE FOR GASOLINE");
                System.out.println("          Member Status: " + member);
                System.out.println("      Gasoline Sold/Price: " + gallons + " @ $" + gasPrice );
                System.out.println();
                System.out.printf("          Subtotal: $%6.2f \n", gasPrice*gallons);
                System.out.printf("        County Tax: $%6.2f \n", gasPrice*gallons*COUNTY);
                System.out.printf("          City Tax: $%6.2f \n", gasPrice*gallons*CITY);
                System.out.println("                  --------------");
                System.out.printf("              Total: $%6.2f \n", (gasPrice*gallons*COUNTY+ gasPrice*gallons*CITY +gasPrice*gallons));
			}
		else
		{
				System.out.println("         INVOICE FOR GASOLINE");
                System.out.println("          Member Status: " + member);
                System.out.println("      Gasoline Sold/Price: " + gallons + " @ $" + gasPrice );
                System.out.println();
                System.out.printf("          Subtotal: $%6.2f \n", gasPrice*gallons);
                System.out.printf("        County Tax: $%6.2f \n", gasPrice*gallons*COUNTY);
                System.out.printf("          City Tax: $%6.2f \n", gasPrice*gallons*CITY);
                System.out.println("                  --------------");
                System.out.printf("              Total: $%6.2f \n", (gasPrice*gallons*COUNTY+ gasPrice*gallons*CITY +gasPrice*gallons));
		}
			
		
		break;
		
			
			case 91:
			gasPrice = NINE_ONE; 
		if(member.equals(member2))
			{
				gasPrice =  NINE_ONE-.10; 
				System.out.println("         INVOICE FOR GASOLINE");
                System.out.println("          Member Status: " + member);
                System.out.println("      Gasoline Sold/Price: " + gallons + " @ $" + gasPrice );
                System.out.println();
                System.out.printf("          Subtotal: $%6.2f \n", gasPrice*gallons);
                System.out.printf("        County Tax: $%6.2f \n", gasPrice*gallons*COUNTY);
                System.out.printf("          City Tax: $%6.2f \n", gasPrice*gallons*CITY);
                System.out.println("                  --------------");
                System.out.printf("              Total: $%6.2f \n", (gasPrice*gallons*COUNTY+ gasPrice*gallons*CITY +gasPrice*gallons));
			}
		else
		{
				System.out.println("         INVOICE FOR GASOLINE");
                System.out.println("          Member Status: " + member);
                System.out.println("      Gasoline Sold/Price: " + gallons + " @ $" + gasPrice );
                System.out.println();
                System.out.printf("          Subtotal: $%6.2f \n", gasPrice*gallons);
                System.out.printf("        County Tax: $%6.2f \n", gasPrice*gallons*COUNTY);
                System.out.printf("          City Tax: $%6.2f \n", gasPrice*gallons*CITY);
                System.out.println("                  --------------");
                System.out.printf("              Total: $%6.2f \n", (gasPrice*gallons*COUNTY+ gasPrice*gallons*CITY +gasPrice*gallons));
		}
			
		break;

	
			default:
			System.out.println("Not Allowed");
						
			 keyboard.close();
					
			}	
		
	}

}
