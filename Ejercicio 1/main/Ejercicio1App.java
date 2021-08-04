package main;

import javax.swing.JOptionPane;
import objeto.Ordenador;

public class Ejercicio1App {

	public static void main(String[] args) {

		Ordenador ordenador1 = new Ordenador();
		int contador = 0;
		int numero = 0;

//		Bucle que no para hasta que se acierte el numero.
		do {
			
//			Comprueba si hay un numero o no.
			try {
				
				String numeroInput = JOptionPane.showInputDialog("Escriba un numero");
				
				numero = Integer.parseInt(numeroInput);
				
//				Comprueba si el nuemro es mayor o menor.
				System.out.println(ordenador1.compruebaTamanyo(numero));
				
				contador++;
			
//			Salta un error si no pone un numero.
			} catch (NumberFormatException e) {
				System.out.println("No has introducido un numero");
				
			}
		
//		No sal ehasta que los numeros no sean iguales.
		} while (!ordenador1.comprobadorNumero(numero));
		
//		Mensaje
		System.out.println("El numero total de intentos es de: " + contador + ".");
		
	}

}