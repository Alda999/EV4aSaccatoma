package edu.ilp.aSaccatoma.controller;

import edu.ilp.aSaccatoma.entity.*;
import edu.ilp.aSaccatoma.service.IAsignaturaService;
import edu.ilp.aSaccatoma.service.IDireccionService;
import edu.ilp.aSaccatoma.service.IEstudianteService;
import edu.ilp.aSaccatoma.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
  public IEstudianteService estudianteService;

    @GetMapping("/buscarEstudianteByCodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){
        return this.estudianteService.obtnerEstudiantePorCodigo(codigo);
    }
    //@Autowired
    //private IDireccionService direccionService;


    /*@GetMapping("/buscarDireccionByIdAndNombre")
    public Direccion buscarDireccionByIdAndNombre(@RequestParam Long iddireccion, @RequestParam String Nombre){
        return this.direccionService.buscarDirecionByIdAndNombre(iddireccion,Nombre);
    }*/

    @Autowired
    private IAsignaturaService asignaturaService;
    @GetMapping("/listaPage")
    public Page<Asignatura> listaAsignaturaPage(@RequestParam Profesor idprofesor, @RequestParam int pagina){

        Pageable page = PageRequest.of(pagina,2);

        return this.asignaturaService.listaAsignaturaByProfesor(page,idprofesor);
    }

    @GetMapping("/listarByAppNombre/{apenombre}")
    public List<Estudiante> EstudianteApeNom(@PathVariable String apenombre){
        return this.estudianteService.EstudianteApeNom(apenombre);
    }



}
