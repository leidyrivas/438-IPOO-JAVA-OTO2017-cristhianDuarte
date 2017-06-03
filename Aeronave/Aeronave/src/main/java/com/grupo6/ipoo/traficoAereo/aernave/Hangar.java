package com.grupo6.ipoo.traficoAereo.aernave;

import java.util.List;

public class Hangar {
	private int id;
	private String nombre;
	private List<Dimension> dimension;
	private List<Posicion> posicion;
	
	public Hangar(){
		
	}
	
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
	public List<Dimension> getDimension() {
		return dimension;
	}
	public void setDimension(List<Dimension> dimension) {
		this.dimension = dimension;
	}
	public List<Posicion> getPosicion() {
		return posicion;
	}
	public void setPosicion(List<Posicion> posicion) {
		this.posicion = posicion;
	}

	public Hangar(int id, String nombre, List<Dimension> dimension, List<Posicion> posicion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dimension = dimension;
		this.posicion = posicion;
	}
}
