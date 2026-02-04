package com.aluracursos.screenmatchfrases.service;

import com.aluracursos.screenmatchfrases.model.Frase;
import com.aluracursos.screenmatchfrases.repository.FraseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService {

    private FraseRepository repository;
    public List<Frase> obtenerFrases() {
        return repository.findAll();
    }
}
