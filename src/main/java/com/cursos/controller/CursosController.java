package com.cursos.controller;

import com.cursos.model.Curso;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursosController {

    @GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getCurso(){
        return new Curso("Java", 100, "mañana");
    }
}
