package edu.ilp.aSaccatoma.service.impl;


import edu.ilp.aSaccatoma.dao.IAsignaturaDao;
import edu.ilp.aSaccatoma.entity.Asignatura;
import edu.ilp.aSaccatoma.entity.Profesor;
import edu.ilp.aSaccatoma.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaServiceImpl implements IAsignaturaService {

    @Autowired
    private IAsignaturaDao asignaturaDao;

    @Override
    public Page<Asignatura> listaAsignaturaByProfesor(Pageable pageable, Profesor idprofesor) {
        return this.asignaturaDao.listaAsignatura(pageable,idprofesor);
    }
}
