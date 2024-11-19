package com.luckraw.payment_app.service;

import com.luckraw.payment_app.client.AuthorizationClient;
import com.luckraw.payment_app.controller.dto.TransferDto;
import com.luckraw.payment_app.entity.Transfer;
import com.luckraw.payment_app.exception.PaymentException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService {

    private final AuthorizationClient authorizationClient;

    public AuthorizationService(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    public boolean isAuthorized(TransferDto transferDto){

        var response = authorizationClient.isAuthorized();

        if (response.getStatusCode().isError()) {
            throw new PaymentException();
        }

        return response.getBody().authorized();

    }
}
