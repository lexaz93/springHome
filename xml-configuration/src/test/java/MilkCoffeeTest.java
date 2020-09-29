import coffeeshop.Coffee;
import coffeeshop.Milk;
import coffeeshop.MilkCoffee;
import coffeeshop.Milkable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@DisplayName("Class MilkCoffee")
public class MilkCoffeeTest {
    @DisplayName("Correct create")
    @Test
    public void shouldCorrectCreateInstance(){
        Coffee coffee = Mockito.mock(Coffee.class);
        Milkable milkable = Mockito.mock(Milk.class);
        MilkCoffee coffeeWithMilk = new MilkCoffee(coffee, milkable);

        Assertions.assertNotNull(coffeeWithMilk);
    }

    @DisplayName("Correct toString for MilkCoffee")
    @Test
    public void shouldCorrectMethodToStringMilkCoffee(){
        MilkCoffee milkCoffee = new MilkCoffee(new Coffee("Arabic"), new Milk());

        Assertions.assertEquals(milkCoffee.toString(), "Arabic + Milk");
    }
}
