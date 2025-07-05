public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        if (price < 0 || quantity < 0)
            throw new IllegalArgumentException("Price and quantity must be non-negative");

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void reduceQuantity(int amount) {
        if (amount > quantity)
            throw new IllegalArgumentException("Not enough stock");
        this.quantity -= amount;
    }

    public boolean isAvailable(int requestedQuantity) {
        return requestedQuantity <= quantity;
    }
}

interface Expirable {
    boolean isExpired(); 
}

interface Shippable {
    double getWeight();
}