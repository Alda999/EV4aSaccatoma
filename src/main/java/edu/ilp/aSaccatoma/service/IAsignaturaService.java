package edu.ilp.aSaccatoma.service;

import edu.ilp.aSaccatoma.entity.Asignatura;
import edu.ilp.aSaccatoma.entity.Profesor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IAsignaturaService {
    //Lista estudiantes por escuela y por páginas
    Page<Asignatura> listaAsignaturaByProfesor(Pageable pageable, Profesor idprofesor);
}
