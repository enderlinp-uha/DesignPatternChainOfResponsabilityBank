public class ValidationRequest {
    private final EValidationType type;
    private String request = "";
    private String conclusion = "";

    public ValidationRequest(EValidationType type, String request) {
        this.type = type;
        this.request = request;
    }

    public EValidationType getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
