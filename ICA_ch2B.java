import java.util.Scanner;
public class ICA_ch2B
{
//This is a comment. 
	public static void main (String[] args)
	{
		String username;
		String number;

		Scanner keyboard = new Scanner(System.in);


		System.out.println("What is your name?");

		username = keyboard.nextLine();
		System.out.println("What is your age?");

		number = keyboard.nextLine();

		int iVar = Integer.parseInt(number);

		System.out.println("Hello " +username + "," + "the number you gave me was " +number + 
"!");
		keyboard.close();
		}
}

