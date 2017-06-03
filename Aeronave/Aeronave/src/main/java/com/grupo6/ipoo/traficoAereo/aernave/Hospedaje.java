package com.grupo6.ipoo.traficoAereo.aernave;

import java.util.Date;
import java.util.List;

public class Hospedaje {
	private int id;
	private Date inicio;
	private Date fin;
	private List<NoResidente> noResidente;
	private Hangar hangar;
	
	public Hospedaje(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public List<NoResidente> getNoResidente() {
		return noResidente;
	}

	public void setNoResidente(List<NoResidente> noResidente) {
		this.noResidente = noResidente;
	}

	public Hangar getHangar() {
		return hangar;
	}

	public void setHangar(Hangar hangar) {
		this.hangar = hangar;
	}

	public Hospedaje(int id, Date inicio, Date fin, List<NoResidente> noResidente, Hangar hangar) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
		this.noResidente = noResidente;
		this.hangar = hangar;
	}
	
	
	
	
}
