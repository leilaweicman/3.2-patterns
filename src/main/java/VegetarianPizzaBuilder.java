import java.util.Arrays;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    private final Pizza pizza;

    public VegetarianPizzaBuilder(Pizza pizza) {
        this.pizza = pizza;
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
        setSize("Medium");
        setDough("Thin");
        setToppings(Arrays.asList("Tomato", "Mozzarella", "Peppers", "Onion", "Olives"));
        return build();
    }
}
