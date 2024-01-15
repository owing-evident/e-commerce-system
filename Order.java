// Order.java
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName() + " (" + customer.getCustomerId() + ")");
        System.out.println("Products:");

        for (Product product : products) {
            System.out.println("- " + product.getName() + " (Price: $" + product.getPrice() + ")");
        }
        System.out.println();
    }
}
