package edu.ilp.aSaccatoma.service;

import edu.ilp.aSaccatoma.entity.Direccion;
import edu.ilp.aSaccatoma.entity.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEstudianteService {

    //2-Estudiante por codigo
    Estudiante obtnerEstudiantePorCodigo(String codigo);

    //Obtener estudiante mediante nombre o apellido
    List<Estudiante> EstudianteApeNom(String apenom);
}
