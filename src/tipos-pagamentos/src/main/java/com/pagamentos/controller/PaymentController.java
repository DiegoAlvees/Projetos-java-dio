package com.pagamentos.controller;

import com.pagamentos.dto.PaymentRequest;
import com.pagamentos.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService serve) {
        this.service = serve;
    }

    @PostMapping("/pagamento")
    public String pagar (@RequestBody PaymentRequest request) {
        service.pagar(request);
        return "Pagamento processado";
    }
}
