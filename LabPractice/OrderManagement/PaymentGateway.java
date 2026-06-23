public class PaymentGateway {

    public void pay(User u, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid payment");
            return;
        }

        if (u.type.equals("VIP")) {
            System.out.println("Fast-track VIP payment");
        }

        System.out.println("Paid " + amount + " for " + u.id);

        log(u, amount);
    }

    private void log(User u, double amt) {
        System.out.println("LOGGING: " + u.id + " -> " + amt);
    }
}