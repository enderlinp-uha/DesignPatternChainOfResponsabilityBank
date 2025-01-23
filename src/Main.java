public class Main {
    public static void main(String[] args) {
        IValidationService balance = new BalanceValidation();
        IValidationService dailyLimit = new DailyLimitValidation();
        IValidationService security = new SecurityValidation();

        balance.setNext(dailyLimit);
        dailyLimit.setNext(security);

        User user1 = new User("Philippe", 2000.00, 500.00, "10.0.1.1");
        System.out.println(user1);
        String userBalance    = String.valueOf(user1.getBalance());
        String userDailyLimit = String.valueOf(user1.getDailyLimit());
        String userIpAddress  = user1.getIpAddress();

        ValidationRequest requestA = new ValidationRequest(EValidationType.BALANCE, userBalance);
        ValidationRequest requestB = new ValidationRequest(EValidationType.DAILY_LIMIT, userDailyLimit);
        ValidationRequest requestC = new ValidationRequest(EValidationType.SECURITY, userIpAddress);

        System.out.println(requestA.getConclusion());
        System.out.println(requestB.getConclusion());
        System.out.println(requestC.getConclusion());
    }
}