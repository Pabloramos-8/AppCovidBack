package com.example.demo.modelo.responsable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Responsable")
public class Responsable {

	@Id
	@ApiModelProperty(value = "identificador del responsable", dataType = "long", position = 1, example = "1")
    @Column(name = "id",unique=true, nullable = false)
	private long id;
	
	
	@ApiModelProperty(value = "telefono del responsable", dataType = "String", position = 2, example = "123456789")
	@Column(name="telefono")
	private String telefono;
	
	@ApiModelProperty(value = "parentesco del responsable", dataType = "String", position = 3, example = "123456789")
	@Column(name="telefono")
	private String parentesco;
	
	@ApiModelProperty(value = "nombre del responsable", dataType = "String", position = 4, example = "Aitor")
	@Column(name="nombre")
	private String nombre;


	public Responsable(long id, String telefono, String parentesco, String nombre) {
		this.id = id;
		this.telefono = telefono;
		this.parentesco = parentesco;
		this.nombre = nombre;
	}

	public Responsable() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Responsable [id=" + id + ", telefono=" + telefono + ", parentesco=" + parentesco + ", nombre=" + nombre
				+ "]";
	}

}
