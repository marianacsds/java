package handler;

import request.Request;

public class PermissionHandler extends BaseHandler {

    @Override
    public void handle(Request request) {
        if (!request.hasPermission()) {
            System.out.println("Permissão negada");
            return;
        }
        super.handle(request);
    }
}