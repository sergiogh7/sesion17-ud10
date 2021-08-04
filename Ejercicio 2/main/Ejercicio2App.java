package main;

import javax.swing.JOptionPane;

import error.errorPersonalizado;

public class Ejercicio2App {

	public static void main(String[] args) {
		
		String palabra = "";
		
//		Pide un apalabra y muestra un mensaje si es o no la misma.
		try {
			palabra = JOptionPane.showInputDialog("Escriba el nombre de una pieza de coche.");
			
			throw new errorPersonalizado(palabra);
			
		} catch (errorPersonalizado error) {
			System.out.println(error.mensaje());
			
		}
	}
}