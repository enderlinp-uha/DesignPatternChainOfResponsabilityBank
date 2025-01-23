public class Main {
    public static void main(String[] args) {
        IValidationService balance    = new BalanceValidation();
        IValidationService dailyLimit = new DailyLimitValidation();
        IValidationService security   = new SecurityValidation();

        balance.setNext(dailyLimit);
        dailyLimit.setNext(security);

        User user1 = new User(2000.0, 500.0, "10.0.1.254");
        System.out.println(user1);

        ValidationRequest request = new ValidationRequest(ETransactionType.WITHDRAWAL, user1, 500.0);
        balance.handleRequest(request);

        System.out.println(request.getConclusion());
    }
}