package com.thiagowlian.ecommerce.repository;

import com.thiagowlian.ecommerce.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
}
