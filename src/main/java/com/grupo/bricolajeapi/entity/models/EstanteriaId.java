package com.grupo.bricolajeapi.entity.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EstanteriaId implements Serializable {
	
	private static final long serialVersionUID = 3L;
	
	@Column(name = "num_almacen")
    private Long numeroAlmacen;
 
    @Column(name = "nombre")
    private String nombre;
 
    public EstanteriaId() {
    }
 
    public EstanteriaId(Long numeroAlmacen, String nombre) {
        this.numeroAlmacen = numeroAlmacen;
        this.nombre = nombre;
    }
 
    public Long getNumeroAlmacen() {
		return numeroAlmacen;
	}

	public void setNumeroAlmacen(Long numeroAlmacen) {
		this.numeroAlmacen = numeroAlmacen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstanteriaId)) return false;
        EstanteriaId that = (EstanteriaId) o;
        return Objects.equals(getNumeroAlmacen(), that.getNumeroAlmacen()) &&
                Objects.equals(getNombre(), that.getNombre());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getNumeroAlmacen(), getNombre());
    }
}
