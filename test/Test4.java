import e.commerce.fawry.*;

public class Test4 {
    public static void main(String[] args) {
        Product tv = new ShippableProduct("TV", 4000, 1, 6.0);
        Customer customer = new Customer("Ahmed", 1000); // Not enough
        Cart cart = new Cart();

        try {
            cart.add(tv, 1);
            CheckoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Test4 Passed: " + e.getMessage());
        }
    }
}
