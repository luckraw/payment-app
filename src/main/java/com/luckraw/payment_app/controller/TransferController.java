package com.luckraw.payment_app.controller;

import com.luckraw.payment_app.controller.dto.TransferDto;
import com.luckraw.payment_app.entity.Transfer;
import com.luckraw.payment_app.service.TransferService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {


    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public ResponseEntity<Transfer> transfer(@RequestBody @Valid TransferDto dto) {
        var response = transferService.transfer(dto);

        return ResponseEntity.ok(response);
    }
}
