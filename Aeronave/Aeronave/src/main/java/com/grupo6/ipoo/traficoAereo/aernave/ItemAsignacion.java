package com.grupo6.ipoo.traficoAereo.aernave;

import java.util.Date;

public class ItemAsignacion {
	
	private Date fechaHora;
	
	// constructor vacio
	public ItemAsignacion(){
		
	}


	public Date getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}


	public ItemAsignacion(Date fechaHora) {
		super();
		this.fechaHora = fechaHora;
	}

	
	
}
