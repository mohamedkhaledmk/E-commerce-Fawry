
package e.commerce.fawry;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class ECommerceFawry {

    public static void main(String[] args) {
        Product cheese = new ExpirableShippableProduct("Cheese", 100, 5, 0.5, LocalDate.of(2025, 12, 1));
        Product tv = new ShippableProduct("TV", 4000, 3, 6.0);
        Product card = new Product("Scratch Card", 50, 10);
        Product biscuits = new ExpirableShippableProduct("Biscuits", 150, 3, 0.7, LocalDate.of(2025, 12, 31));

        Customer customer = new Customer("Fatma", 5000);
        Cart cart = new Cart();

        try {
            cart.add(cheese, 2);
            cart.add(tv, 1);
            cart.add(card, 1);
            cart.add(biscuits, 1);

            CheckoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }

        // Show remaining stock
        System.out.println("\nRemaining Stock:");
        System.out.println(cheese.getName() + ": " + cheese.getQuantity());
        System.out.println(tv.getName() + ": " + tv.getQuantity());
        System.out.println(card.getName() + ": " + card.getQuantity());
        System.out.println(biscuits.getName() + ": " + biscuits.getQuantity());
    }
    
}
