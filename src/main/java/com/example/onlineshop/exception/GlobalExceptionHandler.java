package com.example.onlineshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    private ErrorResponse noSuchElementHandler(IllegalArgumentException exception) {
        return ErrorResponse.builder(exception, HttpStatus.NOT_ACCEPTABLE, exception.getMessage()).build();
    }

    @ExceptionHandler(RoleNotFoundException.class)
    private ErrorResponse noSuchElementHandler(RoleNotFoundException exception) {
        return ErrorResponse.builder(exception, HttpStatus.NOT_FOUND, exception.getMessage()).build();
    }
}
