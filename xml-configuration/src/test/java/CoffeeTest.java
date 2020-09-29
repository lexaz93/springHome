import coffeeshop.Coffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Class Coffee")
public class CoffeeTest {

    @DisplayName("Correct toString() for Coffee")
    @Test
    public void shouldCorrectMethodToStringCoffee(){
        Coffee coffee = new Coffee("Arabic");

        Assertions.assertEquals(coffee.toString(), "Arabic");
    }


}
