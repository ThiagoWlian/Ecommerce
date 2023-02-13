package com.thiagowlian.ecommerce.service;

import com.thiagowlian.ecommerce.model.ImpostoModel;
import com.thiagowlian.ecommerce.repository.ImpostoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImpostoService {

    @Autowired
    private ImpostoRepository impostoRepository;

    public ImpostoModel cadastrarImposto(ImpostoModel imposto) {
        return impostoRepository.save(imposto);
    }

    public Optional<ImpostoModel> buscarImposto(int id) {
        return impostoRepository.findById(id);
    }
}
