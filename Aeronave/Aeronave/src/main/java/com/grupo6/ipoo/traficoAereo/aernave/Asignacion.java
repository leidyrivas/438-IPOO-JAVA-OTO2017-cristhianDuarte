package com.grupo6.ipoo.traficoAereo.aernave;

import java.util.Date;

public class Asignacion {
	 private int id;
	 private Date fecha;
	 private Date fechaHoraCreacion;
	 private Hospedaje hospedaje;
	 private EstadoPlanDeVuelo estadoPlanDeVuelo;
	 private ItemAsignacion itemAsignacionSalida;
	 private ItemAsignacion itemAsignacionLlegada;
	 
	//constructor1 vacio 
	public Asignacion(){
		
	}

	
	//metodos
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaHoraCreacion() {
		return fechaHoraCreacion;
	}

	public void setFechaHoraCreacion(Date fechaHoraCreacion) {
		this.fechaHoraCreacion = fechaHoraCreacion;
	}

	public Hospedaje getHospedaje() {
		return hospedaje;
	}

	public void setHospedaje(Hospedaje hospedaje) {
		this.hospedaje = hospedaje;
	}

	public EstadoPlanDeVuelo getEstadoPlanDeVuelo() {
		return estadoPlanDeVuelo;
	}

	public void setEstadoPlanDeVuelo(EstadoPlanDeVuelo estadoPlanDeVuelo) {
		this.estadoPlanDeVuelo = estadoPlanDeVuelo;
	}

	public ItemAsignacion getItemAsignacionSalida() {
		return itemAsignacionSalida;
	}

	public void setItemAsignacionSalida(ItemAsignacion itemAsignacionSalida) {
		this.itemAsignacionSalida = itemAsignacionSalida;
	}

	public ItemAsignacion getItemAsignacionLlegada() {
		return itemAsignacionLlegada;
	}

	public void setItemAsignacionLlegada(ItemAsignacion itemAsignacionLlegada) {
		this.itemAsignacionLlegada = itemAsignacionLlegada;
	}
	
	

	
	
	
	
	 
	 
	 
}
