package com.pagamentos.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BoletoPayment implements PaymentStrategy {

    @Override
    public void processar(BigDecimal valor) {
        System.out.printf("Pagamento com boleto no valor de %.2f reais", valor);
    }
}