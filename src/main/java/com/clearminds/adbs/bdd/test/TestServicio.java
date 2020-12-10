package com.clearminds.adbs.bdd.test;

import com.clearminds.adbs.dtos.Estudiante;
import com.clearminds.adbs.excepciones.BDDException;
import com.clearminds.adbs.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try{
		
			srvEstudiante.actualizarEstudiante(new Estudiante(12,"Marco","Chavez",23));
			
		}catch(BDDException e){
			e.printStackTrace();
			e.getMessage();
		}
	}
}
