package com.clearminds.adbs.bdd.test;

import com.clearminds.adbs.bdd.ConexionBDD;

public class TestPropiedades {
	public static void main(String[] args) {
		String valueOne = ConexionBDD.leerPropiedad("propiedad1");
		System.out.println(valueOne);
		String valueTwo = ConexionBDD.leerPropiedad("xx");
		System.out.println(valueTwo);
	}
}
