package ejercicio07;

import java.util.Scanner;

public class Main {
	
	/** Diseña una función con el siguiente prototipo:
	 * 		boolean esPrimo(int n)
	 * La función debe devolver true si n es primo y false en caso contrario. 
	 * Diseña un método main() que pruebe el funcionamiento de dicha función. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada:	0		| S.Esperada: Reintroduce	| S.Obtenida: Reintroduce
	 * Entrada:	hola	| S.Esperada: Excepción		| S.Obtenida: Excepción
	 * Entrada:	3		| S.Esperada: True			| S.Obtenida: True
	 * Entrada:	4		| S.Esperada: False			| S.Obtenida: True
	 * 		Error: < en vez de <= en el For de la funcion esPrimo()
	 * Entrada:	4		| S.Esperada: False			| S.Obtenida: False
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos la variable introducida N, la cual debe ser entera;
		 * y una variable booleana en la que guardaremos el resultado de la función */
		int inputN = 0;
		boolean res;

		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Syso de Información */
		System.out.println("Vamos a ver si un número es primo.");

		/* Recogida de Datos */
		/* Mediante un do-while aseguramos que el numero es positivo,
		 * y con el uso de un try-catch anidado aseguramos que es un número entero */
		do{
			
			try{
				
				System.out.print("Introduce un número: ");
				inputN = sc.nextInt();
				
			}catch(Exception e){
				
				System.err.println("Dato no válido");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(inputN < 1);

		/* Algoritmo */
		/* Llamamos a la funcion esPrimo() pasandole el numero N, y esta función nos
		 * devolverá un booleano que guardaremos en la variable booleana */
		res = Funciones.esPrimo(inputN);

		/* Syso de Respuesta */
		System.out.println("Es un número primo: " + res);

		/* Cierre de Scanner */
		sc.close();

		
	}//FIN MAIN

}
