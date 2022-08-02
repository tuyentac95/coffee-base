package model;

import java.util.List;

public class Category {
    private Long id;
    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Category COFFEE = new Category(1L, "coffee");
    public static Category TEA = new Category(2L, "tea");
    public static Category JUICE = new Category(3L, "juice");

    public String getName() {
        return name;
    }
}
