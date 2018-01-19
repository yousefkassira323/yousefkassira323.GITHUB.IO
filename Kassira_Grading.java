import java.io.*;
import java.util.Scanner; 
public class Kassira_ArrayProcessing
{
   static String filename; 
   static String line; 
   static int[] array; 
   static int n; 
   static int x; 
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
      return array; 
   }
   public static void printArray(int[] array)
   {
      System.out.println("Printing array: "); 
      if(n>=10)
      {
         for(int i=0; i<10; i++)
         {
         	
            System.out.printf("%2d%s",array[i]," ");
         }
      	
         for(int i =10; i<20; i++)
         {
         
            System.out.printf("%2d%s",array[i]," ");
         }
      }
      else {
         for(int i=0; i<n; i++)
         {
         	
            System.out.printf("%2d%s",array[i]," ");
         }
      }
      System.out.println(); 
   }
		
   public static void main(String[] args)
   				throws IOException
   {
      InputData(); 
      printArray(array);
   }
}