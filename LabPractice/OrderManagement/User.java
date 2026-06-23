public class User {
    public String id;
    public String name;
    public String email;
    public String type; 
    public double balance;

    public boolean isPremium() {
        return type != null && (type.equals("PREMIUM") || type.equals("VIP"));
    }
}