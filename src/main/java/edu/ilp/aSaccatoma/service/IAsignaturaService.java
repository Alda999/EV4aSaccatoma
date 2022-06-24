package edu.ilp.aSaccatoma.service;

import edu.ilp.aSaccatoma.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    //Listar
    List<Asignatura> listaAsignaturas();

    //Guardar
    Asignatura guardarAsignatura(Asignatura asignatura);

}
