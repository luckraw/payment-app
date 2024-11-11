package com.luckraw.payment_app.controller;

import com.luckraw.payment_app.exception.PaymentException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(PaymentException.class)
    public ProblemDetail handlePaymentException(PaymentException e) {
        return e.toProblemDetail();
    }
}
