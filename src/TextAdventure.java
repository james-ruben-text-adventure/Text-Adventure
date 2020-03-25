import java.util.Scanner;

public class TextAdventure {

    //Hero Stats
    public static int maxHealth;
    public static int currHealth;
    public static int mana;
    public static int attack;
    public static int defense;

    //Enemy Stats
    public static int enemyHealth;
    public static int currEHealth;
    public static int enemyMana;
    public static int enemyAttack;
    public static int enemyDefense;
    public static int Level;

    //Enviorment
    public static boolean fighting = false;

    //this builds the player
    public static void playerOne() {
        maxHealth = 100;
        mana = 100;
        attack = 10;
        defense = 50;

        for (int i = 0; i < currHealth; i++) {

        }
    }

    //This will create the goblin enemy method
        public static void goblin(){
            switch (Level) {
                case 1:
                    currEHealth = 10;
                    enemyAttack = 10;
                    break;
                case 2:
                    currEHealth = 15;
                    enemyAttack = 15;
                    break;
                case 3:
                    currEHealth = 20;
                    enemyAttack = 20;
            }
        }

        public static boolean attack() {
            System.out.println("Enemy Hit!");
            enemyHealth = enemyHealth - attack;
            return true;
        }
        public static boolean run() {
            System.out.println("You successfully escaped!");
            return true;
        }

        //This is the creation of the fighting method
        public static void fight(){
        Scanner s = new Scanner(System.in);
        String action;
        System.out.println("An enemy is about to attack...What will you do?");
        System.out.println("Attack[a]   Run[b]");
        action = s.nextLine();

        goblin();
        fighting = true;

        while(fighting = true) {
            if (action.equals('a')) {
                attack();
            }
            if (action.equals('b')) {
                run();
            }
        }

    }

////////////////////////////////////////////////////


    //This is the input at the start of the game.
    public static void main (String[] args){
            Scanner s = new Scanner(System.in);

            //Prompts the user to input a new name for their persona
            System.out.println("Please enter your name: ");
            String playerName = s.next();

            // Informs the user of their name
            System.out.println(playerName + " Is a great name!");

            //Asks if the user wishes to continue
            System.out.println("\nWould you like to continue? [y/n]");
            String yesNo = s.next();
            if (yesNo.equalsIgnoreCase("y")) {
                System.out.println("Great! Lets get going!");
            } else {
                System.out.println("That sucks, see you later then");
            }

            //The first event for the player
            System.out.println("You are walking through a forest and come upon two different paths.\n Which path would like to take? [left(l)/right(r)");
            while (true) {
                String leftRight = s.next();
                if (leftRight.equalsIgnoreCase("l")) {
                    System.out.println("Oh no! you ran into a goblin!?");
                    fight();
                    break;
                } else if (leftRight.equalsIgnoreCase("r")) {
                    System.out.println("You continue to skip down the forest path.");
                    break;
                } else {
                    System.out.println("Wrong choice! Try again!");
                }
            }

            System.out.println("A wild goblin appears!");
            String userInput = s.nextLine();





        }

}
