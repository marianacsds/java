package handler;

import request.Request;

public class AuthHandler extends BaseHandler {

    @Override
    public void handle(Request request) {
        if (!request.isAuthenticated()) {
            System.out.println("Falha na autenticação");
            return;
        }
        super.handle(request);
    }
}
