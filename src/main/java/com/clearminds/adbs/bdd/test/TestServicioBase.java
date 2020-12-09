package com.clearminds.adbs.bdd.test;

import com.clearminds.adbs.excepciones.BDDException;
import com.clearminds.adbs.servicios.ServicioEstudiante;

public class TestServicioBase {
	public static void main(String[] args) {
	   ServicioEstudiante servicio = new ServicioEstudiante();
	   try {
		servicio.abrirConexion();
		System.out.println("Conexión abierta.");
	} catch (BDDException e) {
		e.printStackTrace();
	}
	   servicio.cerrarConexion();
	}
}
