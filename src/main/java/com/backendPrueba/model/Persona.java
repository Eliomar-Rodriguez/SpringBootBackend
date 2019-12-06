package com.backendPrueba.model;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Persona {
	@Id
	private int idPersona;

	@Column(name = "nombre", length = 50)
	private String nombre;

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
