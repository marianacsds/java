package handler;

import request.Request;

public class ProcessHandler extends BaseHandler {

    @Override
    public void handle(Request request) {
        System.out.println("Requisição processada com sucesso!");
    }
}