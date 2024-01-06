package src;

import java.util.*;

public class Product {
    private String name;
    private String category;
    private int stock;
    private int id = 0;

    public Product(String name, String category, int stock) {
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.id++;
    }

    public String getName() {
        return this.name;
    }

}
