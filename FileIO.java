
import java.io.*; 
import java.util.Scanner; 
public class FileIO
{
	public static void main(String[] args)
			throws IOException
	{
		Scanner keyboard = new Scanner(System.in); 
		String inFilename; 
		String outFilename;
		String outFilename2;
		
		System.out.print("enter input filename: ");

		inFilename = keyboard.nextLine();

		System.out.print("\n");

		System.out.print("enter output filename: ");

		outFilename = keyboard.nextLine();
		
		System.out.print("\n");
		
		System.out.print("enter another output filename (append) : "); 
		outFilename2 = keyboard.nextLine();
		System.out.println("Check your output files " +outFilename2+", " +outFilename);

		FileWriter fwriter1 = new FileWriter(outFilename, true);
		FileWriter fwriter2 = new FileWriter(outFilename2, true);
		PrintWriter outputFile = new PrintWriter(fwriter1);
		PrintWriter outputFile2 = new PrintWriter(fwriter2);
		File file = new File(inFilename); 
		Scanner inputFile = new Scanner(file); 
		

		String line = inputFile.nextLine
		outputFile.println(line);
		outputFile2.println(line);

		while(inputFile.hasNextLine())
		{
			line = inputFile.nextLine();
			outputFile.println(line);
			outputFile2.println(line);
		}	
		fwriter1.close();
		fwriter2.close();
		outputFile.close();
		outputFile2.close();
		inputFile.close();
	}
}
		
		
		