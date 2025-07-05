# Fawry E-Commerce System – Java Internship Challenge

## ✅ Overview

This project is a fully functional Java-based e-commerce system designed as part of the **Fawry Rise Internship Challenge**.

It supports:
- Product modeling (name, price, quantity, expiry, shipping).
- Customer balance and purchase validation.
- Cart management and order checkout.
- Shipping service simulation.
- Validation for edge cases and exceptions.

🧪 **Note**:  
A file named `Test.java` was used during the early development stages to manually test individual features (e.g., product creation, expiry check, and shipping behavior).  
As the system matured, formal test cases were created (`Test1.java`, `Test2.java`, etc.).  
Older versions of the project can be viewed through my **Git commit history**.

---

## 🧱 Project Structure

### 📁 Package: `e.commerce.fawry`

| Class                        | Description                                      |
|-----------------------------|--------------------------------------------------|
| `Product`                   | Base class for all product types                 |
| `ExpirableProduct`          | Products that can expire                         |
| `ShippableProduct`          | Products that require shipping                   |
| `ExpirableShippableProduct` | Products that can expire and require shipping    |
| `Cart`                      | Adds products with quantity, validates stock     |
| `Customer`                  | Stores name and balance, allows deduction        |
| `CheckoutService`           | Handles full checkout: subtotal, shipping, etc.  |
| `ShippingService`           | Simulates packaging and total weight             |
| `ECommerceFawry`            | Main runner for a full scenario simulation       |
| `Test`                      | Early-phase development sandbox (optional)       |

---

### 📁 Test Files (default package)

| File              | Purpose                                             |
|-------------------|-----------------------------------------------------|
| `Test1.java`      | Tests expired product validation                    |
| `Test2.java`      | Tests adding product with quantity exceeding stock  |
| `Test3.java`      | Tests empty cart checkout                           |
| `Test4.java`      | Tests insufficient balance handling                 |
| `TestCustomer.java` | Tests customer creation and balance deduction     |

Each file is self-contained and prints output indicating whether validation is working as expected.

---

## 🧪 How to Run Tests

Run each test individually:

1. In NetBeans, right-click the file (e.g., `Test1.java`)
2. Choose **Run File** or press `Shift + F6`

Expected output:

✅ Test1 Passed: Cannot add expired product: Milk
✅ Test2 Passed: Requested quantity exceeds available stock for: TV
✅ Test3 Passed: Cannot checkout with an empty cart.
✅ Test4 Passed: Customer has insufficient balance.
✅ Test5.1 Passed: Created customer with balance 500.0
✅ Test5.4 Passed: Insufficient balance.

---

## 🚚 Example Full Checkout Output (from `ECommerceFawry.java`)

** Shipment notice **
2x Cheese 400g
1x Biscuits 700g
1x TV 6000g
Total package weight 7.1kg

** Checkout receipt **
2x Cheese 200.00
1x TV 3000.00
1x Scratch Card 50.00
1x Biscuits 150.00
Subtotal 3400.00
Shipping 213.00
Amount 3613.00
Customer Balance 1387.00
## 💡 Tips for Reviewers

To test the system:
- Run `ECommerceFawry.java` to simulate a full purchase.
- Run `Test1`–`Test4` to confirm validations are enforced.
- Run `TestCustomer.java` to verify customer logic.

Thank you for reviewing this submission and I hope to contribute to Fawry team Soon..
