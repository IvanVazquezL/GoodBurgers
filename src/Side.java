public class Side {
    private String name;
    private double price;
    private String size;

    public Side(Side.SideType name, Side.SideSize size) {
        this.name = name.getName();
        this.size = size.name();
        this.price = calculatePrice(name, size);
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

    public static double calculatePrice(Side.SideType name, Side.SideSize size) {
        return name.getBasePrice() * size.getFactor();
    }

    public enum SideType {
        FrenchFries("French Fries", 4.99),
        OnionRings("Onion Rings",3.99),
        ChickenStrips("Chicken Strips", 7.99);

        private String name;
        private double basePrice;

        SideType(String name, double basePrice) {
            this.name = name;
            this.basePrice = basePrice;
        }

        public String getName() {
            return name;
        }

        public double getBasePrice() {
            return basePrice;
        }
    }

    public enum SideSize {
        Small(1),
        Medium(1.5),
        Large(2);

        private double factor;

        SideSize(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }
}
