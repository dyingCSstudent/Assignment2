package roleplayinggame.Mobs;

/**
 * This is the Bandit class that extends from the Mob class
 * @author Swapnil Kumar 17982217
 */
public class Bandit extends Mob{
    
    /**
     *
     * @param name this will set name of the Bandit object
     * @param gold this will set the gold value of the Bandit object
     * @param health this will set the health value of the Bandit object
     * @param damage this will set the damage value of the Bandit object
     * @param armour this will set the armour value of the Bandit object
     * @param isdead this will set the isdead boolean variable of the Bandit object
     */
    public Bandit(String name, int gold, int health, int damage, int armour, boolean isdead){
        super("Bandit", gold, health, damage, armour, isdead);
    }

    /**
     * This method gives the value of damage that this object can do to a player
     * @return this.damage is the amount damage this object can deal
     */
    @Override
    public int attack() {
        return this.damage;
    }

    /**
     * This toString will display the attributes of this object as a String
     * @return will return the attributes of this object
     */
    @Override
    public String toString() {
        return this.name +", "+ this.gold +", "+ this.health +", "+ this.armour +", "+ this.damage +", "+ this.isdead;
    }
}