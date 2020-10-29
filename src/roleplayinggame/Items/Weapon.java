package roleplayinggame.Items;

/**
 * This is sub-class of the Item class called Weapon
 * @author Swapnil Kumar 17982217
 */
public class Weapon extends Item{
    
    /*
    * damage is the amount of health this item will reduce if used to attack
    */
    int damage;
    
    /**
     *
     * @param name sets the name of the Weapon object
     * @param price sets the gold value of the Weapon object
     * @param equipped sets whether or not the Weapon object is equipped or not
     * @param damage sets the health reduction this Weapon object provides 
     */
    public Weapon(String name, int price, boolean equipped,int damage){
        super(name, price, equipped);
        this.damage = damage;
    }
    
    /**
     * This getter method will retrieve the amount of damage this weapon can deal
     * @return this.damage is the damage value of this object
     */
    public int getDamage(){
        return this.damage;
    }
    
    /**
     * This toString will display the attributes of this object as a String
     * @return will return the attributes of this object
     */
    @Override
    public String toString(){
        return this.name +", "+ "Damage: " +this.damage +", "+ "Price: "+ this.price;
    }
}