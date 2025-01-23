public class SecurityValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (request.getType() == EValidationType.SECURITY) {

        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("No next validation service");
            }
        }
    }
}
