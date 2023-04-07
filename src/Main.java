import Restaurant.Menu;
import Restaurant.MenuItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> Items = new ArrayList<>();
        System.out.println("It lives!!!");
        MenuItem eggs = new MenuItem("eggs", 6.99, "eggs!", "entree", "contains: eggs", true);
        MenuItem rottenEggs = new MenuItem("rotten eggs", 0.99, "rotten eggs!", "entree", "contains: eggs");
        //System.out.println(eggs.getName());
        //eggs.printItem(eggs);

        Menu mainMenu = new Menu(Items, "4/6/23");
        mainMenu.addItem(rottenEggs, "2/6/99");
        mainMenu.addItem(eggs, "4/6/23");
        mainMenu.printItems(mainMenu);
    }
}
//Menu.Menu
//  Date updated – Date class
//  Items – ArrayList of MenuItems
//      Needs to hold all the MenuItems
//      Could split this into multiple fields (appetizers, entrée’s, deserts, etc)
//  mostRecent – Maybe just select the most recent item pushed into array list
//      Has the item most recently added
//      optional

