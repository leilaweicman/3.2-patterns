package nivel1.builders;

import nivel1.Pizza;

import java.util.List;

public interface PizzaBuilder {
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}
