package handler;

import request.Request;

public class DataValidationHandler extends BaseHandler {

    @Override
    public void handle(Request request) {
        if (!request.isValid()) {
            System.out.println("Dados inválidos");
            return;
        }
        super.handle(request);
    }
}
