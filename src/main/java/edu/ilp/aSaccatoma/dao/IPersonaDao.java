package edu.ilp.aSaccatoma.dao;

import edu.ilp.aSaccatoma.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

}
