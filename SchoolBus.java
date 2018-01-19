import java.util.Scanner;
import java.io.*;

public class Bus_Program {
	// Establish variables
	public static String name, day, time;
	public static int dayInt, timeInt, numKids;
	// Establish data
	public static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	public static String[] schools = {"Pomona Private Elementary and Intermediate School", "Los Angeles Polytechnic School", "Foothill Intermediate and Elementary School"};
	public static String[] times = {"7:30AM", "7:45AM", "8:00AM", "8:15AM", "8:30AM"};
	
	// method: main
	// purpose: Asks user for input, then utilizes Add_Appointment class to establish their appointment
	public static void main(String[] args) throws IOException{
		// Establish scanners
		Scanner keyboardInt = new Scanner(System.in);
		Scanner keyboardStr = new Scanner(System.in);

		// Program beginning screen
		System.out.println("Welcome to Uber Bus!\n What day would you like to set an Appointment?");
		// List available days
		for(int i = 0; i < weekDays.length; i++) {
			System.out.println("[" + (i+1) + "] " + weekDays[i]);
		}
		dayInt = keyboardInt.nextInt();

		System.out.println("What name would you like to book under?"); 
		name = keyboardStr.nextLine();

		System.out.println("How many kids would you like to book a bus for?"); 
		numKids = keyboardInt.nextInt();

		System.out.println("What time would you like to book the Appointment for?");
		// List available times
		for (int j = 0; j < times.length; j++) {
			System.out.println("[" + (j+1) + "] " + times[j]);
		}
		timeInt = keyboardInt.nextInt();

		// Load in partner class to add appointment with user's inputs
		Add_Appointment appointmentAdder = new Add_Appointment(dayInt, name, numKids, timeInt);

		// "Here's your reciept!"
		receipt(Add_Appointment.addAppointment(appDay));
	}

	public static void receipt(File finApp) {
		Scanner outputFile = new Scanner(finApp);
		String finalName; 
		int finalNum;
		String finalTime; 
		finalName = outputFile.nextLine(); 
		finalNum = outputFile.nextInt();
		finalTime = outputFile.nextLine(); 
		System.out.println("");
		System.out.println("Your Receipt:");
		System.out.println("Driver Request for "+finalName);
		System.out.println("You have requested a driver for "+finalNum+" of kids. ");
		System.out.println("Your Appointment has been set for "+finalTime+"!");
		System.out.println("Final Price: $"+finalNum*99.99);
		System.out.println("Thank You For Choosing Uber Bus!"); 

		outputFile.close(); 




		
	}

}
