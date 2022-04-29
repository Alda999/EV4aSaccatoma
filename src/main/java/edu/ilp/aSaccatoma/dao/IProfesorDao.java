package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
}
