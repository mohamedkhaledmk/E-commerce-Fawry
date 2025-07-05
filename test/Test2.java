import e.commerce.fawry.*;
public class Test2 {
    public static void main(String[] args) {
        Product tv = new ShippableProduct("TV", 3000, 2, 6.0);
        Customer customer = new Customer("Mona", 10000);
        Cart cart = new Cart();

        try {
            cart.add(tv, 3); // Only 2 in stock
            CheckoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Test2 Passed: " + e.getMessage());
        }
    }
}
