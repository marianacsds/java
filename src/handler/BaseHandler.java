package handler;

import request.Request;

public abstract class BaseHandler extends Handler {

    @Override
    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
