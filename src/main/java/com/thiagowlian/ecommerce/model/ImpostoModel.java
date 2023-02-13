package com.thiagowlian.ecommerce.model;

import com.thiagowlian.ecommerce.dto.ImpostoForm;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "IMPOSTO")
public class ImpostoModel extends ModelBase {

    @Column(name = "nome")
    private String nome;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "porcentagem")
    private float porcentagem;

    @ManyToMany(mappedBy = "impostos", fetch = FetchType.LAZY)
    private Set<CategoriaModel> categorias = new HashSet<>();

    public ImpostoModel (ImpostoForm impostoForm) {
        this.nome = impostoForm.nome();
        this.sigla = impostoForm.sigla();
        this.porcentagem = impostoForm.porcentagem();
    }
}
