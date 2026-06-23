import java.util.ArrayList;
import java.util.List;

public class Order {
    public String userId;
    public List<String> items = new ArrayList<>();
    public List<Integer> quantities = new ArrayList<>();
    public double total;
    public boolean checkedOut = false;

    public void addItem(String item, int qty) {
        items.add(item);
        quantities.add(qty);
    }
}