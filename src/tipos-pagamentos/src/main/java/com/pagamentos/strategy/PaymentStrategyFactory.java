package com.pagamentos.strategy;

import org.springframework.stereotype.Component;

@Component
public class PaymentStrategyFactory {
    private final PixPayment pix;
    private final CardPayment card;
    private final BoletoPayment boleto;

    public PaymentStrategyFactory(PixPayment pix, CardPayment card, BoletoPayment boleto) {
        this.pix = pix;
        this.card = card;
        this.boleto = boleto;
    }

    public PaymentStrategy get(String metodo) {
        if(metodo.equalsIgnoreCase("pix")) {
            return pix;
        }
        if(metodo.equalsIgnoreCase("card")) {
            return card;
        }
        if(metodo.equalsIgnoreCase("boleto")) {
            return boleto;
        }
        throw new IllegalArgumentException("Método de pagamento inválido: " + metodo);

    }
}
