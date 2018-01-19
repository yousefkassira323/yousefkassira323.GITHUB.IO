import java.util.Scanner; 
public class PrimeCheck
{
		 
		public static void main(String[] args)
		{
			int num;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter number: ");
			num = keyboard.nextInt(); 
			
			if(isPrime(num) == true)
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
					
		}
		
		public static boolean isPrime(int i)
		{
						
			for(int x =2; x<i; x++) 
			{
				if(i % x == 0 )
						return false;	
					
			}	
			return true;
		}
}