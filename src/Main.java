import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to G O O D  B U R G E R S ! ! !");
        System.out.println("\nSelect an option:\n1) Select a combo\n2) Customize order\n3) Exit");
        String option = scanner.nextLine();

        switch(option) {
            case "1":{
                System.out.println("\nSelect a combo:\n1)Combo Classic\n\tClassic Burger (Small) $" + Burger.calculatePrice(Burger.BurgerType.Classic, Burger.BurgerSize.Small));
            }
                break;
        }
    }
}
