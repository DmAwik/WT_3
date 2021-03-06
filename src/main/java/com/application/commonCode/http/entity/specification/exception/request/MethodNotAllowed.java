package com.application.commonCode.http.entity.specification.exception.request;

import com.application.commonCode.http.entity.specification.HttpResponseCode;

public class MethodNotAllowed extends HttpRequestException {

    public MethodNotAllowed(String message) {
        super(message);
    }

    @Override
    public HttpResponseCode responseCode() {
        return HttpResponseCode.METHOD_NOT_ALLOWED;
    }
}
