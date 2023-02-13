package com.thiagowlian.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Table(name = "produto")
public class ProdutoModel extends ModelBase{

    @Getter
    @Setter
    @Column(name = "nome")
    private String nome;

    @Getter
    @Setter
    @Column(name = "descricao")
    private String descricao;

    @Getter
    @Setter
    @Column(name = "valor")
    private BigDecimal valor;

    @Getter
    @Setter
    @Column(name = "valor_custo")
    private BigDecimal valorCusto;

    @Getter
    @Setter
    @Column(name = "estoque")
    private long estoque;

    @Getter
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
        categoria.getProdutos().add(this);
    }
}
