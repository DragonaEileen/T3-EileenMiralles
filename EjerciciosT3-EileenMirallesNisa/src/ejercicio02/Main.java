package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	/** Escribe una función a la que se le pasen dos enteros y muestre todos 
	 * los números comprendidos entre ellos. Desde el método main() lee los dos 
	 * números enteros, los cuales deben introducirlos el usuario, y pásalos como 
	 * parámetros de entrada de la función. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada:	hola	| S.Esperada: Excepción	| S.Obtenida: Excepción
	 * Entrada:	-1, 1	| S.Esperada: -1, 0, 1	| S.Obtenida: -1, 0, 1
	 * Entrada:	20, 10	| S.Esperada: 10 al 20	| S.Obtenida: 10 qal 20
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {
		
		/* Declaración de Variables */
		/* Declaramos las variables que se van a introducir, A y B */
		int inputA = 0;
		int inputB = 0;

		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Syso de Información */
		System.out.println("Vamos a contar de un número A hasta un número B.");

		/* Recogida de Datos */
		/* inputA e inputB mediante un do-while para que se repita hasta que 
		 * los números no sean iguales y try-catch para que se introduzcan números enteros*/
		do {
			
			try {
				
				System.out.print("Introduce número A: ");
				inputA = sc.nextInt();
				
				System.out.print("Introduce número B: ");
				inputB = sc.nextInt();
				
			}catch(InputMismatchException e) {
				
				System.err.println("Algún dato es no válido.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(inputA == inputB);

		/* Algoritmo */
		/* Llamamos a la función contador(), pasandole los inputs A y B*/
		Contador.contador(inputA, inputB);

		/* Syso de Respuesta */
		/* Tu syso se halla en otra funcion */

		/* Cierre de Scanner */
		sc.close();

		
	}//FIN MAIN
	
}
