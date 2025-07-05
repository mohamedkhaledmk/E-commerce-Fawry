import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV("Samsung TV", 5000.0, 3, 8.0);
        ScratchCard card = new ScratchCard("Vodafone Card", 50.0, 10);
        Biscuits biscuits = new Biscuits("Digestive", 150.0, 5, 0.7, LocalDate.of(2024, 12, 31));

        System.out.println(tv.getName() + " | Weight: " + tv.getWeight() + "kg");
        System.out.println(card.getName() + " | Price: " + card.getPrice());
        System.out.println(biscuits.getName() + " | Expired? " + biscuits.isExpired());
    }
}
