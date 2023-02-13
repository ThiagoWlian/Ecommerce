package com.thiagowlian.ecommerce.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ImpostoForm(@NotBlank String nome, @NotBlank String sigla, @NotNull float porcentagem) {
}
