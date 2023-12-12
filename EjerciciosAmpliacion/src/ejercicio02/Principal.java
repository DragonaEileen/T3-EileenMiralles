package ejercicio02;

import java.util.Scanner;

public class Principal {
	
	/* Pruebas */
	/*	Entrada: 0 		| S. Esperada: Try Again	|S. Obtenida: Try Again
	 * 	Entrada: 10 	| S. Esperada: 1256, 4188	|S. Obtenida: true true
	 *  Entrada: hola	| S. Esperada: Exception	|S. Obtenida: Exception
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Variables */
			/* Declaramos una variable para el dato introducido radio;
			 * luego dos variables para el volumen y la superficie */
		double radio = 0, surface, volume;
		
			/* Objetos */
		Esfera sphere;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Recogida de Datos */
		do{
			
			try{
				
				System.out.print("Introduce el radio: ");
				radio = sc.nextDouble();
				
			}catch(Exception e){
				
				System.err.println("Wrong Data Type. Try Again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(radio <= 0);
		
		/* Algoritmo */
		/* Construimos el objeto sphere */
		sphere = new Esfera(radio);
		
		/* Llamamos a las funciones */
		surface = sphere.mathSurface();
		volume = sphere.mathVolume();
		
		/* Respuesta */
		System.out.println("La superficie es de: " + surface);
		System.out.println("El volumen es de: " + volume);
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
