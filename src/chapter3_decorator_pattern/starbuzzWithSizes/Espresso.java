package chapter3_decorator_pattern.starbuzzWithSizes;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99; //statically set value
    }
}
