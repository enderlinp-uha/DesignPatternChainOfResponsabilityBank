public interface IValidationService {
    void setNext(IValidationService next);
    void handleRequest(ValidationRequest request);
}
