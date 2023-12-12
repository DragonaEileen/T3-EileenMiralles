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

}
