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

	PrintWriter outputFile = new PrintWriter(PlayerStatsFile); 

	for(int i=0; i<12; i++)
	{
	

		System.out.println("Enter The Name of Player: ");
		player = keyboard.nextLine(); 
		outputfile.println(player); 


		System.out.println("Enter Number of At-Bats: ");
		atBats = keyboard.nextInt();
		outputfile.println(atBats);

		System.out.println("Enter the Number of Hits: ");
		hits = keyboard.nextInt(); 
		outputfile.println(hits); 

		battingAve = (atBats/hits); 

		outputfile.println(battingAve);

	}
}

}