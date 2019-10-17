package com.grupo.bricolajeapi.entity.dao;
import com.grupo.bricolajeapi.entity.models.Estanteria;
import com.grupo.bricolajeapi.entity.models.EstanteriaId;

import org.springframework.data.repository.CrudRepository;
public interface IEstanteriaDao extends CrudRepository<Estanteria,EstanteriaId> {

}
