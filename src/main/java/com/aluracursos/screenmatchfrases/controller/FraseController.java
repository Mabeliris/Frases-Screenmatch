package com.aluracursos.screenmatchfrases.controller;

import com.aluracursos.screenmatchfrases.model.Frase;
import com.aluracursos.screenmatchfrases.service.FraseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {

    private FraseService service;
    @GetMapping("/frases")
    public List<Frase> obtenerFrases(){

        return service.obtenerFrases();

    }
}
