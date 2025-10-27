package nivel2.observers;

public class StockAgency implements Observer {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }
    @Override
    public void update(String marketStatus) {
        System.out.println("[" + name + "] Notified: Market is " + marketStatus.toUpperCase());
    }
}
