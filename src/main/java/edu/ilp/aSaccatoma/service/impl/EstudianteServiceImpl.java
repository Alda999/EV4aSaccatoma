package edu.ilp.aSaccatoma.service.impl;

import edu.ilp.aSaccatoma.dao.IEstudianteDao;
import edu.ilp.aSaccatoma.entity.Estudiante;
import edu.ilp.aSaccatoma.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {


    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante obtnerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.findByCodigo(codigo);
    }

    @Override
    public List<Estudiante> EstudianteApeNom(String apenom) {
        return this.estudianteDao.EstudiantesByApeNombre(apenom);
    }

}
