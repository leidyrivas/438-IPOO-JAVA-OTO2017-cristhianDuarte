package com.grupo6.ipoo.traficoAereo.aernave;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {

		private long id;
		private String nombre;
		private String descripcion;
		private int tamTanque;
		private int cantMotores;
		private int canPersonaTripulacion;
		
		//esto comento para poder hacer el list
		//este es el original
		//private List<PlanDeVuelo> planDeVuelo; 
		//private List<TipoDeAvion> tipoDeAvion;
		
		
		//este es de prueba
		private List<Integer> planDeVuelo;
		private List<Integer> tiposDeAvion;
		
		
		
		private Gps gps;
		
		
		//DESDE ACA ME EMPECE A DIVAGAR |"|(>-<)|"|
		//constructor divague1
		public Aeronave(){
			planDeVuelo=new ArrayList<Integer>();
		}
		
		
		
		
		//Este seria el LIST
		public void testList(){
			
			int valor=0;
			// tope
			int valorMaximo=10;
			
			System.out.println("(Antes de asignar) Cuantos elementos tiene: " + planDeVuelo.size());
			
			int indice=0;
			while(indice < valorMaximo){
				valor++;
				System.out.println("Asignando " + valor);
				planDeVuelo.add(valor);
				indice++;
			}
			
			System.out.println("(Despues de asignar) Cuantos elementos tiene: " + planDeVuelo.size());
			indice=0;
			
			while(indice<planDeVuelo.size()){
				System.out.println(planDeVuelo.get(indice));
				indice++;
			}
		
		}
		
		public static void main(String[] args){
			Aeronave pa=new Aeronave();
			// pa.test();
			pa.testList();
		}
}
