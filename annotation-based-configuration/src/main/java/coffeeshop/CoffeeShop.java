package coffeeshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@ComponentScan
public class CoffeeShop {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CoffeeShop.class);
        CoffeeService coffeeService = context.getBean(CoffeeService.class);

        coffeeService.start();
    }
}
