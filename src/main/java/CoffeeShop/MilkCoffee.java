package CoffeeShop;

public class MilkCoffee {
    private Coffee coffee;
    private Milkable milkable;

    public MilkCoffee(Coffee coffee, Milkable milkable) {
        this.coffee = coffee;
        this.milkable = milkable;
    }

    public MilkCoffee(Coffee coffee){
        this.coffee = coffee;
    }

}