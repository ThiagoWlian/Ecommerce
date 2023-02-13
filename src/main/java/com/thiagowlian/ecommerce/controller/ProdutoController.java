package com.thiagowlian.ecommerce.controller;

import com.thiagowlian.ecommerce.dto.ProdutoForm;
import com.thiagowlian.ecommerce.model.CategoriaModel;
import com.thiagowlian.ecommerce.model.ProdutoModel;
import com.thiagowlian.ecommerce.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

/*    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody @Valid ProdutoForm produtoForm) {

    }

    @PostMapping("/categoria")
    public ResponseEntity<CategoriaModel> criarCategoriaProduto(@RequestBody @Valid ProdutoForm produtoForm) {

    }*/

    @GetMapping("/{id}")
    public ResponseEntity buscarProdutoPeloId(@PathVariable int id) {
        try {
            Optional<ProdutoModel> produto = produtoService.buscarProduto(id);

            if (produto.isPresent()) {
                return ResponseEntity.ok(produto.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().body(ex.toString());
        }
    }
}
