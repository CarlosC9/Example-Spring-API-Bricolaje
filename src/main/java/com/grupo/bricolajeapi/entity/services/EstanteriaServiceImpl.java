package com.grupo.bricolajeapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.bricolajeapi.entity.dao.IEstanteriaDao;
import com.grupo.bricolajeapi.entity.models.Estanteria;
import com.grupo.bricolajeapi.entity.models.EstanteriaId;

@Service
public class EstanteriaServiceImpl implements IEstanteriaService{
	@Autowired
	private IEstanteriaDao estanteriaDao;
	
	@Override
	public void agregarEstanteria(Estanteria estanteria) {
		if (!estanteriaDao.existsById(estanteria.getId()))
			estanteriaDao.save(estanteria);
	}

	@Override
	public void actualizarEstanteria(Estanteria estanteria) {
		if (estanteriaDao.existsById(estanteria.getId()))
			estanteriaDao.save(estanteria);
		
	}

	@Override
	public void eliminarEstanteria(EstanteriaId estanteriaId) {
		if (estanteriaDao.existsById(estanteriaId))
		estanteriaDao.deleteById(estanteriaId);
	}

	@Override
	public List<Estanteria> obtenerEstanterias() {
		return (List<Estanteria>) estanteriaDao.findAll();
	}

}
