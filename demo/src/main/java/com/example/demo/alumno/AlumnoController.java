package com.example.demo.alumno;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alumno;
import com.example.demo.repo.AlumnoRepository;

@RestController
public class AlumnoController {
    private final AlumnoRepository repo;

    public AlumnoController(AlumnoRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/alumnos")
    public List<Alumno> findAllAlumnos() {
        return repo.findAll();
    }

    @PostMapping("/alumnos")
    public Alumno addAlumno(@RequestBody Alumno alumno) {
        return repo.save(alumno);
    }
}
