import java.util.List;

public class OrderService {
    public Order createOrder(Cart cart) {
        List<Product> productsInCart = cart.getProducts();
        int orderId = generateOrderId();
        String status = OrderStatus.NEW; // Початковий статус замовлення
        Order newOrder = new Order(orderId, productsInCart, status);
        return newOrder;
    }

    public String getOrderStatus(Order order) {
        return order.getStatus().toString(); // Виклик методу toString() для отримання рядкового представлення
    }

    public int generateOrderId() {
        return (int) (System.currentTimeMillis() % 100000);
    }
}
