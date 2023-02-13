package com.thiagowlian.ecommerce.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoForm(@NotBlank String nome, String descricao, @NotNull BigDecimal valor, BigDecimal valor_custo, int estoque,
                          @NotNull int categoria_id) {
}
