package sg.edu.nus.iss.day12wkshp;


import java.util.List;
import java.util.ArrayList;


public class CartService {
    
    public List<Item> getShoppingItems(){
        List<Item> 1stItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(5);
        1stItems.add(itm);

        itm = new Item();
        itm.setItemName("Chanel Wallet");
        itm.setQuantity(2);
        1stItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Wallet");
        itm.setQuantity(7);
        1stItems.add(itm);

        return 1stItems;
        

    }
}
