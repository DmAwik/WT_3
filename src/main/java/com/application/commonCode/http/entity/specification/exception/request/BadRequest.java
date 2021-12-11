package com.application.commonCode.http.entity.specification.exception.request;

import com.application.commonCode.http.entity.specification.HttpResponseCode;

public class BadRequest extends HttpRequestException {

    public BadRequest(String message) {
        super(message);
    }

    @Override
    public HttpResponseCode responseCode() {
        return HttpResponseCode.BAD_REQUEST;
    }
}
