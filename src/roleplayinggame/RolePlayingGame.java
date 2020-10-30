package roleplayinggame;
import database.Database;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import roleplayinggame.Items.Armour;
import roleplayinggame.Items.Weapon;
import roleplayinggame.Mobs.Bandit;
import roleplayinggame.Player.Player;

/**
 * This class called RolePlayingGame is where the main method is held
 * @author Swapnil Kumar 17982217
 */
public class RolePlayingGame {   
    
    /**
     * This is the main method of the Project where the objects are initialized
     * Would recommend increasing the size of the output console window to help see things more clearly
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Database database = new Database();
        database.autoConnectDatabase();
        
        boolean end = false;
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Welcome to your new Adventure");
        
        //This section will initialise the player and nessessary objects
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Welcome " + name +", Your current attributes: \n");
        Player player = new Player("User", 100, 10, 10, 200, false);
        player.setName(name);
        System.out.println(player+ "\n");
        Weapon w1 = new Weapon("Sword", 4, false, 25);
        player.accessInventory().add(w1);
        Armour a1 = new Armour("Breastplate", 10, false, 50);
        player.accessInventory().add(a1);
        System.out.println("Your current inventory: \n" + player.accessInventory().toString());
        
        /**
        *this section is where the user can interact with the game
        *the while loop can end either through the player input or when the player's health drop to or below 0
        */
        while (!end) {
            System.out.println("Please select a action: \n"
                    + "(1)Display Character Statistics\n"
                    + "(2)Display Inventory\n"
                    + "(3)Combat against Enemies\n"
                    + "(4)Exit the Program");
            String input = scan.nextLine();
            boolean isValid = false;
            switch (input) {
                case "1":
                    while (!isValid) {
                        try {
                            System.out.print("Current Attributes: \n");
                            System.out.println(player+ "\n");
                            isValid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input.\n");
                        }
                    }

                    break;
                case "2":
                    while (!isValid) {
                        try {                         
                            System.out.println("Your current inventory: \n" + player.accessInventory().toString());
                            isValid = true;      
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input.\n");
                        }
                    }

                    break;
                case "3":
                    while (!isValid) {
                        try {
                            Bandit b1 = new Bandit("Bandit", 20, 80, 10, 5, false);    
                            System.out.println("You encounter a Bandit and prepare to fight it. ");
                            while(b1.getHealth() > 0){
                                b1.setHealth(player.attack() + w1.getDamage());
                                player.setHealth(b1.attack());
                                if(player.getHealth() < 0){
                                    System.out.println("YOU HAVE DIED");
                                    System.exit(0);
                                }
                            }
                            isValid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input.\n");
                        }
                    }
                    System.out.println("You've won the fight");
                    System.out.println("Your health is now: " + player.getHealth()+ "\n");

                    break;
                case "4":
                    end = true;
                    break;
                default:
                    System.out.println("Invalid input.\n");
                    break;
            }
        }
    }
}