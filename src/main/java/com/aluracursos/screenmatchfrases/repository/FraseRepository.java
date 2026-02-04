package com.aluracursos.screenmatchfrases.repository;

import com.aluracursos.screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase,Long> {

}
