package edu.ilp.aSaccatoma.service.impl;

import edu.ilp.aSaccatoma.dao.IPersonaDao;
import edu.ilp.aSaccatoma.entity.Persona;
import edu.ilp.aSaccatoma.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;
    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }
}
