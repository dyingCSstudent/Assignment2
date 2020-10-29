package roleplayinggame.Mobs;

/**
 * This is sub-class of the Mob class called Dragon
 * @author Swapnil Kumar 17982217
 */
public class Dragon extends Mob{
    
    /**
     * @param name sets the name of the Dragon object
     * @param gold sets the gold of the Dragon object
     * @param health sets the health of the Dragon object
     * @param damage sets the damage of the Dragon object
     * @param armour sets the armour of the Dragon object
     * @param isdead sets the boolean value of the Dragon object
     */
    public Dragon(String name, int gold, int health, int damage, int armour, boolean isdead){
        super("Dragon", gold, health, damage, armour, isdead);
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