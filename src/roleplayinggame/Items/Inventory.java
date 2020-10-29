package roleplayinggame.Items;

import java.util.ArrayList;
/**
 * This is the Inventory class that will create an arraylist containing Item type objects and methods that will help modify it.
 * @author Swapnil Kumar 17982217
 */
public class Inventory {
    
    /**
     * inventory is an ArrayList that will contain Item objects  
     */
    private ArrayList<Item> inventory;
    
    /**
     *This constructor will initialize the inventory arraylist
     */
    public Inventory(){
        this.inventory = new ArrayList<Item>();
    }
    
    /**
     * This will add an Item object into the arraylist
     * @param x will be the Item object that will be added to the inventory arraylist
     */
    public void add(Item x){
        this.inventory.add(x);
    }
    
    /**
     * This method will remove an Item object from the arraylist through it's index position within the array
     * @param x will be the index of the Item object that will be removed
     * @return Integer will return the value of the index of the Item object that had been removed
     */
    public int remove(int x){
        System.out.println("Removed:" + this.inventory.toString());
        this.inventory.remove(x);
        return x;
    }
    
    /**
     * This method will equip an Item object if there is enough space within the ArrayList(Which is designated as 3)
     * @param x will be the index of the Item object within the array that will be attempted to be equipped
     */
    public void inventoryEquip(Item x){
        if( this.inventory.size() < 3){
            this.inventory.add(x);
            System.out.println("You've successfully equipped the item");
        }else {
            System.out.println("Not enough open slots to equip");
        }
    }
    
    /**
     * This method will remove an equipped item from the arraylist
     * @param r will be the index of the Item object that will be removed
     */
    public void inventoryUnequip(int r){
        this.inventory.remove(r);
    
    }
    
    /**
     * This is the toString method that will display the Inventory Class' object as a String
     * @return arrayprint will return the arraylist in a String Format
     */
    @Override
    public String toString(){
        String arrayprint = "";
        int a = 1;
        for(int i = 0; i < inventory.size(); i++) {
            arrayprint += String.valueOf(a) + ": "+ inventory.get(i).toString() + "\n";
            a++;
        }
        return arrayprint;
    }
}