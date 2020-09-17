package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MilkCoffee {
    private Coffee coffee;
    private Milkable milkable;

    @Override
    public String toString() {
        return coffee + " + " + milkable.getClass().toString().split("\\.")[1];
    }
}