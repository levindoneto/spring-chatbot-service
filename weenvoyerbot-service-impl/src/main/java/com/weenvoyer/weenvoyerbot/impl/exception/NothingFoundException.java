package com.weenvoyer.weenvoyerbot.impl.exception;

import com.weenvoyer.arch.jersey.exceptions.ApiException;

import javax.ws.rs.core.Response;

public class NothingFoundException extends ApiException {

    private String message;

    public NothingFoundException(String message) {
        this.message = message;
    }

    @Override
    public Integer code() {
        return httpCode().getStatusCode();
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public String detail() {
        return null;
    }

    @Override
    public String field() {
        return null;
    }

    @Override
    public Response.Status httpCode() {
        return Response.Status.NOT_FOUND;
    }
}
