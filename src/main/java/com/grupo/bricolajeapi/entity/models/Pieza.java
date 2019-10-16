package com.grupo.bricolajeapi.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "piezas")
public class Pieza implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String clave;
	
	@Column
	private String descripcion;
	
	@Column
	private double precio;
	
	public Pieza() {}

	public Pieza(String clave, String descripcion, float precio) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
