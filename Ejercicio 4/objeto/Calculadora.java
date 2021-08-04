package objeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
//	Inicia el Scanner
	Scanner teclado = new Scanner(System.in);
	
//	Atributos
	private int num1;
	private int num2;
	
//	Constructor
	public Calculadora () {
		
//		Para terminar de relizar operaciones
		boolean terminarProceso = false;
		
//		Bucle que va comprobando que los datos introducidos son correctos sino salta un mensaje de error.
		do {
			
			try {
				
				System.out.println("Escriba el primer numero");
				this.num1 = teclado.nextInt();
				
				System.out.println("Escriba el segundo numero");
				this.num2 = teclado.nextInt();
				
				// Si no ha introducido algo que no sean numeros el proceso termina aqui.
				terminarProceso = true;
				
			} catch (InputMismatchException e) {
				
				System.out.println("ERROR: Los numeros no son correctos.");
				
//				Evita que el bucle se convierta en un bucle interminable.
				teclado.nextLine();
				
			}
		
		// Termina si los datos son correctos.
		} while (!terminarProceso);
	}

	// Metodos
	public void operaciones() {
		
//		Guarda la opcion elegida por el usuario
		int calcular;
		
//		Para terminar el proceso
		boolean finProceso = true;
		
		do {
			System.out.println("Escoja una opcion:\n1: Sumar."
					+ "\n2: Restar."
					+ "\n3: Multiplicar."
					+ "\n4: Potencia."
					+ "\n5: Raiz cuadrada."
					+ "\n6: Raiz cubica."
					+ "\n7: Dividir.");
			
//			Guarda la opcion en una variable.
			calcular = teclado.nextInt();
			
			try {
				
//				Entra a realizar el proceso llamando a las funciones segun opcion seleccionada.
				switch (calcular) {
				
					case 1:
						System.out.println(sumar());
						break;
						
					case 2:
						System.out.println(restar());
						break;
						
					case 3:
						System.out.println(multiplicar());
						break;
						
					case 4:
						System.out.println(potencia());
						break;
						
					case 5:
						System.out.println("Raiz 1: " + raizCuadrada(getNum1()));
						System.out.println("Raiz 2: " + raizCuadrada(getNum2()));
						break;
						
					case 6:
						System.out.println("Raiz 1: " + raizCubica(getNum1()));
						System.out.println("Raiz 2: " + raizCubica(getNum2()));
						break;
						
					case 7:
						System.out.println(dividir());
						break;
						
					default:
						System.out.println("Numero no valido.");
						
						finProceso = false;
						
				}
				
			} catch (ArithmeticException e){
				System.out.println("Error: " +e.getMessage());
				
			}
			
		} while (!finProceso);
	}
	
//	Metodos
	private int sumar () {
		return getNum1() + getNum2(); 
	}
	private int restar () {
		return getNum1() - getNum2(); 
	}
	private int multiplicar () {
		return getNum1() * getNum2(); 
	}
	private double potencia () {
		return Math.pow(getNum1(), getNum2()); 
	}
	private double raizCuadrada (int num) {
		return Math.sqrt(num);
	}
	private double raizCubica (int num) {
		return Math.cbrt(num);
	}
	private double dividir () {
		return getNum1() / getNum2(); 
	}
	
//	Metodo toString
	public String toString() {
		return "Calculadora: num1: " + num1 + ".\nnum2: " + num2 + ".";
	}
	
	// Getters setters
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}