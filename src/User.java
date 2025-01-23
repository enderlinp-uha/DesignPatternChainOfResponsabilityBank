public class User {
    private String name = "";
    private String ipAddress = "";
    private double dailyLimit = 0.0;
    private double balance = 0.0;

    public User(String name, double balance, double dailyLimit, String ipAddress) {
        this.name = name;
        this.ipAddress = ipAddress;
        this.dailyLimit = dailyLimit;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", ipAddress=" + ipAddress + ", balance=" + balance + ", dailyLimit=" + dailyLimit + "]";
    }
}
