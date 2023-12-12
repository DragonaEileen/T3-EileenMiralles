package ejercicio02;

public class Esfera {
	
	/* Declaración de atributos */
	/* Declaramos el atributo radio de la esfera */
	private double radio;
	
	/* Constructores */
		/* SIN Parametros */
	public Esfera() {
		
		radio = 1;
		
	}//Fin SIN
	
		/* CON Parametros */
	public Esfera(double radio) {
		
		this.radio = radio;
		
	}//Fin CON
	
	/* Getters and Setters */
		/* Getter */
	public double getRadio() {
		
		return radio;
		
	}//Fin getRadio()
	
		/* Setter */
	public void setRadio(double radio) {
		
		this.radio = radio;
		
	}//Fin setRadio()
	
	/* Methods */
		/* Superficie */
		/* La superficie de una esfera se calcula con el radio, devolveremos un double */
	public double mathSurface() {
		
		/* Declaración de Variables */
		/* Por claridad del código vamos a declarar una variable surface para devolver */
		double surface;
		
		/* Algorithm */
		surface = 4 * Math.PI * Math.pow(radio, 2);
		
		/* Return */
		return surface;
		
	}// Fin mathSurface()
	
		/* Volumen */
		/* Esta función devuelve el double del volumen calculado a partir del radio */
	public double mathVolume() {
		
		/* Declaración de Variables */
		/* Por claridad del código vamos a declarar una variable volume para devolver */
		double volume;
		
		/* Algoritmo */
		volume = (4 * Math.PI / 3 )* Math.pow(radio, 3);
		
		/* Return */
		return volume;
		
	}// Fin mathVolume()

}
