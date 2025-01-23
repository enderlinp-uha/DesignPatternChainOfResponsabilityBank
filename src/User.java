public class User {
    private String ipAddress  = "";
    private double dailyLimit = 0.0;
    private double balance    = 0.0;

    public User(double balance, double dailyLimit, String ipAddress) {
        this.ipAddress  = ipAddress;
        this.dailyLimit = dailyLimit;
        this.balance    = balance;
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
        return "User [ipAddress=" + ipAddress + ", dailyLimit=" + dailyLimit + ", balance=" + balance + "]";
    }
}
