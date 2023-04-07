package Restaurant;

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
                        return items;
                }
                public void setItems(ArrayList<MenuItem> items) {
                        this.items = items;
                }
                public String getDateUpdated() {
                        return dateUpdated;
                }
                public void setDateUpdated(String dateUpdated) {
                        this.dateUpdated = dateUpdated;
                }

        //functions
        public void addItem(MenuItem item, String whenUpdated){
                items.add(item);
                setDateUpdated(whenUpdated);
        };
        public void removeItem(MenuItem item, String whenUpdated){
                items.remove(item);
                setDateUpdated(whenUpdated);
        }
        public void printItems(Menu menu){
                System.out.println("Date Last Updated - " + this.dateUpdated);
                for (MenuItem item : this.items){
                        System.out.println("------------");
                        System.out.println("");
                        item.printItem(item);
                        System.out.println("");
                }
                System.out.println("------------");
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