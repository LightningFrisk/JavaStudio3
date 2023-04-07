package Restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category;
    private boolean isNew;
    private boolean isAvailable;
    private Date dateAdded;
    private String dietaryAdvisories; //covers Allergies, Gluten, Vegan, etc
    public MenuItem(String name, double price, String description, String category, String dietaryAdvisories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dietaryAdvisories = dietaryAdvisories;
        this.isNew = false;
    }
    public MenuItem(String name, double price, String description, String category, String dietaryAdvisories, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dietaryAdvisories = dietaryAdvisories;
        this.isNew = isNew;
    }
    public void printItem(MenuItem item){
        System.out.println(
                "Item: " + item.getName() + "\n"
                        + "Course: " + item.getCategory()  + "\n"
                        + "Description: " + item.getDescription() + "\n"
                        + "Contains: " + item.getDietaryAdvisories() + "\n"
                        + "Price: " + item.getPrice() + "\n"
                        + "New?: " + item.isNew()
        );
    }
    public boolean equals(MenuItem toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem theItem = (MenuItem) toBeCompared;
        return theItem.getDietaryAdvisories() == getDietaryAdvisories();
    }

    //getters and setters
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public boolean isNew() {
            return isNew;
        }

        public void setNew(boolean aNew) {
            isNew = aNew;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        public Date getDateAdded() {
            return dateAdded;
        }

        public void setDateAdded(Date dateAdded) {
            this.dateAdded = dateAdded;
        }

        public String getDietaryAdvisories() {
            return dietaryAdvisories;
        }

        public void setDietaryAdvisories(String dietaryAdvisories) {
            this.dietaryAdvisories = dietaryAdvisories;
        }
}

//Menu.MenuItem
//  Price – double
//  Description – string
//  Category – string
//  New – Boolean
//  Name – String
//  isAvailable – Boolean
//  isVegan - Boolean
//  dateAdded – Date class
//  Allergens – ArrayList of strings
//  spiceLevel – Int
//  proteinType - string