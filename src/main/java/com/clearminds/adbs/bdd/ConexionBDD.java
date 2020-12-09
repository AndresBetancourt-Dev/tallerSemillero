package com.clearminds.adbs.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	
	public static void main(String[] args) {
		System.out.println(leerPropiedad("propiedad1"));
		System.out.println(leerPropiedad("propiedad2"));
		System.out.println(leerPropiedad(""));
		
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
