public class DailyLimitValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (request.getType() == ETransactionType.WITHDRAWAL) {
            if (request.getAmount() > request.getUser().getDailyLimit()) {
                request.setConclusion("Transaction refused: daily limit exceeded!");
                next = null;
            } else {
                System.out.println("Daily limit validation completed!");
                if (next != null) {
                    next.handleRequest(request);
                }
            }
        }
    }
}
