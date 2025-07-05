import e.commerce.fawry.*;

public class Test3 {
    public static void main(String[] args) {
        Customer customer = new Customer("Laila", 2000);
        Cart cart = new Cart();

        try {
            CheckoutService.checkout(customer, cart); // Nothing in cart
        } catch (Exception e) {
            System.out.println("Test3 Passed: " + e.getMessage());
        }
    }
}
