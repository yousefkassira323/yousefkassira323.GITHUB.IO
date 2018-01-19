/*****************************************************
*
*	file: Kassira_ArrayProcessing.java
*	author: Yousef Kassira
*	class: CS 140 - Intro To Com Sci
*	
*	assignment: Program 6
*	date last modified: 5/7/17
*
*	purpose: This program reads from an array and prints
*			 its elements in rows of 10. It also saves the even
*			 and odd elements onto text files. 
*
*
*********************************************************/
import java.io.*;
import java.util.Scanner; 
public class Kassira_ArrayProcessing
{
		static String filename; 
		static String line; 
		static int[] array; 
		static int n; 
		static int x; 
		static int sum; 
		static int total; 
		static int min; 
		static int num; 
		static int max; 
		static double mean; 
		
//Method: InputData
//purpose: this method will ask the user for a file and read
//in the file location, if the input file does not exist it will give 
//an appropriate error message and terminate the program. Otherwise, it
//will create an array and store the integers from the file in the array.
		public static int[] InputData()
				throws IOException
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a filename: ");
			filename = keyboard.nextLine(); 
			File file = new File(filename);
			
			if(!file.exists())
			{
				System.out.println("File does not exist");
				System.exit(0); 
			}		
			Scanner inputFile = new Scanner(file);		
			
			if(file.exists())
			{			
				n = inputFile.nextInt(); 
				array = new int[n]; 
				
				for(int i=0; i<n; i++)
				{
				x = inputFile.nextInt(); 
				array[i] = x;
				}
			}
			System.out.println();
			return array; 
		}
//Method: printArray
//Purpose: this method prints out the passed in array to the
//screen with 10 integers per line, and uses the printf method to
//align the data in columns.
		public static void printArray(int[] array)
		{
			System.out.println("Printing Array:"); 
			System.out.print("  ");
			for(int i =0; i <array.length; i++)
			{
				if(i%10 ==0 && i!=0)
				{
				System.out.println(); 
				System.out.print("  ");
				}
				System.out.printf("%5d",array[i]); 
			}
			System.out.println();
			System.out.println();	
		}
//Method: reverseArray
//Purpose: this method prints out the passed in array in reverse order
//to the screen, and uses the printf method to align the data in columns.
		public static void reverseArray(int[] array)
		{
			System.out.println("Printing Reversed Array:"); 
			System.out.print("  ");
			for(int i =(array.length -1); i >=0; i--)
			{
				if((array.length-1 -i)%10 ==0 && (array.length-1 -i)!=0)
				{
				System.out.println(); 
				System.out.print("  ");
				}
				System.out.printf("%5d",array[i]); 
			}
			System.out.println();
			System.out.println();			
		}
//Method: sum
//Purpose: this method computes and returns the sum of the passed in array.
		public static int sum(int[] array)
		{
			sum = 0; 
			for(int i=0; i<array.length; i++)
			{
				sum =(sum+ array[i]); 
			}
			return sum; 
		}
//Method: mean
//Purpose:  this method computes and returns the mean of the passed in
//array.
		public static double mean(int[] array)
		{
			total=0;
			for(int i=0; i<array.length; i++)
			{
				total = (total+array[i]); 				
			}
			mean = ((total*1.0)/array.length);
			return mean; 
		}
//Method: min
//Purpose: this method computes and returns the minimum of the passed in array.
		public static int min(int[] array)
		{
			min = Integer.MAX_VALUE; 
			for(int i=0; i<array.length; i++)
			{
				num = array[i]; 
				if(num<min)
				{
					min = num; 
				}
			}
			return min; 
		}
//Method: max
//Purpose: this method computes and returns the maximum of the passed in array.
		public static int max(int[] array)
		{
			 max = Integer.MIN_VALUE; 
			for(int i=0; i<array.length; i++)
			{
				num = array[i]; 
				if(num>max)
				{
					max = num; 
				}
			}
			return max; 
		}
//Method: evenOdd
//Purpose: this method will create the output files "even.out"
//and "odd.out", scan through the passed in array and if an element
//is even write it to the even.out file, otherwise write it to the odd.out file.
		public static void evenOdd(int[] array)
				throws IOException
		{
			PrintWriter even = new PrintWriter("even.out");
			PrintWriter odd = new PrintWriter("odd.out"); 
			
			for(int i=0; i<array.length; i++)
			{
				if(array[i] % 2 ==0)
				{
					even.println(array[i]);
				}
				if(array[i] % 2 !=0)
				{
					odd.println(array[i]);
				}
					
			}
			even.close();
			odd.close();
		
		}
//Method: main
//Purpose: Calls different methods to print the result of the 
// program. 
		public static void main(String[] args)
					throws IOException
		{
			InputData(); 
			printArray(array);
			reverseArray(array); 
			evenOdd(array); 
			System.out.println("The sum of all elements is: "+ sum(array));
			System.out.printf("%s%.2f\n","The mean of all elements is: ",mean(array)); 
			System.out.println("The minimum of all elements is: "+min(array));
			System.out.println("The maximum of all elements is: "+max(array));
			System.out.println();
			System.out.println("Program completed, remember to inspect 'even.out' and 'odd.out' files.");
			System.out.println();
		}
}