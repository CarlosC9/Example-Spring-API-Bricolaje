package com.grupo.bricolajeapi.entity.models;
import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "estanterias")
public class Estanteria implements Serializable {

	private static final long serialVersionUID = 4L;
	
	@EmbeddedId
    private EstanteriaId estanteria;

	@JsonIgnoreProperties({"estanterias"})
	@ManyToOne
	@JoinColumn(name="num_almacen", insertable = false, updatable = false)
	private Almacen almacen;


	@JsonIgnoreProperties({"estanterias"})
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "se_almacenan",
    		   joinColumns = {@JoinColumn(name = "nom_estanteria"),
    				   		  @JoinColumn(name = "num_almacen")},
    		   inverseJoinColumns = @JoinColumn(name = "clave_pieza"))
	List<Pieza> piezas;
	
    public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public List<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas(List<Pieza> piezas) {
		this.piezas = piezas;
	}

	public Estanteria() {
	}
    
    public Estanteria(EstanteriaId estanteria) {
		this.estanteria = estanteria;
	}

	public EstanteriaId getId() {
        return estanteria;
    }
	public void setId(EstanteriaId estanteria) {
        this.estanteria = estanteria;
    }
	
	 
}
	

