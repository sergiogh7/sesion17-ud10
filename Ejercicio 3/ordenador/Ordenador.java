package ordenador;

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
		
		return (int) (numAleatorio.nextDouble() * 999 + 1);
	}
	
//	Comprueba si es par o impar
	public boolean compruebaParImpar () {

		if (getNumero() % 2 == 0) {
			return true;
			
		}else{
			return false;
			
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