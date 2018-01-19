import java.util.Scanner; 
public class Late
{
	 int int1; 
	 int int2;
    int int3;
	 int int4;
	 int int5;
   int mean; 
	public  int avg(int x)
	{
		mean = x/5;
      return mean; 
	}
	
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter five integers: ");
		int1 = keyboard.nextInt();
		int2 = keyboard.nextInt();
		int3 = keyboard.nextInt();
		int4 = keyboard.nextInt();
		int5 = keyboard.nextInt();
		
		avg((int1+int2+int3+int4+int5)); 
      
      System.out.printf("The average is: %,d\n",mean); 
	
	}
}
	