package Back.end.S5.L1.esercizio.entities;

public class Bevande extends MenuItem {
    private String size;

    public Bevande(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}