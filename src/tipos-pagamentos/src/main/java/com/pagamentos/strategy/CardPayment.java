package com.pagamentos.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CardPayment implements PaymentStrategy {

    @Override
    public void processar(BigDecimal valor) {
        System.out.printf("Pagamento com cartão no valor de %.2f reais", valor);
    }
}
