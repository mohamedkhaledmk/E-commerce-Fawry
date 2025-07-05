package e.commerce.fawry;
import java.time.LocalDate;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Cheese cheese = new Cheese("Gouda", 100, 5, 0.4, LocalDate.of(2025, 12, 1));
        TV tv = new TV("LG TV", 4000, 2, 10.0);

        try {
            cart.add(cheese, 2);
            cart.add(tv, 1);
            System.out.println("Cart items added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            System.out.println(entry.getValue() + "x " + entry.getKey().getName());
        }
    }
}
