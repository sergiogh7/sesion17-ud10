package ordenador;

@SuppressWarnings("serial")
public class errorPersonalizado extends Exception{

//	Atributos
	boolean resultado;
	
//	Constructores
	public errorPersonalizado(boolean resultado) {
		setResultado(resultado);
	}

//	Metodos
	public String mensaje() {
		String error = "";
		
		if (getResultado() == true) {
			error = "El numero es par.";
			
		}else if(getResultado() == false){
			error = "El numero es impar.";
			
		}
		
		return error;
	}

	public boolean getResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	
	

}