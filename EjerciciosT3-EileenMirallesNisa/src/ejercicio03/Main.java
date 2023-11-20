package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/** Diseñar una función que recibe como parámetros dos números enteros y devuelve 
	 * el máximo de ambos. Diseña también una función main() que lea los dos números de 
	 * teclado (los pida al usuario) y llame a la función. Desde el método main() se debe 
	 * recoger el valor devuelto por la función en una variable y mostrar el valor de dicha 
	 * variable por pantalla. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada:	hola	| S.Esperada: Excepción		| S.Obtenida: Excepción
	 * Entrada:	-1, 1	| S.Esperada: 1				| S.Obtenida: 1
	 * Entrada:	3, 3	| S.Esperada: Reintroduce	| S.Obtenida: Reintroduce
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos las dos variables de input A y B, y donde guardaremos el máximo */
		int inputA = 0;
		int inputB = 0;
		int max;

		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Syso de Información */
		System.out.println("Vamos a seleccionar el máximo entre dos números A y B.");

		/* Recogida de Datos */
		/* Recogemos A y B mediante un do while para que no sean iguales y un try catch 
		 * para que sean números enteros */
		do {
			
			try {
				
				System.out.print("Introduce número A: ");
				inputA = sc.nextInt();
				
				System.out.print("Introduce número B: ");
				inputB = sc.nextInt();
				
			} catch (InputMismatchException e) {

				System.err.println("Algún dato es no válido.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(inputA == inputB);

		/* Algoritmo */
		/* Llamamos a la función maxSelector para conseguir el mayor número y lo guardamos en 
		 * la variable max */
		max = MaxSelector.maxSelector(inputA, inputB);

		/* Syso de Respuesta */
		System.out.println("El máximo es " + max);

		/* Cierre de Scanner */
		sc.close();

		
	}//FIN MAIN

}
