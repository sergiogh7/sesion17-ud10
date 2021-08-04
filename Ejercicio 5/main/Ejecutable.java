package main;

import java.util.Scanner;

import objeto.Password;

public class Ejecutable {

	public static void main(String[] args) {

//		Declara el Scanner y otras variables.
		Scanner teclado = new Scanner(System.in);
		int tamañoArray;
		int longitudContrasenya;
		
//		Pide el tamaño del array de contraseñas.
		System.out.println("Indique tamaño del array de contraseñas:");
		tamañoArray = teclado.nextInt();
		
//		Asigna la longitud al array de contraseñas.
		Password arrayPassword[] = new Password[tamañoArray];
		
//		Array de booleanos.
		boolean arrayPasswordFuerte[] = new boolean[tamañoArray];
		
		// Para generar contraseñas.
		for(int i = 0; i < tamañoArray; i++) {
			
//			Pide la longitud de la contraseña
			System.out.println("Indique longitud de la contraseña " +(i+1)+ ".");
			longitudContrasenya = teclado.nextInt();
			
//			Genera una contraseña.
			Password contrasenya = new Password(longitudContrasenya);
			
//			La guarda en la posicion actual del array.
			arrayPassword[i] = contrasenya;
			
//			Guarda en el array de booleanos si es fuerte o no la contraseña actual.
			arrayPasswordFuerte[i] = arrayPassword[i].compruebaContrasenya();
			
//			Printa todas las contraseñas y si es fuerte o no.
			System.out.println("Contraseña " + (i+1) + ": " + arrayPassword[i].getContrasenya() + ""
							+ "\nFuerte: " + arrayPasswordFuerte[i] + "\n");

		}
		
	}
	
}