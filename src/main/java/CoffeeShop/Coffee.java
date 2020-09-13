package CoffeeShop;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Coffee {
    private String type;

    @Override
    public String toString() {
        return type;
    }
}
