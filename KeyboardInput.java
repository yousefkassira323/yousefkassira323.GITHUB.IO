/*************************************************
*
*       file: KeyboardInput.java
*       author: Yousef Kassira
*       class: CS 140- Intro to Comp Science
*
*       assignment - Lab 2, Task 2
*       date last modified: 5/2/17    
*
*       purpose: This program uses a scanner to detect input        
*               from the keyboard. 
*******************************************************/
import java.util.Scanner;
public class KeyboardInput
{
//method:main
// purpose: This program uses a scanner to detect input   
// 	from the keyboard. 
	public static void main(String[] args)
	{
		String name;
		int age;
		String company;
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your name?");
		name = keyboard.nextLine();
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("What is your Company Name?");
		company = keyboard.nextLine();
		
		System.out.println("My name is " + name + ", my age is " + age + " and");
		System.out.println("I hope to work for " + company);
		}
}
