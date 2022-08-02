package view;

import controller.DrinkController;
import model.Bill;
import model.BillItem;
import model.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderPage {
    private static final DrinkController controller = DrinkController.getInstance();

    public static void showPage() {
        System.out.println("--- PLEASE ORDER ---");
        System.out.println("0. Back to Home Page");
        List<Drink> menu = controller.getMenu();

        for (Drink d : menu) {
            System.out.println(d);
        }
        System.out.print("Choose drink: ");
    }

    public static void action(Scanner sc) {
        String act = sc.nextLine();
        Bill b = new Bill(1L);
        List<BillItem> items = new ArrayList<>();
        while (!act.equals("0")) {
            Drink d = controller.findDrinkById(Long.valueOf(act));
            System.out.println("You choose " + d.getName());
            System.out.print("Enter quantity: ");
            String q = sc.nextLine();
            items.add(new BillItem(1L, b.getId(), d, Integer.valueOf(q)));
            System.out.print("Continue?: [y/n] ");
            String c = sc.nextLine();
            if (c.equals("y")) {
                System.out.print("Choose drink: ");
                act = sc.nextLine();
            } else {
                b.setItems(items);
                System.out.println("This is your bill");
                System.out.println(b);
                act = "0";
            }

        }
        System.out.println("Back");
    }
}
