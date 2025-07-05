package e.commerce.fawry;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Abdullah", 1000.0);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Initial Balance: " + customer.getBalance());

        customer.deduct(300.0);

        System.out.println("Balance after deduction: " + customer.getBalance());
    }
}
