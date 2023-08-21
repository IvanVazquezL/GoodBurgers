public class Topping {
    private String name;
    private double price;

    public Topping(Topping.ToppingType name) {
        this.name = name.name();
        this.price = name.getBasePrice();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public enum ToppingType {
        Bacon("Bacon", 1.99),
        Guacamole("Guacamole", 1.99),
        ExtraCheese("Extra Cheese",1.99);

        private String name;
        private double basePrice;

        ToppingType(String name, double basePrice) {
            this.name = name;
            this.basePrice = basePrice;
        }

        public double getBasePrice() {
            return basePrice;
        }
    }
}
