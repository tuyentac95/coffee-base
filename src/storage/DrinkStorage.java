package storage;

import controller.DrinkController;
import model.Category;
import model.Drink;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class DrinkStorage implements Storage<Drink> {
    private static final DrinkStorage INSTANCE;

    private DrinkStorage() {
    }

    static {
        try {
            INSTANCE = new DrinkStorage();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static DrinkStorage getInstance() {
        return INSTANCE;
    }

    private List<Drink> menu = new ArrayList<>(asList(
            new Drink(1L, Category.COFFEE, "Black coffee", 25000L),
            new Drink(2L, Category.TEA, "Peach tea", 40000L),
            new Drink(3L, Category.JUICE, "Orange juice", 35000L)
    ));

    @Override
    public void store(Drink drink) {
        // write files
    }

    @Override
    public List<Drink> findAll() {
        // read file
        return this.menu;
    }

    public Drink findById(Long id) {
        for (Drink d : menu) {
            if (d.getId().equals(id)) return d;
        }
        return null;
    }
}
