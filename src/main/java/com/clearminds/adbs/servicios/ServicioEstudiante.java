package com.clearminds.adbs.servicios;

import com.clearminds.adbs.dtos.Estudiante;
import com.clearminds.adbs.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
		public void insertarEstudiante(Estudiante estudiante) throws BDDException{
			abrirConexion();
			System.out.println("Insertando estudiante:"+estudiante.toString());
			cerrarConexion();
		}
}
