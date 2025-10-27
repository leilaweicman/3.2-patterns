import java.util.Arrays;

public class MestrePizzer {
    private PizzaBuilder builder;

    public MestrePizzer(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void constructCustomPizza() {
        builder.setSize("Large");
        builder.setDough("Stuffed crust");
        builder.setToppings(Arrays.asList("Cheese", "Tomato", "Bacon", "Mushrooms"));
    }

    public Pizza getPizza() {
        return builder.build();
    }
}
