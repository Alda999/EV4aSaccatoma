package edu.ilp.aSaccatoma.service.impl;

import edu.ilp.aSaccatoma.dao.IDireccionDao;
import edu.ilp.aSaccatoma.entity.Direccion;
import edu.ilp.aSaccatoma.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements IDireccionService {
    @Autowired
    private IDireccionDao direccionDao;

    @Override
    public Direccion buscarDireccionEstudiante(Long idDireccion) {
        return this.direccionDao.findByDireccion(idDireccion);
    }
}
