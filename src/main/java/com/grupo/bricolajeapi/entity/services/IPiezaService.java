package com.grupo.bricolajeapi.entity.services;

import java.util.List;

import com.grupo.bricolajeapi.entity.models.Pieza;

public interface IPiezaService {

	public List<Pieza> obtenerPiezas();
	
	public void eliminarPieza(String clave);
	
	public void agregarPieza(Pieza pieza);
	
	public void actualizarPieza(Pieza pieza);
}
