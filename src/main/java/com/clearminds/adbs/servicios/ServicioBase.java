package com.clearminds.adbs.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.adbs.bdd.ConexionBDD;
import com.clearminds.adbs.excepciones.BDDException;

public class ServicioBase {
	Connection conexion;
	
	public void abrirConexion() throws BDDException{
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		try {
			if(conexion!=null){
				conexion.close();
				System.out.println("Conexión cerrada.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexión.");
		}
	}
}
