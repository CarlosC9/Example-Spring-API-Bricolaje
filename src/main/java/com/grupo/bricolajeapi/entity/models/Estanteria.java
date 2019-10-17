package com.grupo.bricolajeapi.entity.models;
import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "estanterias")
public class Estanteria implements Serializable {

	private static final long serialVersionUID = 4L;
	
	@EmbeddedId
    private EstanteriaId id;
	
	@ManyToOne
	@JoinColumn(name="num_almacen", insertable = false, updatable = false)
	private Almacen almacen;

	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "se_almacenan",
    joinColumns = @JoinColumn(name = "{nom_estanteria,num_almacen}"),
    inverseJoinColumns = @JoinColumn(name = "clave_pieza"))
	List<Pieza> piezas;
	
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
	

