package com.marvin.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	private String nombre;

	private String apellido;
	
	private int edad;

	private String direccion;

	private String dui;

	private String nit;

	private int grupoDeClaseProgramacion3Alquepertenece;

	private double utimaNotaObtenidaEnProgramacion2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public int getGrupoDeClaseProgramacion3Alquepertenece() {
		return grupoDeClaseProgramacion3Alquepertenece;
	}

	public void setGrupoDeClaseProgramacion3Alquepertenece(int grupoDeClaseProgramacion3Alquepertenece) {
		this.grupoDeClaseProgramacion3Alquepertenece = grupoDeClaseProgramacion3Alquepertenece;
	}

	public double getUtimaNotaObtenidaEnProgramacion2() {
		return utimaNotaObtenidaEnProgramacion2;
	}

	public void setUtimaNotaObtenidaEnProgramacion2(double utimaNotaObtenidaEnProgramacion2) {
		this.utimaNotaObtenidaEnProgramacion2 = utimaNotaObtenidaEnProgramacion2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion="
				+ direccion + ", dui=" + dui + ", nit=" + nit + ", grupoDeClaseProgramacion3Alquepertenece="
				+ grupoDeClaseProgramacion3Alquepertenece + ", utimaNotaObtenidaEnProgramacion2="
				+ utimaNotaObtenidaEnProgramacion2 + "]";
	}


}