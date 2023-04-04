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

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dietaryAdvisories = "None";
    }
    public MenuItem(String name, double price, String description, String category, String dietaryAdvisories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dietaryAdvisories = dietaryAdvisories;
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

//MenuItem
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