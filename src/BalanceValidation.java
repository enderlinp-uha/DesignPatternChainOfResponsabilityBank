public class BalanceValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (request.getType() == ETransactionType.WITHDRAWAL) {
            if (request.getAmount() > request.getUser().getBalance()) {
                request.setConclusion("Transaction refused: user balance not sufficient!");
                next = null;
            } else {
                System.out.println("User balance: " + request.getAmount() + "€");
                System.out.println("Balance validation completed!");
                if (next != null) {
                    next.handleRequest(request);
                }
            }
        }
    }
}
