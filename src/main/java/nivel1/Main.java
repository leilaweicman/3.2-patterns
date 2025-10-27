package nivel1;

import nivel1.builders.HawaiianPizzaBuilder;
import nivel1.builders.PizzaBuilder;
import nivel1.builders.VegetarianPizzaBuilder;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        MestrePizzer mestre = new MestrePizzer(hawaiianBuilder);
        mestre.constructPizza();
        Pizza hawaiianPizza = mestre.getPizza();
        System.out.println("First pizza built: " + hawaiianPizza);

        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        mestre = new MestrePizzer(vegetarianBuilder);
        mestre.constructPizza();
        Pizza vegetarianPizza = mestre.getPizza();
        System.out.println("Second pizza built: " + vegetarianPizza);
    }
}
