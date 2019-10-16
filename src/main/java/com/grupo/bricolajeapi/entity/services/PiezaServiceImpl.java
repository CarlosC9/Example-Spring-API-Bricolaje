package com.grupo.bricolajeapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.bricolajeapi.entity.dao.IPiezaDao;
import com.grupo.bricolajeapi.entity.models.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {
	
	@Autowired
	private IPiezaDao piezaDao;

	@Override
	public List<Pieza> obtenerPiezas() {
		return (List<Pieza>)piezaDao.findAll();
	}

	@Override
	public void eliminarPieza(String clave) {
		piezaDao.deleteById(clave);
	}

	@Override
	public void agregarPieza(Pieza pieza) {
		if (!piezaDao.existsById( pieza.getClave() ))
			piezaDao.save(pieza);
	}

	@Override
	public void actualizarPieza(Pieza pieza) {
		if (piezaDao.existsById( pieza.getClave() ))
			piezaDao.save(pieza);
	}

}
