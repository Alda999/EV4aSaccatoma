package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAsignaturaDao extends JpaRepository<Asignatura,Long> {

    //List<Asignatura> findByAsignatura(Asignatura idasignatura);

}
