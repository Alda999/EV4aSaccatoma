package edu.ilp.aSaccatoma.service.Impl;

import edu.ilp.aSaccatoma.dao.IAsignaturaDao;
import edu.ilp.aSaccatoma.entity.Asignatura;
import edu.ilp.aSaccatoma.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignaturaServiceImpl implements IAsignaturaService {
    @Autowired
    private IAsignaturaDao asignaturaDao;


    @Override
    public List<Asignatura> listaAsignaturas() {
        return this.asignaturaDao.findAll();
    }

    @Override
    public Asignatura guardarAsignatura(Asignatura asignatura) {
        return this.asignaturaDao.save(asignatura);
    }
}
