package com.application.commonCode.http.entity.specification.exception;

import java.io.IOException;

public abstract class HttpException extends IOException {

    public HttpException(String message) {
        super(message);
    }
}
