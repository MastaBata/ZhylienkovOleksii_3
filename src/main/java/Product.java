public class Product {
    private String name;
    private int price;
    private int ID;

    public Product(String name, int price, int ID) {
        this.name = name;
        this.price = price;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getID() {
        return ID;
    }

}

