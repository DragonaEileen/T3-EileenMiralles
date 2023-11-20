package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/** Crear una función que devuelva un tipo booleano que indique si el carácter que 
	 * se pasa como parámetro de entrada corresponde con una vocal. Diseña un método 
	 * main() que pruebe el funcionamiento de dicha función. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada:	hola	| S.Esperada: Excepción		| S.Obtenida: Excepción
	 * Entrada:	-1, 1	| S.Esperada: 1				| S.Obtenida: 1
	 * Entrada:	3, 3	| S.Esperada: Reintroduce	| S.Obtenida: Reintroduce
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos la variable char que se va a introducir;
		 * y la variable booleana que indicará si es vocal o no, definida por un método */
		String character = "";
		boolean vocal;

		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Syso de Información */
		System.out.println("Vamos a ver si el carácter que introduces es vocal o no.");

		/* Recogida de Datos */
		/* Mediante un bucle do-while miramos que se introduzca un solo carácter */
		do {

				System.out.print("Introduce un carácter: ");
				character = sc.next();
			
		}while(character.length() > 1);

		/* Algoritmo */
		/* Llamamos a la función vocaloid que nos diga si es una vocal el carácter o no. */
		vocal = Funciones.vocaloid(character);

		/* Syso de Respuesta */
		System.out.println("El carácter es una vocal: ");

		/* Cierre de Scanner */
		sc.close();

		
	}//FIN MAIN

}
