package edu.ilp.aSaccatoma.service;

import edu.ilp.aSaccatoma.entity.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IPersonaService {
    //1-Listar Persona
    List<Persona> listarPersonas();
}
