import java.util.Arrays;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private final Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void setSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void setDough(String dough) {
        pizza.setDough(dough);
    }

    @Override
    public void setToppings(List<String> toppings) {
        pizza.setToppings(toppings);
    }

    @Override
    public Pizza build() {
        return pizza;
    }

    public Pizza buildDefault() {
        setSize("Large");
        setDough("Thick");
        setToppings(Arrays.asList("Ham", "Pineapple", "Cheese"));
        return build();
    }
}
