import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public List<Product> getProducts() {
        return this.products;
    }

    public Cart() {
        this.products = new ArrayList<>(); // Ініціалізуємо список у конструкторі
    }

    public void addProduct(Product product) {
        this.products.add(product); // Додаємо продукт до списку
    }

}
