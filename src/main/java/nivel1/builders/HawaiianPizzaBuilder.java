package nivel1.builders;

import nivel1.Pizza;

import java.util.Arrays;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private final Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize("Large");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thick crust");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(Arrays.asList("Ham", "Pineapple", "Cheese"));
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
