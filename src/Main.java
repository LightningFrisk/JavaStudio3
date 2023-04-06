import Menu.Menu;
import Menu.MenuItem;
public class Main {
    public static void main(String[] args) {
        System.out.println("It lives!!!");
        MenuItem eggs = new MenuItem("eggs", 6.99, "eggs!", "entree");

    }
    public void printMenu(){
        System.out.println(Menu);
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

