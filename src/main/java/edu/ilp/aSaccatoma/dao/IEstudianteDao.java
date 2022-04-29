package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    //2-Buscar Estudiante por Codigo
    Estudiante findByCodigo(String codigo);

    //
}
