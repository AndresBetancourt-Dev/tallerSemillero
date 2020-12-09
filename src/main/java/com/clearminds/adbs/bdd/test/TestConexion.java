package com.clearminds.adbs.bdd.test;

import java.sql.Connection;

import com.clearminds.adbs.bdd.ConexionBDD;
import com.clearminds.adbs.excepciones.BDDException;

public class TestConexion {
	public static void main(String[] args) {
		try{
			Connection connection = ConexionBDD.obtenerConexion();
			if(connection != null){
				System.out.println("Conexión Exitosa");
			}
		}catch(BDDException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
