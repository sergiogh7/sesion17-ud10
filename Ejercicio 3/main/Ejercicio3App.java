package main;

import ordenador.Ordenador;
import ordenador.errorPersonalizado;

public class Ejercicio3App {

	public static void main(String[] args) throws errorPersonalizado {

//		Crea un objeto de la clase Ordenador
		Ordenador ordenador1 = new Ordenador();
		
		try {
			
//			Si el resultado que llega al comprobar el numero random del objeto Ordenador es true
//			muestra un mensaje conforme es numero par
			if(ordenador1.compruebaParImpar() == true) {
				System.out.println(ordenador1.toString());
				throw new errorPersonalizado(true);
			
//			Si el resultado es false
//			muestra un mensaje conforme es impar
			}else if(ordenador1.compruebaParImpar() == false) {
				System.out.println(ordenador1.toString());
				throw new errorPersonalizado(false);
				
			}
		
		} catch (errorPersonalizado error) {
			System.out.println(error.mensaje());
			
		}

		
	}

}