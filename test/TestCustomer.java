import e.commerce.fawry.*;

public class TestCustomer {
    public static void main(String[] args) {
        // 1- Create customer with valid balance
        try {
            Customer c1 = new Customer("Amina", 500.0);
            System.out.println("Test5.1 Passed: Created customer with balance " + c1.getBalance());
        } catch (Exception e) {
            System.out.println("Test5.1 Failed: " + e.getMessage());
        }

        // 2- Create customer with negative balance
        try {
            Customer c2 = new Customer("Hany", -100.0);
            System.out.println("Test5.2 Failed: Negative balance allowed (should not happen)");
        } catch (Exception e) {
            System.out.println("Test5.2 Passed: " + e.getMessage());
        }

        // 3- Deduct amount less than balance
        try {
            Customer c3 = new Customer("Salma", 300.0);
            c3.deduct(100.0);
            System.out.println("Test5.3 Passed: Deducted 100, new balance: " + c3.getBalance());
        } catch (Exception e) {
            System.out.println("Test5.3 Failed: " + e.getMessage());
        }

        // 4- Deduct more than balance
        try {
            Customer c4 = new Customer("Mahmoud", 200.0);
            c4.deduct(500.0);
            System.out.println("Test5.4 Failed: Deducted more than balance (should not happen)");
        } catch (Exception e) {
            System.out.println("Test5.4 Passed: " + e.getMessage());
        }
    }
}
