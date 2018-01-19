/*************************************************
*
*       file: VendingMachine.java
*       author: Yousef Kassira
*       class: CS 140- Intro to Comp Science
*
*       assignment - Lab 2, Task 4
*       date last modified: 5/2/17
*
*       purpose: This program uses switch statements to print
*               whether the given integer is even or odd. 
*******************************************************/
//analysis of numbers
import java.util.Scanner;
public class isEven
{
//method:main
//purpose: This program uses switch statements to print
//	whether the given integer is even or odd.
                public static void main(String[] args)
                {
                        boolean evenOdd = false;
                        Scanner keyboard= new Scanner(System.in);

                        System.out.println("Enter an integer from 0-10: ");
                        int n = keyboard.nextInt();


                        switch(n)
                        {
                                case 0:
                                System.out.println("The number " + n + " is even!");
                                break;
                                case 1:
                                System.out.println("The number " + n + " is odd!");
                                break; 
                                case 2:
                                System.out.println("The number " + n + " is even!");
                                break; 
                                case 3:
                                System.out.println("The number " + n + " is odd!");
                                break; 
                                case 4:
                                System.out.println("The number " + n + " is even!");
                                case 5:
                                System.out.println("The number " + n + " is odd!");
                                break;
                                case 6:
                                System.out.println("The number " + n + " is even!");
                                break;
                                case 7:
                                System.out.println("The number " + n + " is odd!");
                                break;
                                case 8:
                                System.out.println("The number " + n + " is even!");
                                break;
                                case 9:
                                System.out.println("The number " + n + " is odd!");
                                break;
                                case 10:
                                System.out.println("The number " + n + " is even!");
                                break;
                                default:
                                System.out.println("Not Allowed");
                                break;
                        }
                        keyboard.close();
                                
                        }
}
                                


