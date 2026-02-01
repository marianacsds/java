package request;

public class Request {

    private boolean authenticated;
    private boolean hasPermission;
    private boolean valid;

    public Request(boolean authenticated, boolean hasPermission, boolean valid) {
        this.authenticated = authenticated;
        this.hasPermission = hasPermission;
        this.valid = valid;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean hasPermission() {
        return hasPermission;
    }

    public boolean isValid() {
        return valid;
    }
}
