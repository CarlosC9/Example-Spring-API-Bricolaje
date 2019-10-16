package com.grupo.bricolajeapi.entity.dao;
import com.grupo.bricolajeapi.entity.models.Estanteria;
import org.springframework.data.repository.CrudRepository;
public interface IEstanteriaDao extends CrudRepository<Estanteria,Estanteria.EstanteriaId> {

}
