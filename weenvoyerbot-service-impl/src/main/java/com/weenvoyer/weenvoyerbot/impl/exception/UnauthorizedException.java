package com.weenvoyer.weenvoyerbot.impl.exception;

import com.weenvoyer.arch.jersey.exceptions.ApiException;
import com.weenvoyer.arch.locale.LocaleResolver;

import javax.ws.rs.core.Response;
import java.util.Locale;

/**
 * Created by wmalgarizi on 30/05/17.
 */
public class UnauthorizedException extends ApiException {

    private Locale locale;

    public UnauthorizedException(Locale locale) {
        this.locale = locale;
    }

    @Override
    public Integer code() {
        return httpCode().getStatusCode();
    }

    @Override
    public String message() {
        return LocaleResolver.getMessage("invalid.credentials", locale);
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
        return Response.Status.FORBIDDEN;
    }
}
