package CoffeeShop;

import org.springframework.context.ApplicationContext;
import java.util.Scanner;

public class CoffeeService {
    public static void start(ApplicationContext context){
        System.out.println("Hello!\nChoose your coffee: with milk or original?");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        System.out.println("Your chose: " + type);

        if (type.toLowerCase().contains("milk")) {
            MilkCoffee milkCoffee = context.getBean(MilkCoffee.class);
            System.out.println("Your own milk coffee: " + milkCoffee.toString());
        } else {
            Coffee coffee = context.getBean(Coffee.class);
            System.out.println("Your own original coffee: " + coffee.toString());
        }
    }
}
