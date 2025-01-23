import java.util.ArrayList;
import java.util.List;

public class ValidationRequest {
    private ETransactionType type;
    private User user              = null;
    private String conclusion      = "";
    private double amount          = 0.0;
    private List<String> whiteList = new ArrayList<>();

    public ValidationRequest(ETransactionType type, User user, double amount) {
        this.type   = type;
        this.user   = user;
        this.amount = amount;
        this.whiteList = List.of("10.0.1.1", "10.0.1.2", "10.0.1.3", "10.0.1.254");
    }

    public ETransactionType getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }

    public String getConclusion() {
        return conclusion;
    }

    public boolean inWhiteList(String ipAddress) {
        return whiteList.contains(ipAddress);
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
