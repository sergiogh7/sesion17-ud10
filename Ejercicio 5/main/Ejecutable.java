package main;

import java.util.Scanner;

import objeto.Password;

public class Ejecutable {

	public static void main(String[] args) {

//		Declara el Scanner y otras variables.
		Scanner teclado = new Scanner(System.in);
		int tama�oArray;
		int longitudContrasenya;
		
//		Pide el tama�o del array de contrase�as.
		System.out.println("Indique tama�o del array de contrase�as:");
		tama�oArray = teclado.nextInt();
		
//		Asigna la longitud al array de contrase�as.
		Password arrayPassword[] = new Password[tama�oArray];
		
//		Array de booleanos.
		boolean arrayPasswordFuerte[] = new boolean[tama�oArray];
		
		// Para generar contrase�as.
		for(int i = 0; i < tama�oArray; i++) {
			
//			Pide la longitud de la contrase�a
			System.out.println("Indique longitud de la contrase�a " +(i+1)+ ".");
			longitudContrasenya = teclado.nextInt();
			
//			Genera una contrase�a.
			Password contrasenya = new Password(longitudContrasenya);
			
//			La guarda en la posicion actual del array.
			arrayPassword[i] = contrasenya;
			
//			Guarda en el array de booleanos si es fuerte o no la contrase�a actual.
			arrayPasswordFuerte[i] = arrayPassword[i].compruebaContrasenya();
			
//			Printa todas las contrase�as y si es fuerte o no.
			System.out.println("Contrase�a " + (i+1) + ": " + arrayPassword[i].getContrasenya() + ""
							+ "\nFuerte: " + arrayPasswordFuerte[i] + "\n");

		}
		
	}
	
}