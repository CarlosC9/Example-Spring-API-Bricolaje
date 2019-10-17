package com.grupo.bricolajeapi.entity.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.JoinColumn;

/*@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, 
property = "@id")*/

@Entity(name = "piezas")
public class Pieza implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String clave;
	
	@Column
	private String descripcion;
	
	@Column
	private double precio;
	
	@JsonIgnoreProperties({"piezas"})
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "compone",
    		   joinColumns = @JoinColumn(name = "clave_pieza"),
    		   inverseJoinColumns = @JoinColumn(name = "clave_componente"))
	private List<Pieza> piezas;
	
	@JsonIgnoreProperties({"piezas"})
	@ManyToMany(mappedBy = "piezas")
	List<Estanteria> estanterias;
	
	public List<Estanteria> getEstanterias() {
		return estanterias;
	}

	public void setEstanterias(List<Estanteria> estanterias) {
		this.estanterias = estanterias;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

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

	public List<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas(List<Pieza> piezas) {
		this.piezas = piezas;
	}
	
	
	
	
	
	
}
