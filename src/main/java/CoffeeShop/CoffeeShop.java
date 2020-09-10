package CoffeeShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        System.out.println("Hello!\nChoose your coffe: with milk or original?");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        System.out.println("Your chose: " + type);

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Coffee coffee = context.getBean(Coffee.class);

        if (type.contains("milk")) {
            MilkCoffee milkCoffee = new MilkCoffee(coffee, new Milk());
            System.out.println("Your own milk coffee" + milkCoffee.toString());
        } else {
            System.out.println("Your own original coffee" + coffee.toString());
        }






    }
}
