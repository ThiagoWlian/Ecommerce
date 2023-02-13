package com.thiagowlian.ecommerce.repository;

import com.thiagowlian.ecommerce.model.ImpostoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImpostoRepository extends JpaRepository<ImpostoModel, Integer> {

    Optional<ImpostoModel> findImpostoModelByNome(String nome);
}
