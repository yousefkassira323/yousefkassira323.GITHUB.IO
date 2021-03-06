
//Yousef Kassira
//CS 141
//Project 1 - Savings Account
//10/16/2017
import java.util.Scanner; 
import java.io.*; 
public class SavingsAccountTestFiles 
{
	static double accBal = 500.0; 
	static double monInterest; 
	static Scanner keyboard = new Scanner(System.in);
	 
	public static void main(String[] args) throws IOException
	{
		double withdrawls;
		double deposits;
		File file1 = new File("Withdrawls.txt");
	 	File file2 = new File("Deposits.txt"); 
	 	Scanner outputFile1 = new Scanner (file1);
	 	Scanner outputfile2 = new Scanner (file2); 
		System.out.println("Welcome To Your Savings Account!");
		System.out.println();
		System.out.println("What is the monthly interest rate on the account? (In Decimal Format)");
		monInterest = keyboard.nextDouble(); 

		SavingsAccount.setBalance(accBal);
		SavingsAccount.setInterestRate(monInterest); 	

		while(outputFile1.hasNextDouble())
		{
			withdrawls = outputFile1.nextDouble();
			SavingsAccount.withdraw(withdrawls); 
		}

		while(outputfile2.hasNextDouble())
		{
			deposits = outputfile2.nextDouble();
			SavingsAccount.deposit(deposits);
		}

		System.out.println();
		System.out.println();

		SavingsAccount.addInterest(); 

		SavingsAccount.printBal();
	}
}