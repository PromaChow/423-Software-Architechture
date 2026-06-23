public class PricingService {

    public double getPrice(String item, int qty, User u) {

        double base;

        if (item.equals("ITEM-1")) {
            base = 1000;
        } else if (item.equals("ITEM-2")) {
            base = 200;
        } else {
            base = 500;
        }

        double total = base * qty;

        if (qty > 5) {
            total = total * 0.9;
        }

        if (u.isPremium()) {
            total = total * 0.95;
        }

        if (u.name.startsWith("User-u1")) {
            total = total - 100;
        }

        return total;
    }
}