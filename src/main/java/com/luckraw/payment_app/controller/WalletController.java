package com.luckraw.payment_app.controller;

import com.luckraw.payment_app.controller.dto.CreateWalletDTO;
import com.luckraw.payment_app.entity.Wallet;
import com.luckraw.payment_app.service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody CreateWalletDTO dto) {
        var wallet = walletService.createWallet(dto);
        return ResponseEntity.ok(wallet);
    }
}
