import java.util.Scanner; 
public class Australia
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); 
      int year; 
      
      System.out.println("What year were you born?");
      year = keyboard.nextInt(); 
      
      if(year<=1995 || year>=2006)
      System.out.println("You are an Australian Citizen!"); 
      
      else if(year>1995 && year<2006)
      System.out.println("You are not an Australian Citizen..."); 
   }
   
}
