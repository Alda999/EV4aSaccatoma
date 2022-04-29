package edu.ilp.aSaccatoma.service;

import edu.ilp.aSaccatoma.entity.Direccion;
import org.springframework.stereotype.Service;

@Service
public interface IDireccionService {
    //Direccion Estudiante
    Direccion buscarDireccionEstudiante(Long idDireccion);

}
