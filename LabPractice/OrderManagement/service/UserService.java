package service;

import user.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private static Map<String, User> userDB = new HashMap<>();

    public void addUser(User user){
        userDB.put(user.getId(), user);
    }
    public User fetchUser(String id) {
        if (userDB.containsKey(id)) {
            return userDB.get(id);
        }
        return null;
    }

//    public void updateBalance(User u, double amount) {
//        if (u != null) {
//            u.balance = u.balance - amount;
//            if (u.balance < 0) {
//                System.out.println("NEGATIVE BALANCE for " + u.id);
//            }
//        }
//    }
}
