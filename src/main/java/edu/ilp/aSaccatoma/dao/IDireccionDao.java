package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionDao extends JpaRepository<Direccion,Long> {

    //3-Direccion del Estudiante
    Direccion findByDireccion(Long idDireccion);
}
