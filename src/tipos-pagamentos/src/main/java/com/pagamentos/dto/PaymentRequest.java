package com.pagamentos.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    //NotNull - não pode ser nulo
    @NotNull
    private BigDecimal valor;
    //NotBlank - não pode ser vazio e nem só espaços
    @NotBlank
    private String metodo;
}
