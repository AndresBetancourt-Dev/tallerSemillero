package com.clearminds.adbs.servicios;


import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.adbs.bdd.ConexionBDD;
import com.clearminds.adbs.dtos.Estudiante;
import com.clearminds.adbs.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
		public void insertarEstudiante(Estudiante estudiante) throws BDDException{
			abrirConexion();
			System.out.println("Insertando estudiante:"+estudiante.toString());
			Statement stmt = null;
			try{
				stmt = ConexionBDD.obtenerConexion().createStatement();
				String sql = "INSERT INTO estudiantes(nombre,apellido,edad) VALUES('"+estudiante.getNombre()+"','"+estudiante.getApellido()+"','"+estudiante.getEdad()+"')";
				System.out.println("Script: "+sql);
				stmt.executeUpdate(sql);
				
				cerrarConexion();
			}catch(SQLException e){
				e.printStackTrace();
				throw new BDDException("Error al insertar estudiante");
			}
			
		}
		
		public void actualizarEstudiante(Estudiante estudiante) throws BDDException{
			abrirConexion();
			System.out.println("Actualizando estudiante:"+estudiante.toString());
			Statement stmt = null;
			try{
				stmt = ConexionBDD.obtenerConexion().createStatement();
				String sql = "UPDATE estudiantes SET nombre='"+estudiante.getNombre()+"', apellido='"+estudiante.getApellido()+"',edad="+estudiante.getEdad()+" WHERE id="+estudiante.getId();
				System.out.println("Script: "+sql);
				stmt.executeUpdate(sql);
				
				cerrarConexion();
			}catch(SQLException e){
				e.printStackTrace();
				throw new BDDException("Error al actualizar estudiante");
			}
			
		}
}
