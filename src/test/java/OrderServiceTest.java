import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.List;
import java.util.ArrayList;

public class OrderServiceTest {

    @Test
    public void testCreateOrder() {
        // Підготовка моку для класу Cart
        Cart mockCart = mock(Cart.class);
        // Створення підробленого списку продуктів для кошика
        List<Product> productsInCart = new ArrayList<>();
        // Додавання підроблених продуктів до кошика
        productsInCart.add(new Product("Pen",10,1));

        // Налаштування поведінки моку Cart: при виклику методу getProducts() повертати підроблений список продуктів
        when(mockCart.getProducts()).thenReturn(productsInCart);

        // Підготовка моку для класу Order
        OrderService orderService = new OrderService();
        OrderService spyOrderService = spy(orderService);

        // Виклик методу createOrder() з підробленим кошиком
        Order createdOrder = spyOrderService.createOrder(mockCart);

        // Перевірка, що метод generateOrderId() був викликаний
        verify(spyOrderService, times(1)).generateOrderId();
        // Тут також можна додати перевірку на інші аспекти замовлення, які вам потрібно перевірити
        // Наприклад, перевірка правильності створення замовлення з переданими параметрами, тощо
    }
}
