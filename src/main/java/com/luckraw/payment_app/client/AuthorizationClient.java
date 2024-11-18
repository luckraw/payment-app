package com.luckraw.payment_app.client;

import com.luckraw.payment_app.controller.dto.AuthorizationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "${client.authorization-service.url}")
public interface AuthorizationClient {

    @GetMapping
    ResponseEntity<AuthorizationResponse> isAuthorized();
}
