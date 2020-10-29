package roleplayinggame.Items;

/**
 * This is sub-class of the Item class called Misc
 * This class will create Items that have no functionality other than being sold for gold
 * @author Swapnli Kuamr 17982217
 */
public class Misc extends Item{
    
    /**
     * @param name sets the name of the Misc object
     * @param price sets the gold value of the Misc object
     * @param equipped sets whether or not the Misc object is equipped or not
     */
    public Misc(String name, int price, boolean equipped){
        super(name, price, equipped);
    }
    
    /**
     * This toString will display the attributes of this object as a String
     * @return will return the attributes of this object
     */
    @Override
    public String toString(){
        return this.name + this.price;
    }
}