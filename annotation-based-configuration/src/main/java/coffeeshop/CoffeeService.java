package coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CoffeeService {
    private Coffee coffee;
    private MilkCoffee milkCoffee;

    @Autowired
    public CoffeeService(Coffee coffee, MilkCoffee milkCoffee) {
        this.coffee = coffee;
        this.milkCoffee = milkCoffee;
    }

    public void start(){
        System.out.println("Hello!\nChoose your coffee: with milk or original?");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        System.out.println("Your chose: " + type);

        if (type.toLowerCase().contains("milk")) {
            System.out.println("Your own milk coffee: " + milkCoffee.toString());
        } else {
            System.out.println("Your own original coffee: " + coffee.toString());
        }
    }
}
