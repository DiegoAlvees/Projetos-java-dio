package com.pagamentos.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void processar(BigDecimal valor);
}
