import java.util.Scanner;
import java.util.Random;
public class Exam
{
	public static void main(String[] args)
	{
	   System.out.println(dice(2)); 
   }
   
   public static int dice(int x)
   {
      Random rand = new Random(); 
      
      int die1 = rand.nextInt(x); 
      int die2 = rand.nextInt(x); 
      
      int tot = (die1+die2); 
      
      return tot; 
   }
 }