package edu.ilp.aSaccatoma.controller;

import edu.ilp.aSaccatoma.dao.IDireccionDao;
import edu.ilp.aSaccatoma.dao.IEstudianteDao;
import edu.ilp.aSaccatoma.entity.Direccion;
import edu.ilp.aSaccatoma.entity.Estudiante;
import edu.ilp.aSaccatoma.entity.Persona;
import edu.ilp.aSaccatoma.service.IDireccionService;
import edu.ilp.aSaccatoma.service.IEstudianteService;
import edu.ilp.aSaccatoma.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruebaController {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersonas")
    public List<Persona> listaPersonas(){
        return this.personaService.listarPersonas();
    }

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/buscarEstudianteByCodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){
        return this.estudianteService.obtnerEstudiantePorCodigo(codigo);
    }

    @Autowired
    private IDireccionService direccionService;
    @GetMapping("/direccionEstudiante")
    public Direccion direccionEstudiante(@RequestParam Long idDireccion){
        return this.direccionService.buscarDireccionEstudiante(idDireccion);
    }



}
