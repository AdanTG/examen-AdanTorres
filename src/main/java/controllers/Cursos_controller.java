package com.Upiiz.Examen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cursos_controller {

    @GetMapping("/Cursos")
    public String cursos() {
        return "Cursos";
    }

    @GetMapping("/Cursos/anadir")
    public String cursosAgregar() {
        return "Anadir";
    }

    @GetMapping("/Cursos/editar")
    public String cursosEditar() {
        return "Editar";
    }

    @GetMapping("/Cursos/eliminar")
    public String cursosEliminar() {
        return "Eliminar";
    }
}
