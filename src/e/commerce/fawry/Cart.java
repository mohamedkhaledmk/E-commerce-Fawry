package e.commerce.fawry;
import java.util.*;

public class Cart {
    private Map<Product, Integer> items;

    public Cart() {
        items = new LinkedHashMap<>();
    }

    public void add(Product product, int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be positive.");

        if (!product.isAvailable(quantity))
            throw new IllegalArgumentException("Requested quantity exceeds available stock for: " + product.getName());

        if (product instanceof Expirable && ((Expirable) product).isExpired())
            throw new IllegalArgumentException("Cannot add expired product: " + product.getName());
        System.out.println( quantity);
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}
