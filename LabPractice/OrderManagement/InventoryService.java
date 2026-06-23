import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private static Map<String, Integer> stock = new HashMap<>();

    static {
        stock.put("ITEM-1", 5);
        stock.put("ITEM-2", 100);
    }

    public boolean check(String item, int qty) {
        Integer s = stock.get(item);

        if (s == null) return false;

        if (qty <= 0) return false;

        return s >= qty;
    }

    public void reduce(String item, int qty) {
        Integer s = stock.get(item);

        if (s != null) {
            stock.put(item, s - qty);
        }
    }
}