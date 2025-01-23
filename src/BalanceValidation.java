public class BalanceValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (request.getType() == EValidationType.BALANCE) {

        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
