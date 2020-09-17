package CoffeeShop;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MilkCoffee {
    private Coffee coffee;
    private Milkable milkable;

    @Override
    public String toString() {
        return coffee + " + " + milkable.getClass().toString().split("\\.")[1];
    }
}