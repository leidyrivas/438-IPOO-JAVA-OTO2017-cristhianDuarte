package com.grupo6.ipoo.traficoAereo.aernave;

import java.util.Date;

public class ActualizacionAvion {
	
	private Date fecha;
	
	//constructor1 vacio
	public ActualizacionAvion(){
		
	}
	
	
	//metodos
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	//constructor2 
	public ActualizacionAvion(Date fecha) {
		super();
		this.fecha = fecha;
	}

	
	
}
