package com.grupo.bricolajeapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.bricolajeapi.entity.dao.IAlmacenDao;
import com.grupo.bricolajeapi.entity.models.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {
	
	@Autowired
	private IAlmacenDao almacenDao;

	@Override
	public List<Almacen> obtenerAlmacenes() {
		return (List<Almacen>)almacenDao.findAll();
	}

	@Override
	public void eliminarAlmacen(long numero) {
		almacenDao.deleteById(numero);
	}

	@Override
	public void agregarAlmacen(Almacen almacen) {
		if (!almacenDao.existsById(almacen.getNumero()))
			almacenDao.save(almacen);
	}

	@Override
	public void actualizarAlmacen(Almacen almacen) {
		if(almacenDao.existsById(almacen.getNumero()))
			almacenDao.save(almacen);
	}

	
}
