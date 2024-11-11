package com.luckraw.payment_app.service;

import com.luckraw.payment_app.controller.dto.CreateWalletDTO;
import com.luckraw.payment_app.entity.Wallet;
import com.luckraw.payment_app.exception.WalletDataAlreadyExistsException;
import com.luckraw.payment_app.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(CreateWalletDTO dto) {

        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.cpfCnpj());
        if(walletDb.isPresent()) {
            throw new WalletDataAlreadyExistsException("CpfCnpj or Email already exists");
        }

       return walletRepository.save(dto.toWallet());
    }
}
