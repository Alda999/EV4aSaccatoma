package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDireccionDao extends JpaRepository<Direccion,Long>  {

    //Direccion findByIddireccionAndNombre(Long iddireccion, String nombre);

}
