import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    public void setSize(String size) {
        this.size = size;
    }
    public void setDough(String dough) {
        this.dough = dough;
    }
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size +
                ", dough=" + dough +
                ", toppings=" + toppings + "]";
    }
}
