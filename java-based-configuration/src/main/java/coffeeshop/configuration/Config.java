package coffeeshop.configuration;

import coffeeshop.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Coffee myCoffee() { return new Coffee("Arabic");}

    @Bean
    public Milkable milk() { return  new Milk();}

    @Bean
    public Milkable cream() { return  new Cream();}

    @Bean
    public MilkCoffee milkCoffee(Coffee coffee, @Qualifier("milk") Milkable milk) {return new MilkCoffee(coffee, milk);}

    @Bean
    public CoffeeService coffeeService(Coffee coffee, MilkCoffee milkCoffee) {return new CoffeeService(coffee, milkCoffee);}

}
