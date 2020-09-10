import CoffeeShop.Coffee;
import CoffeeShop.MilkCoffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@DisplayName("Class CoffeeShop")
public class CoffeeShopTest {

    @DisplayName("Correct create")
    @Test
    public void shouldCorrectCreateInstance(){
        Coffee coffee = Mockito.mock(Coffee.class);
        MilkCoffee coffeeWithoutMilk = new MilkCoffee(coffee);

        Assertions.assertNotNull(coffeeWithoutMilk);

    }
}
