package Menu;

import java.util.ArrayList;

public class Menu {
        private ArrayList<MenuItem> items;
        private String dateUpdated;
        public Menu(ArrayList<MenuItem> items, String dateUpdated) {
                this.items = items;
                this.dateUpdated = dateUpdated;
        }
        //getters and setters
                public ArrayList<MenuItem> getItems() {
                        return Items;
                }
                public void setItems(ArrayList<MenuItem> items) {
                        Items = items;
                }
                public String getDateUpdated() {
                        return dateUpdated;
                }
                public void setDateUpdated(String dateUpdated) {
                        this.dateUpdated = dateUpdated;
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