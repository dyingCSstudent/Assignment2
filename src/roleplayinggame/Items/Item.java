package roleplayinggame.Items;

/**
 * This is an Abstract class called Item used to create various types of items in the game world
 * @author Swapnil  Kumar 17982217
 */
public abstract class Item {
    
    /**
     * These are the attributes of the abstract Item class
     * name is the name of the item
     * price is the amount of gold this item is worth
     * equipped is a boolean to see whether the item is equipped by the player or not
     */
    String name;
    int price;
    boolean equipped;
    
    /**
     * @param name sets the Item name
     * @param price sets the price name
     * @param equipped sets equipped value
     */
    public Item(String name, int price, boolean equipped){
        this.name = name;
        this.price = price;
        this.equipped = equipped;
    }
    
    /**
     * This is an abstract toString method to help display the attributes of an Item object
     * @return will return the attributes of this object
     */
    public abstract String toString();
    
    /**
     * This method will change the value of the equipped attribute of an Item object to true equipped
     */
    public void equip(){
        this.equipped = true;
    }
    
    /**
     * This method will change the value of the equipped attribute of an Item to false meaning the item is unequipped
     */
    public void unequip(){
        this.equipped = false;
    }
}