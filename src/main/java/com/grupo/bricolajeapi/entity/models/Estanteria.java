package com.grupo.bricolajeapi.entity.models;
import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "estanterias")
public class Estanteria implements Serializable {

	private static final long serialVersionUID = 4L;
	
	@EmbeddedId
    private EstanteriaId id;
	
    public Estanteria() {
	}
    
    public Estanteria(EstanteriaId id) {
		this.id = id;
	}

	public EstanteriaId getId() {
        return id;
    }
	public void setId(EstanteriaId id) {
        this.id = id;
    }
	
	 
}
	

