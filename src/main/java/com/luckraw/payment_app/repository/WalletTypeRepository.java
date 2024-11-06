package com.luckraw.payment_app.repository;

import com.luckraw.payment_app.entity.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
}
