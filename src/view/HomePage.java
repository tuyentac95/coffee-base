package view;

import java.util.Scanner;

public class HomePage {
    public void showPage() {
        System.out.println("---HOME PAGE ---");
        System.out.println("1. New Order");
        System.out.println("2. View Orders");
        System.out.println("3. Quit");
        System.out.print("Please enter: ");
    }

    public void action() {
        Scanner sc = new Scanner(System.in);
        String act = sc.nextLine();
        while (!(act.equals("3"))) {
            switch (act) {
                case "1":
                    OrderPage.showPage();
                    OrderPage.action(sc);
                    showPage();
                    break;
                case "2":
                    System.out.print("This is orders");
                    showPage();
                    break;
                default:
                    System.out.print("Please re-enter: ");
                    showPage();
            }
            act = sc.nextLine();
        }
    }
}
