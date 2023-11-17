package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	/** Diseña la función eco() a la que se le pasa como parámetro de entrada un número n, 
	 * y muestra por pantalla n veces el mensaje “Eco…”. Desde el método main() lee un 
	 * número introducido por el usuario por teclado y pasa este número como parámetro en la 
	 * llamada a la función. **/

	public static void main(String[] args) {
		
		/* Declaración de Variables */
		/* Declaramos la variable n que introducirá el usuario */
		int inputN = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Syso de Información */
		System.out.println("Vamos a printear Eco varias veces, tu eliges el número de veces.");
		
		/* Recogida de Datos */
		/* Mediante un do-while cogemos un número positivo,
		 * y mediante un try-catch dentro del do-while cogemos un número entero */
		do {
			
			try {
				
				System.out.print("Introduce el número de veces: ");
				inputN = sc.nextInt();
				
			} catch (InputMismatchException e) {

				System.err.println("Dato no válido.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(inputN <= 0);
		
		/* Algoritmo */
		/* Llamamos a la función eco(), y le pasamos N. Esta función printeará Eco n veces */
		Eco.eco(inputN);

		/* Syso de Respuesta */
		/* La respuesta se halla en otra clase */

		/* Cierre de Scanner */
		sc.close();
		
	}

}
