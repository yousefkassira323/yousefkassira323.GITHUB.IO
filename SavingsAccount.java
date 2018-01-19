//Yousef Kassira
//CS 141
//Project 1 - Savings Account
//10/16/2017
import java.util.Scanner; 
import java.io.*; 
public class SavingsAccount
 {
	
	private static double balance; 
	private static double interestRate;
	


	public SavingsAccount(double bal, double intRate)
	{
		balance = bal; 
		interestRate = intRate;

	}

	public static void withdraw(double amount)
	{
		 balance = (balance - amount); 

	}

	public static void deposit(double amount)
	{
		balance = (balance+amount); 
	}

	public static void addInterest()
	{
		balance = balance + (balance*interestRate); 
	}

	public static void setBalance(double amount)
	{
		balance = amount; 
		
	}

	public static void setInterestRate(double amount)
	{
		interestRate = amount; 
		
	}

	public static double getBalance()
	{
		return balance; 

	}

	public static double getInterestRate()
	{
		return interestRate;
	}

	public static void printBal()
	{
		System.out.printf("Your account balance is $%.2f\n",balance);
	}
}