public class NotificationService {

    public void notify(User u, String msg) {

        if (u.email.contains("@mail.com")) {
            System.out.println("EMAIL: " + msg);
        } else {
            System.out.println("SMS: " + msg);
        }

        if (u.type.equals("VIP")) {
            System.out.println("Send priority notification");
        }
    }
}