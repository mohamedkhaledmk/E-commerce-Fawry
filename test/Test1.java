/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author DELL
 */
import java.time.LocalDate;
import e.commerce.fawry.*;
public class Test1 {
    public static void main(String[] args) {
        Product expiredMilk = new ExpirableShippableProduct("Milk", 80, 2, 0.3, LocalDate.of(2023, 1, 1));
        Customer customer = new Customer("Omar", 1000);
        Cart cart = new Cart();

        try {
            cart.add(expiredMilk, 1);
            CheckoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("✅ Test1 Passed: " + e.getMessage());
        }
    }
}
