import java.util.Scanner;
import java.io.*;
public class Avg{

 public static void main(String[] args) throws IOException{
 
      File playerStats = new File("Player.txt");
      PrintWriter input1 =  new PrintWriter(playerStats);


   Scanner keyb = new Scanner(System.in);
   System.out.println("What is the name of the player?");
   String name = keyb.nextLine();
   input1.println(name);
   
    double atBats = AtBats();
   input1.println(atBats);

   double hits = Hits();
   input1.println(hits);
  
   
   double Avg = (hits/atBats);
   input1.println((Avg*1000)/1000.0);
   
   System.out.printf("%s Had a Batting Average of: %.3f",name,Avg);
   
   
   input1.close();


}

public static int Hits()

{
   Scanner keyb = new Scanner(System.in);
   System.out.println("How many times did the batter Hit?");
   
   int hits = keyb.nextInt();

   return hits;
   
}

public static int AtBats()

{
   Scanner keyb = new Scanner(System.in);
   
   
   System.out.println("How many At-Bats?");
   int atBats = keyb.nextInt(); 
 
   return atBats;
}
}