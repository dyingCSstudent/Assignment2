package roleplayinggame.Mobs;

/**
 * This is an abstract class called Mob that will be used to create non-player entities within the game world
 * @author Swapnil Kumar 17982217
 */
public abstract class Mob {
    
    /**
     * name is the name of the Mob object
     * health is the health value of the Mob object
     * armour is the armour value of the Mob object
     * damage is the damage value of the Mob object
     * gold is the gold value of the Mob object
     * isDead is to check whether the Mob object is dead or alive
     */
    String name;
    int health;
    int armour;
    int damage;
    int gold;
    boolean isdead;
    
    /**
     *
     * @param name sets the name of the Mob object
     * @param gold sets the gold of the Mob object
     * @param health sets the health of the Mob object
     * @param damage sets the damage of the Mob object
     * @param armour sets the armour of the Mob object
     * @param isdead sets the boolean value of the Mob object
     */
    public Mob(String name, int gold, int health, int damage, int armour, boolean isdead){
        
        this.name = name;
        this.armour = armour;
        this.health = health;
        this.gold = gold;
        this.damage = damage;
        this.isdead = isdead;
    }
    
    /**
     * This getter method allows for the retrieval of this object's health value
     * @return this.health returns the health value
     */
    public int getHealth(){
        return this.health;
    }
    
    /**
     * This setter method will change the health value of this object
     * @param i is the amount that will be subtracted from the initial value
     */
    public void setHealth(int i){
        this.health = this.health - i;
    }
    
    /**
     * this abstract method will allow a Mob object to deal damage to the Player
     */
    public abstract int attack();

    /**
     * This toString will help display the object as an String
     * @return String will return attributes in a String format
     */
    public abstract String toString(); 
}