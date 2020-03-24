import java.util.Scanner;

public class TextAdventure {

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        //Prompts the user to input a new name for their persona
        System.out.println("Please enter a Pokemon Name: ");
        String pokeName = s.next();

        // Informs the user of their name
        System.out.println(pokeName + " Is a great name!");

        //Asks if the user wishes to continue
        System.out.println("\nWould you like to continue? [y/n]");
        String yesNo = s.next();
        if(yesNo.equalsIgnoreCase("y")){
            System.out.println("Great! Lets get going!");
        }else{
            System.out.println("That sucks, see you later then");
        }




    }
}
