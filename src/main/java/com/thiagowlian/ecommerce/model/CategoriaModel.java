package com.thiagowlian.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "categoria")
public class CategoriaModel extends ModelBase {

    @Getter
    @Setter
    @Column(name = "nome")
    private String nome;

    @Getter
    @Setter
    @OneToMany(mappedBy = "categoria")
    private List<ProdutoModel> produtos;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(
            name = "IMPOSTO_CATEGORIA",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "imposto_id")
    )
    private Set<ImpostoModel> impostos = new HashSet<>();
}

