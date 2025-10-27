package nivel1.builders;

import nivel1.Pizza;

import java.util.Arrays;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    private final Pizza pizza;

    public VegetarianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize("Medium");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin crust");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(Arrays.asList("Tomato", "Cheese", "Onion", "Peppers", "Olives"));
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
