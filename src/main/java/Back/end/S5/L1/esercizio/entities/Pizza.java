package Back.end.S5.L1.esercizio.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {
    private List<String> toppings;

    public Pizza(String name, double price) {
        super(name, price);
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public List<String> getToppings() {
        return toppings;
    }
}