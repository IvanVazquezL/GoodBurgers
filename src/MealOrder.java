import java.util.ArrayList;
import java.util.Arrays;

public class MealOrder {
    private ArrayList<Burger> burgers;
    private ArrayList<Drink> drinks;
    private ArrayList<Side> sides;
    private double total;
    private String receipt;

    public MealOrder() {
        ArrayList<Topping> toppings = new ArrayList<>();
        Burger.BurgerType burgerType = Burger.BurgerType.Classic;
        Burger.BurgerSize burgerSize = Burger.BurgerSize.Small;
        burgers = new ArrayList<Burger>(Arrays.asList(new Burger(burgerType, burgerSize, toppings)));

        Drink.DrinkType drinkType = Drink.DrinkType.Coke;
        Drink.DrinkSize drinkSize = Drink.DrinkSize.Small;
        drinks = new ArrayList<Drink>(Arrays.asList(new Drink(drinkType, drinkSize, true)));

        Side.SideType sideType = Side.SideType.FrenchFries;
        Side.SideSize sideSize = Side.SideSize.Small;
        sides = new ArrayList<Side>(Arrays.asList(new Side(sideType, sideSize)));

    }

    public void printReceipt() {
        receipt = "*************************************\n\t\tG O O D  B U R G E R S \n*************************************\n";

        for(Burger burger : burgers) {
            total += burger.getPrice();
            receipt += burger.getName() + " ("+burger.getSize() + ") $ " + burger.getPrice() + "\n";

            for(Topping topping : burger.getToppings()) {
                total += topping.getPrice();
                receipt += topping.getName() + " $ " + topping.getPrice() + "\n";
            }
        }

        for (Drink drink : drinks) {
            total += drink.getPrice();
            receipt += drink.getName() + " ("+drink.getSize() + ") $ " + drink.getPrice() + "\n";
        }

        for (Side side : sides) {
            total += side.getPrice();
            receipt += side.getName() + " ("+side.getSize() + ") $ " + side.getPrice() + "\n";
        }

        receipt += "*************************************\nTotal: " + total;

        System.out.println(receipt);


    }
}
