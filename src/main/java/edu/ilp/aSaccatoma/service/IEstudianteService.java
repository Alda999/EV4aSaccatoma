package edu.ilp.aSaccatoma.service;

import edu.ilp.aSaccatoma.entity.Estudiante;

public interface IEstudianteService {

    //2-Estudiante por codigo
    Estudiante obtnerEstudiantePorCodigo(String codigo);
}
