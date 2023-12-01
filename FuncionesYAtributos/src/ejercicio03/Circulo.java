package ejercicio03;

public class Circulo {
	
	/* Declaración de Atributos */
	/* Declaramos el atributo que será el radio de la circunferencia */
	private double radio;
	
	/* Constructores */
		/* SIN Parámetros */
	public Circulo() {
		
		/* Ponemos un valor default de 1 */
		radio = 1;
		
	}
	
		/* CON Parametros */
	public Circulo(double radio) {
		
		this.radio = radio;
		
	}
	
	/* Getters and Setters */
		/* Getters */
	public double getRadio() {
		
		return radio;
		
	}

		/* Setters */
	public void setRadio(double radio) {
		
		this.radio = radio;
		
	}
	
	/* Methods */
		/* Circunferencia */
		/* Calculamos y devolvemos la circunferencia a partir del radio */
	public double circunferencia() {
		
		/* Declaración de Variables */
		/* Declaramos una variable circunferencia por claridad del codigo */
		double circunferencia;
		
		/* Calculi */
		circunferencia = 2 * Math.PI * radio;
		
		/* Return */
		return circunferencia;
		
	}//Fin circunferencia
	
			/* Area */
			/* Calculamos y devolvemos el doble area */
	public double area() {
		
		/* Declaración de Variables */
		/* Declaramos una variable area por claridad del codigo */
		double area;
		
		/* Calculi */
		area = Math.PI * Math.pow(radio, 2);
		
		/* Return */
		return area;
		
	}//Fin area()
	
}
