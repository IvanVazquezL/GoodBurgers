import java.util.ArrayList;

public class Burger {
    private String name;
    private double price;
    private String size;
    private ArrayList<Topping> toppings;

    public Burger(BurgerType name, BurgerSize size, ArrayList<Topping> toppings) {
        this.name = name.name();
        this.size = size.name();
        this.price = calculatePrice(name, size);
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public static double calculatePrice(BurgerType name, BurgerSize size) {
        return name.getBasePrice() * size.getFactor();
    }

    public enum BurgerType {
        Classic(5.99),
        Bacon(6.99),
        Chicken(7.99);

        private double basePrice;

        BurgerType(double basePrice) {
            this.basePrice = basePrice;
        }

        public double getBasePrice() {
            return basePrice;
        }
    }

    public enum BurgerSize {
        Small(1),
        Medium(1.5),
        Large(2);

        private double factor;

        BurgerSize(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }
}
