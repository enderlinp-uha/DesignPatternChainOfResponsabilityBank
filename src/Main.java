public class Main {
    public static void main(String[] args) {
        IValidationService balance = new BalanceValidation();
        IValidationService dailyLimit = new DailyLimitValidation();
        IValidationService security = new SecurityValidation();

        balance.setNext(dailyLimit);
        dailyLimit.setNext(security);

        ValidationRequest requestA = new ValidationRequest(EValidationType.BALANCE, "1000");
        ValidationRequest requestB = new ValidationRequest(EValidationType.DAILY_LIMIT, "100");
        ValidationRequest requestC = new ValidationRequest(EValidationType.SECURITY, "10.10.10.10");

        System.out.println(requestA.getConclusion());
        System.out.println(requestB.getConclusion());
        System.out.println(requestC.getConclusion());
    }
}