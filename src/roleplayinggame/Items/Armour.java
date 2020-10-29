package roleplayinggame.Items;

/**
 * This is the Armour class that extends from the Item class that has methods and attributes relating to an armour object
 * @author Swapnil Kumar 17982217
 */
public class Armour extends Item{
    
    /**
     * armour is the amount of damage reduction is provided
     */
    int armour;
    
    /**
     * @param name sets the name of the Armour Item object
     * @param price sets the gold value of the Armour Item object
     * @param equipped sets whether the item is equipped or not
     * @param armour sets the value of the damage reduction of the Armour Item object
     */
    public Armour(String name, int price, boolean equipped, int armour){
        super(name, price, equipped);
        this.armour = armour;
    }
    
    /**
     * This toString will display the attributes of this object as a String
     * @return will return the attributes of this object
     */
    @Override
    public String toString(){
        return this.name + ", " +"Armour: "+ this.armour + ", " + "Price: " + this.price;
    }
}