package error;

@SuppressWarnings("serial")
public class errorPersonalizado extends Exception{

//	Atributos
	String palabra;
	
//	Constructores
	public errorPersonalizado(String palabra) {
		this.palabra = palabra;
	}

//	Metodos
	public String mensaje() {
		String error = "";
		
		if (getPalabra().equalsIgnoreCase("volante")) {
			error = "La palabra introducida es la misma: volante.";
			
		}else if (!getPalabra().equalsIgnoreCase("volante")){
			error = "La palabra introducida NO es la misma.";
			
		}
		
		return error;
	}
	
//	Getters y Setters
	public String getPalabra() {
		return palabra;
	}
	public void setNumero(String palabra) {
		this.palabra = palabra;
	}
}