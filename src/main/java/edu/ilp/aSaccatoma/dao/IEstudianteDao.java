package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    //2-Buscar Estudiante por Codigo
    Estudiante findByCodigo(String codigo);

    //Obtener estudiante por apellido o nombre
    @Query("SELECT e FROM Estudiante e WHERE e.nombre LIKE CONCAT('%',:apenombre,'%') OR e.apellido LIKE CONCAT('%',:apenombre,'%') ")
    List<Estudiante> EstudiantesByApeNombre(@Param("appnombre") String apenombre);


}
