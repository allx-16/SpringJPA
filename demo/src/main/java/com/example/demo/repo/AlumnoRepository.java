package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
