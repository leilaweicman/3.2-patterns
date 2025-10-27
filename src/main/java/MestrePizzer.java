import java.util.Arrays;

public class MestrePizzer {
    private PizzaBuilder builder;

    public MestrePizzer(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void constructPizza() {
        builder.buildSize();
        builder.buildDough();
        builder.buildToppings();
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }
}
