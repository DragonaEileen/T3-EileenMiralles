package ejercicio02;

public class Rectangulo {

	/* Declaración de Atributos */
	/* Declaramos el ancho y el alto del rectangulo, van a ser dobles para soportar decimales */
	private double alto;
	private double ancho;
	
	/* Constructores */
		/* Constructor vacío, con default values de 10 */
	public Rectangulo() {
		
		alto = 10;
		ancho = 10; 
		
	}//Fin Constructor Vacío
	
		/* Constructor con parámetros, alto y ancho serán igual a los parámetros introducidos */
	public Rectangulo(double alto, double ancho) {
		
		this.alto = alto;
		this.ancho = ancho;
		
	}
	
	/* Getters and Setters */
		/* Getters */
	public double getAlto() {
		
		return alto;
		
	}
	
	public double getAncho() {
		
		return ancho;
		
	}
	
		/* Setters */
	public void setAlto(int alto) {
		
		this.alto = alto;
		
	}
	
	public void setAncho(int ancho) {
		
		this.ancho = ancho;
		
	}
	
	/* Methods */
		/* Perímetro */
		/* Devolvemos la suma de dos anchos y dos altos */
	public double perimetro() {
		
		/* Declaración de Variables */
		/* Let's declare a double that keeps the perimeter for the code's ease */
		double perimetro = 0;
		
		/* Calculi */
		perimetro = (ancho*2) + (alto*2);
	 	
		/* Return */
		return perimetro;
		
	}//Fin perimetro()
	
		/* Area */
		/* Devolvemos el ancho por la altura */
	public double area() {
		
		/* Declaración de Variables */
		/* Declaramos una variable area por claridad del código */
		double area = 0;
		
		/* Calculi */
		area = ancho * alto;
		
		/* Return */
		return area;
		
	}
	
}
