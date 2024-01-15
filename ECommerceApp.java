// ECommerceApp.java
public class ECommerceApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C1", "John Doe", "john@example.com");
        Customer customer2 = new Customer("C2", "Jane Smith", "jane@example.com");

        Product product1 = new Product("P1", "Laptop", 1200.0);
        Product product2 = new Product("P2", "Smartphone", 800.0);

        Order order1 = new Order("O1", customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order("O2", customer2);
        order2.addProduct(product1);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);

        displayOrderDetails(order1);
        displayOrderDetails(order2);

        displayShoppingCart(shoppingCart);
    }

    private static void displayOrderDetails(Order order) {
        System.out.println("Order Details:");
        order.displayOrderDetails();
    }

    private static void displayShoppingCart(ShoppingCart shoppingCart) {
        System.out.println("Shopping Cart Contents:");
        for (Product product : shoppingCart.getCartItems()) {
            System.out.println("- " + product.getName() + " (Price: $" + product.getPrice() + ")");
        }
    }
}
