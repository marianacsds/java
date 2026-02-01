import handler.*;
import request.Request;

public class Main {
    public static void main(String[] args) {

        Handler auth = new AuthHandler();
        Handler permission = new PermissionHandler();
        Handler data = new DataValidationHandler();
        Handler process = new ProcessHandler();

        auth.setNext(permission);
        permission.setNext(data);
        data.setNext(process);

        Request request = new Request(true, true, true);
        auth.handle(request);
    }
}
