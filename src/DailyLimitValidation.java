public class DailyLimitValidation implements IValidationService {
    private IValidationService next = null;

    @Override
    public void setNext(IValidationService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ValidationRequest request) {
        if (request.getType() == EValidationType.DAILY_LIMIT) {

        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
