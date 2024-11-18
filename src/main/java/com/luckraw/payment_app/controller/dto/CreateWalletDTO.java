package com.luckraw.payment_app.controller.dto;

import com.luckraw.payment_app.entity.Wallet;
import com.luckraw.payment_app.entity.WalletType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateWalletDTO(
        @NotBlank String fullName,
        @NotBlank String cpfCnpj,
        @NotBlank String email,
        @NotBlank String password,
        @NotNull WalletType.Enum walletType) {

    public Wallet toWallet() {
        return new Wallet(fullName, cpfCnpj, email, password, walletType.get());
    }
}
