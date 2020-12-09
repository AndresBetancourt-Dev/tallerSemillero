package com.clearminds.adbs.bdd.test;

import com.clearminds.adbs.dtos.Estudiante;
import com.clearminds.adbs.excepciones.BDDException;
import com.clearminds.adbs.servicios.ServicioEstudiante;

public class TestActualizar {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try{
		
			srvEstudiante.actualizarEstudiante(new Estudiante(6,"Pedro","Navaja"));
			
		}catch(BDDException e){
			e.printStackTrace();
			e.getMessage();
		}
	}
}

