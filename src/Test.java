import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Cheese cheese = new Cheese("Cheddar", 100.0, 5, 0.5, LocalDate.of(2025, 12, 1));
        System.out.println("Product: " + cheese.getName());
        System.out.println("Expired? " + cheese.isExpired());
        System.out.println("Weight: " + cheese.getWeight() + "kg");
        System.out.println("Available Quantity: " + cheese.getQuantity());

        // Simulate purchasing 2 units
        if (cheese.isAvailable(2)) {
            cheese.reduceQuantity(2);
            System.out.println("Quantity after sale: " + cheese.getQuantity());
        }
    }
}
