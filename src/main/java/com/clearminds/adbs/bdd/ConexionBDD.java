package com.clearminds.adbs.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.adbs.excepciones.BDDException;

public class ConexionBDD {
	
	
	public static Connection obtenerConexion() throws BDDException{
		Connection connection = null;
		String url = leerPropiedad("urlConexion");
		String usuario = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, usuario, password);
		}catch(Exception e){
			e.printStackTrace();
			 throw new BDDException("No se pudo Conectar a la base de datos.");
		}
		return connection;
	}
	
	
	public static String leerPropiedad(String propiedad){
		Properties properties = new Properties();
		File file = new File("conexion.properties");
		try {
			properties.load(new FileReader(file));	
			return properties.getProperty(propiedad) != null ? properties.getProperty(propiedad) : null;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
