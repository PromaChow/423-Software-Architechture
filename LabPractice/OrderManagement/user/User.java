package user;

public class User {
    private String id;
    private String name;
    private String email;
    private String type;
    private double balance;

    public User(String name, String email, String id, String type, double balance) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.type = type;
        this.balance = balance;


    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void reduceAmount(double amount){
        balance = balance - amount;
        if (balance < 0) {
            System.out.println("NEGATIVE BALANCE for " + id);
        }
    }
}
