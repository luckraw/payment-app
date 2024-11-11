package com.luckraw.payment_app.controller.dto;

import com.luckraw.payment_app.entity.Wallet;
import com.luckraw.payment_app.entity.WalletType;

public record CreateWalletDTO(String fullName, String cpfCnpj, String email, String password, WalletType.Enum walletType) {

    public Wallet toWallet() {
        return new Wallet(fullName, cpfCnpj, email, password, walletType.get());
    }
}
