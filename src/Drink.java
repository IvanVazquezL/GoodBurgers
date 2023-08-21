import java.util.ArrayList;

public class Drink {
    private String name;
    private double price;
    private String size;
    private boolean includesIce;

    public Drink(Drink.DrinkType name, Drink.DrinkSize size, boolean includesIce) {
        this.name = name.name();
        this.size = size.name();
        this.price = calculatePrice(name, size);
        this.includesIce = includesIce;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePrice(Drink.DrinkType name, Drink.DrinkSize size) {
        return name.getBasePrice() * size.getFactor();
    }

    public enum DrinkType {
        Coke(1.99),
        Sprite(1.99),
        Fanta(1.99);

        private double basePrice;

        DrinkType(double basePrice) {
            this.basePrice = basePrice;
        }

        public double getBasePrice() {
            return basePrice;
        }
    }

    public enum DrinkSize {
        Small(1),
        Medium(1.5),
        Large(2);

        private double factor;

        DrinkSize(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }
}
