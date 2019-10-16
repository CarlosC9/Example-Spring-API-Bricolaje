package com.grupo.bricolajeapi.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="almacenes")
public class Almacen implements Serializable {

	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numero;
	
	@Column
	private String descripcion;
	
	@Column
	private String direccion;

	public long getNumero() {
		return numero;
	}
	
	public Almacen() {
		
	}
	

	public Almacen(long numero, String descripcion, String direccion) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
		this.direccion = direccion;
	}



	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
