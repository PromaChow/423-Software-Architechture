import java.util.*;

public class OrderService {

    private static Map<String, Order> activeOrders = new HashMap<>();
    private InventoryService inventoryService = new InventoryService();
    private PricingService pricingService = new PricingService();
    private UserService userService = new UserService();

    public void placeOrder(User u, String itemId, int qty) {

        if (u == null) return;

        Order order = activeOrders.get(u.id);

        if (order == null) {
            order = new Order();
            order.userId = u.id;
            activeOrders.put(u.id, order);
        }

        if (inventoryService.check(itemId, qty)) {
            order.addItem(itemId, qty);
        } else {
            System.out.println("Item out of stock: " + itemId);
        }
    }

    public void checkout(User u) {
        Order order = activeOrders.get(u.id);

        if (order == null) {
            System.out.println("No order found");
            return;
        }

        double total = 0;

        for (int i = 0; i < order.items.size(); i++) {
            String item = order.items.get(i);
            int qty = order.quantities.get(i);

            double price = pricingService.getPrice(item, qty, u);
            total += price;

            inventoryService.reduce(item, qty);
        }

        if (u.type.equals("VIP")) {
            total = total * 0.7;
        } else if (u.type.equals("PREMIUM")) {
            total = total * 0.85;
        }

        if (total > 50000) {
            total = total - 500;
        }

        if (new Random().nextBoolean()) {
            total = total + 50; // random charge??
        }

        order.total = total;

        if (u.balance >= total) {
            userService.updateBalance(u, total);
            PaymentGateway pg = new PaymentGateway();
            pg.pay(u, total);

            NotificationService ns = new NotificationService();
            ns.notify(u, "Order placed: " + total);

            order.checkedOut = true;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}