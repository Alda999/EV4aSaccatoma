package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

    //Obtener estudiante por apellido o nombre
    /*@Query("SELECT e FROM Persona e WHERE e.nombre LIKE CONCAT('%',:appnombre,'%') OR e.apellido LIKE CONCAT('%',:appnombre,'%') ")
    List<Persona> listarEstudiantesByAppNombre(@Param("appnombre") String appnombre);*/

}
