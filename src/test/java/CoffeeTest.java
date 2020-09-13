import CoffeeShop.Coffee;
import CoffeeShop.Milk;
import CoffeeShop.MilkCoffee;
import CoffeeShop.Milkable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@DisplayName("Class CoffeeShop")
public class CoffeeTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

    @DisplayName("Correct create")
    @Test
    public void shouldCorrectCreateInstance(){
        Coffee coffee = Mockito.mock(Coffee.class);
        Milkable milkable = Mockito.mock(Milk.class);
        MilkCoffee coffeeWithMilk = new MilkCoffee(coffee, milkable);

        Assertions.assertNotNull(coffeeWithMilk);

    }

    @DisplayName("Correct toString() for Coffee")
    @Test
    public void shouldCorrectMethodToStringCoffee(){
        Coffee coffee = context.getBean(Coffee.class);

        Assertions.assertEquals(coffee.toString(), "Arabic");

    }

    @DisplayName("Correct toString for MilkCoffee")
    @Test
    public void shouldCorrectMethodToStringMilkCoffee(){
        MilkCoffee milkCoffee = context.getBean(MilkCoffee.class);

        Assertions.assertEquals(milkCoffee.toString(), "Arabic + Milk");

    }
}
