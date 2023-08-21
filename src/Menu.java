import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public static void Welcome() {
        System.out.println("Welcome to G O O D  B U R G E R S ! ! !");
    }

    public static void Menu() {
        System.out.println("\nSelect an option:\n1) Select a combo\n2) Customize order\n3) Exit");
    }

    public static void Combos() {
        System.out.println("\nSelect a combo:\n1)Combo Classic\n\tClassic Burger (Small) $" + Burger.calculatePrice(Burger.BurgerType.Classic, Burger.BurgerSize.Small) +
                "\n\tCoke (Small) $"+ Drink.calculatePrice(Drink.DrinkType.Coke,Drink.DrinkSize.Small) +
                "\n\tFrench Fries (Small) $" + Side.calculatePrice(Side.SideType.FrenchFries, Side.SideSize.Small) +
                "\n 2)Exit");
    }

    public static Burger.BurgerType BurgerType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect a burger:");
        int index = 1;
        ArrayList<Burger.BurgerType> burgerTypes = new ArrayList<>();
        for(Burger.BurgerType burger : Burger.BurgerType.values()) {
            System.out.println(index + ") " + burger + "(Small) $" + burger.getBasePrice());
            burgerTypes.add(burger);
            index++;
        }

        int burgerOption = Integer.parseInt(scanner.nextLine());
        while(burgerOption <= 0 || burgerOption > burgerTypes.size()) {
            System.out.println("Enter a valid option: ");
            burgerOption = Integer.parseInt(scanner.nextLine());
        }

        return burgerTypes.get(burgerOption - 1);
    }

    public static Burger.BurgerSize BurgerSize(Burger.BurgerType burgerType) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWould you like to supersize your order? (Y/N)");

        String choice = scanner.nextLine();
        if (choice.toLowerCase().equals("n")) {
            return Burger.BurgerSize.Small;
        }

        int index = 1;
        ArrayList<Burger.BurgerSize> burgerSizes = new ArrayList<>();
        for (Burger.BurgerSize burgerSize : Burger.BurgerSize.values()) {
            if (burgerSize.name().equals("Small")) continue;
            System.out.println(index + ") " + burgerSize + " $" + Burger.calculatePrice(burgerType, burgerSize));
            burgerSizes.add(burgerSize);
            index++;
        }

        int sizeOption = Integer.parseInt(scanner.nextLine());
        while(sizeOption <= 0 || sizeOption > burgerSizes.size() - 1) {
            System.out.println("Enter a valid option: ");
            sizeOption = Integer.parseInt(scanner.nextLine());
        }

        return burgerSizes.get(sizeOption - 1);
    }
}
