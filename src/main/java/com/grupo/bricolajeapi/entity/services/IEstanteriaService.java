package com.grupo.bricolajeapi.entity.services;

import java.util.List;

import com.grupo.bricolajeapi.entity.models.Estanteria;
import com.grupo.bricolajeapi.entity.models.EstanteriaId;


public interface IEstanteriaService {
	public void agregarEstanteria(Estanteria estanteria);

	public void actualizarEstanteria(Estanteria estanteria);

	public void eliminarEstanteria(EstanteriaId estanteria);
	
	public List<Estanteria> obtenerEstanterias();

}
