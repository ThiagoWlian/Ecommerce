package com.thiagowlian.ecommerce.service;

import com.thiagowlian.ecommerce.model.ProdutoModel;
import com.thiagowlian.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void cadastrarProduto(ProdutoModel produto) {
        produtoRepository.save(produto);
    }

    public Optional<ProdutoModel> buscarProduto(int id) {
        return produtoRepository.findById(id);
    }
}
