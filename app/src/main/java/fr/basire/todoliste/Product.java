package fr.basire.todoliste;

/**
 * Created by basire1u on 12/02/18.
 */

public class Product {

    private String title;
    private String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(String title, String category) {

        this.title = title;
        this.category = category;
    }
}
