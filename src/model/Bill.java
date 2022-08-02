package model;

import java.time.LocalDate;
import java.util.List;

public class Bill {
    private Long id;
    private String date;
    private List<BillItem> items;

    public Bill() {
    }

    public Bill(Long id) {
        this.id = id;
        this.date = LocalDate.now().toString();
    }

    public Long getId() {
        return id;
    }

    public void setItems(List<BillItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Bill " + this.id + "\n").append("Date " + this.date + "\n");
        for (BillItem d : this.items) {
            s.append(" " + d.getQuantity()).append(" " + d.getDrink().getName()).append("\n");
        }
        return s.toString();
    }
}
