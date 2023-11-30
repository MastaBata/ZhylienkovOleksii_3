import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Створення продуктів
        Product phone = new Product("Phone", 800, 1);
        Product laptop = new Product("Laptop", 1000, 2);

        // Створення кошика
        Cart cart = new Cart();

        // Додавання продуктів до кошика
        cart.addProduct(phone);
        cart.addProduct(laptop);

        // Створення об'єкта OrderService
        OrderService orderService = new OrderService();

        // Створення замовлення з продуктів у кошику
        Order order = orderService.createOrder(cart);

        // Отримання статусу замовлення
        String status = orderService.getOrderStatus(order);

        // Вивід статусу замовлення
        System.out.println("Статус замовлення: " + status);
    }
}
