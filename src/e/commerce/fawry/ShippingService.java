
package e.commerce.fawry;

import java.util.List;
import java.util.Map;

public class ShippingService {
    public static void ship(Cart cart) {
        System.out.println("\n** Shipment notice **");

        double totalWeight = 0;
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            if (product instanceof Shippable shippable) {
                double weight = shippable.getWeight() * quantity;
                totalWeight += weight;
                System.out.printf("%dx %-12s %.0fg \n", quantity, product.getName(), weight * 1000);
            }
        }

        System.out.printf("Total package weight %.1fkg", totalWeight);
    }
}
