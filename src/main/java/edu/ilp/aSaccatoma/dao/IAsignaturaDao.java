package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Asignatura;
import edu.ilp.aSaccatoma.entity.Profesor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAsignaturaDao extends JpaRepository<Asignatura, Long> {

    @Query("SELECT e FROM Asigantura e WHERE e.profesor = :idprofesor ")
    Page<Asignatura> listaAsignatura(Pageable pageable, @Param("idprofesor") Profesor idprofesor);

}
