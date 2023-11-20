package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	/** Realiza un programa que escriba la tabla de multiplicar de un número introducido 
	 * por teclado. Para ello implementa una función que reciba como parámetro un número 
	 * entero y muestre por pantalla la tabla de multiplicar de dicho número. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada:	a		| S.Esperada: True			| S.Obtenida: True
	 * Entrada:	f		| S.Esperada: False			| S.Obtenida: False
	 * Entrada:	3		| S.Esperada: False			| S.Obtenida: False
	 * Entrada:	hola	| S.Esperada: Reintroduce	| S.Obtenida: Reintroduce
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos el numero N a introducir;
		 * y una variable booleana para controlar el try-catch */
		int inputN = 0;
		boolean catchTheseHands = true;

		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Syso de Información */
		System.out.println("Vamos a enseñar la tabla de multiplicar de un numero.");

		/* Recogida de Datos */
		/* Mediante un try-catch nos aseguramos que se introduzca un número entero;
		 * mediante un do while hacemos que se repita. */
		do {
			
			try {
				
				System.out.print("Introduce dicho número: ");
				inputN = sc.nextInt();
				
				catchTheseHands = false;
				
			} catch (InputMismatchException e) {

				System.err.println("Dato no válido");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(catchTheseHands);

		/* Algoritmo */
		/* Llamamos a la función multiplicationTable() */
		Funciones.multiplicationTable(inputN);

		/* Syso de Respuesta */
		/* El syso de respuesta se halla en otra función */

		/* Cierre de Scanner */
		sc.close();

		
	}//FIN MAIN

}
