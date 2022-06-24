package edu.ilp.aSaccatoma.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.aSaccatoma.entity.Asignatura;
import edu.ilp.aSaccatoma.payload.RestResponse;
import edu.ilp.aSaccatoma.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asignatura")
public class AsignaturaController {
    @Autowired
    private IAsignaturaService asignaturaService;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/listar")
    public RestResponse listaAsignaturas(){
        List<Asignatura> listaAsignaturas =  this.asignaturaService.listaAsignaturas();
        try{
            if (listaAsignaturas.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de asignaturas ",listaAsignaturas);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Estamos trabajando en ello, vuelva mas tarde");
        }
    }
    @PostMapping("/registrar")
    public RestResponse registrarAsignatura(@RequestBody String jsonEstudiante) throws JsonProcessingException {

       Asignatura asignatura = this.objectMapper.readValue(jsonEstudiante,Asignatura.class);

        try{
            this.asignaturaService.guardarAsignatura(asignatura);
            return new RestResponse(HttpStatus.OK.value(),"Registro guardado satisfactoriamente",asignatura);
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }

    }


