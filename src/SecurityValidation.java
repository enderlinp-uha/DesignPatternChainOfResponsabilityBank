public class SecurityValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (request.getType() == ETransactionType.WITHDRAWAL) {
            String ipAddress = request.getUser().getIpAddress();
            if (!request.inWhiteList(ipAddress)) {
                request.setConclusion("Transaction refused: IP address does not match!");
                next = null;
            } else {
                System.out.println("Security validation completed!");
                if (next != null) {
                    next.handleRequest(request);
                } else {
                    double newBalance = request.getUser().getBalance() - request.getAmount();
                    System.out.println("New user balance: " + newBalance + "€");
                }
            }
        }
    }
}
