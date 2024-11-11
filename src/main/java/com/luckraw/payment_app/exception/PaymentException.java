package com.luckraw.payment_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class PaymentException extends RuntimeException{

    public ProblemDetail toProblemDetail() {

        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        pb.setTitle("Payment internal server error");
        return pb;
    }
}
