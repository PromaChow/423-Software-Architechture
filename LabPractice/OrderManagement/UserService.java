import java.util.HashMap;
import java.util.Map;

public class UserService {

    private static Map<String, User> cache = new HashMap<>();

    public User getUser(String id) {
        if (cache.containsKey(id)) {
            return cache.get(id);
        }


        User u = new User();
        u.id = id;
        u.name = "User-" + id;
        u.email = id + "@mail.com";
        u.type = id.equals("u123") ? "VIP" : "NORMAL";
        u.balance = 100000;

        cache.put(id, u);

        return u;
    }

    public void updateBalance(User u, double amount) {
        if (u != null) {
            u.balance = u.balance - amount;
            if (u.balance < 0) {
                System.out.println("NEGATIVE BALANCE for " + u.id);
            }
        }
    }
}