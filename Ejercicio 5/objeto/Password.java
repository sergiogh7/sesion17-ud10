package objeto;

import java.util.Random;

public class Password {
	
//	Atributos.
	private int longitud;
	private String contrasenya;
	final int LONGITUD = 8;

//	Constructores.
	public Password () {
		this.longitud = LONGITUD;
		this.contrasenya = generarContrasenya();
	}
	public Password (int longitud) {
		this.longitud = longitud;
		this.contrasenya = generarContrasenya();
	}

//	Funciones.
	public String generarContrasenya() {
		
		String contrasenya = "";
		char caracter;
		Random numAleatorio = new Random();
		
//		Recorre la longitud de la contraseña.
		for (int i = 0; i < getLongitud(); i++) {
			
//			Comprueba si es true o false.
			if (numAleatorio.nextBoolean()) {
				
				// Para las mayusculas o minusculas.
				if (numAleatorio.nextBoolean()) {
					caracter = (char) ((int) (numAleatorio.nextDouble() * 26 + 65));
					contrasenya += caracter;
					
				}else {
					caracter = (char) ((int) (numAleatorio.nextDouble() * 26 + 97));
					contrasenya += caracter;
					
				}
				
			// Genera numeros del 48 al 57, los equivalentes ascii a los numeros del 0 al 10.
			}else {
				caracter = (char) ((int) (numAleatorio.nextDouble() * 10 +48));
				contrasenya += caracter;
				
			}
		}
		return contrasenya;
	}
	
//	Comprueba si la contraseña es lo suficientemente fuerte.
	public boolean compruebaContrasenya() {
		
//		Contadores
		int numeros = 0;
		int mayusculas = 0;
		int minusculas = 0;
		
		boolean filtro = false;
		char caracter;
		
//		Recorre la longitud de la contraseña.
		for (int i = 0; i < getLongitud(); i++) {
			
//			Guarda todos los caracteres llamando a la funcion anterior.
			caracter = getContrasenya().substring(i, i+1).charAt(0);
			
//			Comprueba en el rango ascii que tipo de dato es, si un numero, mayuscula o minuscula y suma contadores.
			if (((int) caracter) >= 48 && ((int) caracter) <= 57) {
				numeros++;
				
			}
			
			if (((int) caracter) >= 65 && ((int) caracter) <= 90) {
				mayusculas++;
				
			}
			
			if (((int) caracter) >= 97 && ((int) caracter) <= 122) {
				minusculas++;
				
			}
		}
		
//		Retorna true si ha superado el filtro.
		if (mayusculas > 2 && minusculas > 1 && numeros > 5) {
			filtro = true;
		}
		
		return filtro;
	}
	
	// Getters setters
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasenya() {
		return generarContrasenya();
	}
	public void setContrasenya(String contraseña) {
		this.contrasenya = contraseña;
	}
}