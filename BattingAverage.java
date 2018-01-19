import java.util.Scanner; 
import java.io.*; 
public class BattingAverage {
public static void main(String[] args) {
	
	String PlayerStatsFile = "PlayerStats.txt"; 
	int atBats; 
	int hits; 
	double battingAve; 
	String player; 
	Scanner keyboard = new Scanner(System.in); 

	FileWriter outputFile = new FileWriter("PlayerStats.txt"); 

	for(int i=0; i<12; i++)
	{
	

		System.out.println("Enter The Name of Player: ");
		player = keyboard.nextLine(); 
		outputFile.println(player); 


		System.out.println("Enter Number of At-Bats: ");
		atBats = keyboard.nextInt();
		outputFile.println(atBats);

		System.out.println("Enter the Number of Hits: ");
		hits = keyboard.nextInt(); 
		outputFile.println(hits); 

		battingAve = (atBats/hits); 

		outputFile.println(battingAve);

	}
}

}