package coffeeshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeShop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        CoffeeService coffeeService = context.getBean(CoffeeService.class);

        coffeeService.start();
    }
}
