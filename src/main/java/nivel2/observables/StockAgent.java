package nivel2.observable;

import nivel2.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String marketStatus;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(marketStatus);
        }
    }

    public void setMarketStatus(String marketStatus) {
        this.marketStatus = marketStatus;
        System.out.println("\nMarket status changed to: " + marketStatus.toUpperCase());
        notifyObservers();
    }
}
