
package e.commerce.fawry;
import java.time.LocalDate;

public class ExpirableShippableProduct extends Product implements Expirable, Shippable {
    private LocalDate expiryDate;
    private double weight;

    public ExpirableShippableProduct(String name, double price, int quantity, double weight, LocalDate expiryDate) {
        super(name, price, quantity);
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
