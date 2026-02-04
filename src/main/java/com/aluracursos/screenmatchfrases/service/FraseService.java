package com.aluracursos.screenmatchfrases.service;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.model.Frase;
import com.aluracursos.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;


    public FraseDTO obtenerFrases() {
        Frase frase= repository.obtenerFrase();

        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
