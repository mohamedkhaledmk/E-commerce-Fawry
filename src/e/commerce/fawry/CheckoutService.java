package e.commerce.fawry;

import java.util.*;

public class CheckoutService {
    private static final double SHIPPING_RATE_PER_KG = 30.0;

    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cannot checkout with an empty cart.");
        }

        Map<Product, Integer> items = cart.getItems();
        double subtotal = 0.0;
        double totalWeight = 0.0;

        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            if (product instanceof Expirable && ((Expirable) product).isExpired()) {
                throw new IllegalStateException("Cannot checkout expired product: " + product.getName());
            }

            if (!product.isAvailable(quantity)) {
                throw new IllegalStateException("Not enough stock for product: " + product.getName());
            }

            subtotal += product.getPrice() * quantity;

            if (product instanceof Shippable) {
                totalWeight += ((Shippable) product).getWeight() * quantity;
            }
        }

        double shippingFee = totalWeight * SHIPPING_RATE_PER_KG;
        double total = subtotal + shippingFee;

        if (customer.getBalance() < total) {
            throw new IllegalStateException("Customer has insufficient balance.");
        }

        customer.deduct(total);

        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            entry.getKey().reduceQuantity(entry.getValue());
        }

        if (totalWeight > 0) {
            ShippingService.ship(cart);
        }

        System.out.println("\n** Checkout receipt **");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%dx %-12s %.2f \n", quantity, product.getName(), product.getPrice() * quantity);
        }

        System.out.println("----------------------");
        System.out.printf("Subtotal         %.2f \n", subtotal);
        System.out.printf("Shipping         %.2f \n", shippingFee);
        System.out.printf("Amount           %.2f \n", total);
        System.out.printf("Customer Balance %.2f \n", customer.getBalance());

        cart.clear();
    }
}
