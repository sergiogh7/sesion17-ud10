package objeto;

import java.util.Random;

public class Ordenador {

//	Atributo
	int numero;
	
//	Constructor
	public Ordenador () {
		// Genera un numero random llamando a la funcion.
		this.numero = creaNumeroAleatorio();
	}
	
	
//	Metodos
//	Genera un numero random.
	public int creaNumeroAleatorio() {
		Random numAleatorio = new Random();
		
		return (int) (numAleatorio.nextDouble() * 5 + 1);
	}
	
//	 Comprueba que el numero que recibe es igual al generado aleatoriamente
	public boolean comprobadorNumero(int numero) {
		
		if (numero == getNumero()) {
			return true;
			
		}else {
			return false;
		}
	}
	
//	Comprueba si es mayor o menor
	public String compruebaTamanyo (int numero) {

		if (numero > getNumero()) {
			return "El numero introducido es mayor";
			
		}else if (numero < getNumero()) {
			return "El numero introducido es menor";
			
		}else {
			return "Los numeros son iguales";
			
		}
	}
	
//	Metodo toString
	public String toString() {
		return "Numero: " + numero + ".";
	}

//	Getters y Setters
	public int getNumero() {
		return numero;
		
	}
	public void setNumero(int numero) {
		this.numero = numero;
		
	}
}