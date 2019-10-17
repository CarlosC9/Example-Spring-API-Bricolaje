package com.grupo.bricolajeapi.entity.models;
import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "estanterias")
public class Estanteria implements Serializable {

	private static final long serialVersionUID = 4L;
	
	@EmbeddedId
    private EstanteriaId id;
	
	@ManyToOne
	@JoinColumn(name="num_almacen", insertable = false, updatable = false)
	private Almacen almacen;

	
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
	

