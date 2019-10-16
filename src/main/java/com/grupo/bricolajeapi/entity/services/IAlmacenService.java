package com.grupo.bricolajeapi.entity.services;

import java.util.List;

import com.grupo.bricolajeapi.entity.models.Almacen;

public interface IAlmacenService {

	public List<Almacen> obtenerAlmacenes();
	
	public void eliminarAlmacen(long numero);
	
	public void agregarAlmacen(Almacen almacen);
	
	public void actualizarAlmacen(Almacen almacen);
}
