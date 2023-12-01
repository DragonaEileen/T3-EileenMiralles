package ejercicio04;

public class Cilindro {
	
	/* Declaración de Atributos */
	/* Declaramos el radio y la altura del cilindro */
	private double radioBase;
	private double altura;
	
	/* Constructors */
		/* SIN Parámetros */
	public Cilindro() {
		
		/* Les asignamos valores default */
		radioBase = 1;
		altura = 1;
		
	}
	
		/* CON Parámetros */
	public Cilindro(double radioBase, double altura) {
		
		this.radioBase = radioBase;
		this.altura = altura;
		
	}
	
	/* Getters and Setters */
		/* Getters */
	public double getRadioBase() {
		
		return radioBase;
		
	}//Radio Base
	
	public double getAltura() {
		
		return altura;
		
	}//Altura
	
		/* Setters */
	public void setRadioBase(double radioBase) {
		
		this.radioBase = radioBase;
		
	}//Radio Base
	
	public void setAltura(double altura) {
		
		this.altura = altura;
		
	}//Altura
	
	public void setBoth(double radioBase, double altura) {
		
		this.radioBase = radioBase;
		this.altura = altura;
		
	}//Both
	
	/* Methods */
		/* Volumen */
		/* Calculamos y devolvemos el volumen double */
	public double volumen() {
		
		/* Declaración de Variables */
		/* Por claridad del código declaramos una variable doble volumen */
		double volumen;
		
		/* Calculi */
		volumen = Math.PI * Math.pow(radioBase, 2) * altura;
		
		/* Return */
		return volumen;
		
	}//Fin volumen()
	
		/* Area */
		/* Calculamos y devolvemos el area double */
	public double area() {
		
		/* Declaración de Variables */
		/* Por claridad del código declaramos una variable doble area */
		double area;
		
		/* Calculi */
		area = 2 * Math.PI * radioBase * (altura + radioBase);
		
		/* Return */
		return area;
		
	}//Fin area()

}
