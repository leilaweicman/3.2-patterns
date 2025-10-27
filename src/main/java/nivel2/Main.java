package nivel2;

import nivel2.observables.StockAgent;
import nivel2.observers.StockAgency;

public class Main {
    public static void main(String[] args) {
        StockAgent agent = new StockAgent();

        StockAgency alpha = new StockAgency("Agency Alpha");
        StockAgency beta = new StockAgency("Agency Beta");
        StockAgency gamma = new StockAgency("Agency Gamma");

        agent.addObserver(alpha);
        agent.addObserver(beta);
        agent.addObserver(gamma);

        agent.setMarketStatus("up");
        agent.setMarketStatus("down");
    }
}
