import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.Welcome();
        Menu.Menu();
        String option = scanner.nextLine();

        switch(option) {
            case "1":{
                Menu.Combos();
                String combo = scanner.nextLine();

                if (combo.equals("1")) {
                    MealOrder comboOne = new MealOrder();
                    comboOne.printReceipt();
                }
                break;
            }
            case "2": {
                Burger.BurgerType burgerType = Menu.BurgerType();
                Burger.BurgerSize burgerSize = Menu.BurgerSize(burgerType);
            }
        }
    }
}
