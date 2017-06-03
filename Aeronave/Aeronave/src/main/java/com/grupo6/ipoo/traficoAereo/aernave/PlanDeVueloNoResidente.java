package com.grupo6.ipoo.traficoAereo.aernave;

import java.util.List;

public class PlanDeVueloNoResidente extends PlanDeVuelo {

	private String origen;
	private List<Actualizacion> actualizacion;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public PlanDeVueloNoResidente(String origen) {
		super();
		this.origen = origen;
	}
	
	
}
