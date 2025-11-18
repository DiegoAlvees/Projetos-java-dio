package com.pagamentos.service;

import com.pagamentos.dto.PaymentRequest;
import com.pagamentos.strategy.PaymentStrategy;
import com.pagamentos.strategy.PaymentStrategyFactory;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentStrategyFactory factory;


    public PaymentService(PaymentStrategyFactory factory) {
        this.factory = factory;
    }

    public void pagar(PaymentRequest request) {
        // Descobrir a estratégia correta
        PaymentStrategy strategy = factory.get(request.getMetodo());


        // processa o pagamento
        strategy.processar(request.getValor());
    }
}
