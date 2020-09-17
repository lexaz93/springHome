import coffeeshop.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@DisplayName("Class MilkCoffee")
public class CoffeeServiceTest {
    @DisplayName("Correct create")
    @Test
    public void shouldCorrectCreateInstance(){
        Coffee coffee = Mockito.mock(Coffee.class);
        MilkCoffee coffeeWithMilk = Mockito.mock(MilkCoffee.class);
        CoffeeService coffeeService = new CoffeeService(coffee, coffeeWithMilk);

        Assertions.assertNotNull(coffeeService);
    }
}
