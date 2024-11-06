package com.luckraw.payment_app.repository;

import com.luckraw.payment_app.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
