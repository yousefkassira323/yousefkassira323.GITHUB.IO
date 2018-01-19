import java.util.*;
import java.io.*;

public class ICE_CupOfJava
{
       private static PrintWriter outputFile;

       public static void main(String[] args) throws IOException
       {

        /* Opens a file containing the usernames and passwords of account
        holders */
               File    usersFile = new File("passwords.txt");

        /* If the file does not exist, the file is then created. If the
        file does exist, FileWriter and PrintWriter are used so that the
        file is appended to, not overwritten */
               if (!usersFile.exists())
               {
                       PrintWriter createIt = new PrintWriter("passwords.txt");
               }

        FileWriter fwriter = new FileWriter("passwords.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

               Scanner keyboard = new Scanner(System.in);
               Scanner inputFile = new Scanner(usersFile);

               System.out.println("Log in (Enter L)");
               System.out.println("Create new account: (Enter C)");

               String choice = keyboard.nextLine();

               if (choice.equals("L") || choice.equals("l"))
               {
                       System.out.print("Please enter your username: ");
                       String username = keyboard.nextLine();

                       String word = "what are the odds someone would choose this?";

            if (!inputFile.hasNext())
            {
                System.out.print("It looks like that username "
                + "does not exist. Please try again. ");
                username = keyboard.nextLine();
            }
            else
                word = inputFile.nextLine();
            while (!username.equals(word))
            {
                               if (!inputFile.hasNext())
                               {
                                       System.out.print("It looks like that "
                                       + "username does not exist. Please "
                                       + "try again. ");

                    username = keyboard.nextLine();

// note to self - the code below was unnecessary. The pointer does loop back around.
//                                        inputFile.close();
//                                        Scanner inputFile = new Scanner(usersFile);
                               }
                else
                    word = inputFile.nextLine();
            }

                       String password = inputFile.nextLine();

                       System.out.print("Please enter your password: ");
                       String userPass = keyboard.nextLine();

                       int counter = 1;

                      while (!password.equals(userPass))
                       {
                               if (counter == 5)
                               {
                                       System.out.print("You have entered "
                                               + "the wrong password too "
                                               + "many times. You will now "
                                               + "exit the program. Goodbye.");

                                       System.exit(0);
                               }

                               System.out.print("I'm sorry, that password "
                                       + "was incorrect. Please try again "
                                       + "and keep in mind that passwords "
                                       + "are case sensitive: ");
                userPass = keyboard.nextLine();

                               ++counter;
                       }
              }

               else if (choice.equals("C") || choice.equals("c"))
               {
                       System.out.print("Please enter the username for "
                               + "your account: ");
                       String newName = keyboard.nextLine();
                       System.out.print("Please enter a password for "
                               + "your account. Please keep in mind "
                               + "that passwords are case sensitive: ");
                       String  newPass = keyboard.nextLine();

                       outputFile.println(newName);
                       outputFile.println(newPass);

               }

               inputFile.close();
               outputFile.close();
               musicChooser();

       }

    public static void musicChooser()
    {
           //Initializing variables
           String songName = "";
           String genre = "";
           String option = "";
           String[] genreSongs = null;
           Scanner input = new Scanner(System.in);

           //Creating & filling the song name arrays
           String[] rockSongs = {"Jump by Van Halen","Dream On by Aerosmith",
        "Welcome to the Jungle by Guns and Roses",
        "Have You Ever Needed Someone So Bad by Def Leppard",
        "Scar Tissue By Red Hot Chili Peppers"};
           String[] popSongs = {"Barbie Girl by Aqua","C'mon by Ke$ha",
        "Bad Liar by Selena Gomez","Friends by Justin Bieber",
        "Body Language by Carly Rae Jepsen"};
           String[] countrySongs = {"Your Man by Josh Turner",
        "Check Yes or No by George Strait","Want Crazy by Hunter Hayes",
        "Made In America by Toby Keith","Just to See You Smile by Tim McGraw"};

           //Prompts user to choose a genre
           System.out.print("Please choose the index of one of the following "
        + "genres:\n1. Rock\n2. Pop\n3. Country\n");
           String choice = input.nextLine();
           System.out.println();

           //If-else statements
           if(choice.equals("1"))
           {
              genre = "rock";
              genreSongs = rockSongs;
           }
           else if(choice.equals("2"))
           {
              genre = "pop";
              genreSongs = popSongs;
           }
           else if(choice.equals("3"))
           {
              genre = "country";
              genreSongs = countrySongs;
           }
           else
           {
              System.out.println("Error, please try again.");
              musicChooser();
           }

           //Prints song list and prompts user to choose one
           System.out.println("You chose " + genre + ".");

        for(int i = 0; i < genreSongs.length; i++)
           {
                   System.out.print(i+1 + ". " + genreSongs[i] + "\n");
           }
           System.out.print("Enter the index of desired song: ");
           System.out.println();
           songName = genreSongs[input.nextInt()-1];
           input.nextLine();

           //Prints what the user is listening to along with options
           System.out.println("You are listening to " + songName + "\n");

           System.out.println("Type 'exit' to terminate the program\n"
        + "Type 'new' to choose another song");

           //Do while loop containing a switch statement. If a nonexistent
        //option is entered, it is denied and the switch restarts itself.
           boolean restartSwitch = true;
           do
           {
              restartSwitch = false;
                 option = input.nextLine();
              switch(option)
              {
                   case "exit":System.exit(0);

                   case "new":    musicChooser();

                   default: restartSwitch = true;
                   System.out.println("Invalid option.");  
              }
           } while(restartSwitch = true);
    }
}
