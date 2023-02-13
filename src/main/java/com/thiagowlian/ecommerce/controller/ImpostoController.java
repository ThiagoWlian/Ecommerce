package com.thiagowlian.ecommerce.controller;

import com.thiagowlian.ecommerce.dto.ImpostoForm;
import com.thiagowlian.ecommerce.model.ImpostoModel;
import com.thiagowlian.ecommerce.service.ImpostoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/imposto")
public class ImpostoController {

    @Autowired
    private ImpostoService impostoService;

    @PostMapping
    public ResponseEntity criarImposto(@RequestBody @Valid ImpostoForm impostoForm) {
        try {
            ImpostoModel imposto = new ImpostoModel(impostoForm);
            impostoService.cadastrarImposto(imposto);

            return ResponseEntity.created(URI.create("/imposto/" + imposto.getId())).build();
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().body(ex.toString());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarImpostoPorId(@PathVariable int id) {
        Optional<ImpostoModel> impostoModel = impostoService.buscarImposto(id);

        try {
            if (impostoModel.isPresent()) {
                return ResponseEntity.ok(impostoModel);
            }
            return ResponseEntity.notFound().build();
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().body(ex.toString());
        }
    }
}
