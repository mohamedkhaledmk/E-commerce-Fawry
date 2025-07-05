
package e.commerce.fawry;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance must be non-negative");
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deduct(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance.");
        this.balance -= amount;
    }
}
