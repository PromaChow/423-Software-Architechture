public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        User u = userService.getUser("u123");

        orderService.placeOrder(u, "ITEM-1", 3);
        orderService.placeOrder(u, "ITEM-2", 10);

        orderService.checkout(u);
    }
}