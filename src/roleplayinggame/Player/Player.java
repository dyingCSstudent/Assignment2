package roleplayinggame.Player;

import roleplayinggame.Items.Inventory;

/**
 * This is a normal class of the Player class which is controlled by the user
 * The class defines and controls the attributes relating to the Player
 * @author Swapnil Kumar 17982217
 */
public class Player {
    
    /**
     * These attributes of the Player class
     * name is the Player name that the user may choose
     * health is the health that the Player has at the current moment
     * damage is the amount of damage that the player can deal
     * armour is the amount of armour the player has which can reduce the amount of damage the Player may take
     * gold is the amount of gold the Player has to spend
     * isDead is a boolean that will be false if the player is alive or true if the player dies(ie: if health becomes 0)
     * inventory is of an Inventory class type that will be an arraylist of the Items that the player has
     * equipped is of an Inventory class type that will be and arraylist of Items that the player has currently equipped
     */
    private String name;
    int health;
    int damage;
    int armour;
    int gold;
    boolean isdead;
    private Inventory inventory;
    private Inventory equipped;
    
    /**
     * This constructor initializes the Player class
     * 
     * @param name sets the Player name
     * @param health sets the Player health
     * @param damage sets the Player damage
     * @param armour sets the Player armour
     * @param gold sets the Player gold
     * @param isdead sets the Player isdead
     */ 
    public Player(String name, int health, int damage, int armour, int gold, boolean isdead){
        
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armour = armour;
        this.gold = gold;
        this.isdead = isdead;
        this.inventory = new Inventory();
        this.equipped = new Inventory();
    }
    
    /**
     * This is a setter method for the name
     * @param username is what the Player name becomes
     */
    public void setName(String username){
        this.name = username;
    }
    
    /**
     * This is the getter method for the Player name
     * @return String returns the name of the Player
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * This is the setter method for the Player Health
     * @param i is the amount that will be subtracted from health
     */
    public void setHealth(int i){
        this.health = this.health - i;
    }
    
    /**
     * This is the getter method for the Player health
     * @return Integer returns the current Player health
     */
    public int getHealth(){
        return this.health;
    }
    
    /**
     * This the the toString method that will help display some of the Player attributes
     * @return String will return some attributes in a String format
     */
    @Override
    public String toString(){
        return "Name: " + this.name +",\n"+ "Health: " + this.health +", \n"+ "Damage: " + this.damage +", \n"+ "Armour: " + this.armour +", \n"+ "Gold: " + this.gold +", \n"+ "Dead: " + this.isdead;
    }
    
    /**
     * This method will allow the player to attack and deal damage to other object types that have a health value
     * @return damageDealt is the amount of damage that will inflict on a target
     */
    public int attack() {
        int damageDealt;
        damageDealt = this.damage;
        return damageDealt;
    }
    
    /**
     * This method allows access to the inventory
     * @return inventory will return the inventory of the player
     */
    public Inventory accessInventory(){
        return inventory;
    }
}