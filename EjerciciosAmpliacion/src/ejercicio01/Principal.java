package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Pruebas */
	/*	Entrada: 0 		| S. Esperada: Try Again	|S. Obtenida: Try Again
	 * 	Entrada: 11 	| S. Esperada: true, true	|S. Obtenida: true true
	 * 	Entrada: 97		| S. Esperada: true, false	|S. Obtenida: true false
	 * 	Entrada: 22		| S. Esperada: false, true	|S. Obtenida: false true
	 *  Entrada: 14		| S. Esperada: false, false	|S. Obtenida: false false
	 *  Entrada: hola	| S. Esperada: Exception	|S. Obtenida: Exception
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Variables */
			/* Declaramos el número que vamos recoger;
			 * y los dos booleanos de las funciones. */
			int numero = 0;
			boolean prime;
			boolean capicua;
			
			/* Objetos */
			/* Declaramos un objeto Numeros */
			Numeros num;

		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Recogida de Datos */
		/* Recogemos un número */
		do{
			
			try{
				
				System.out.print("Introduce un número entero positivo: ");
				numero = sc.nextInt();
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong Data Type. Try Again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(numero < 1);

		/* Algoritmo */
		/* Construimos el objeto Numeros */
		num = new Numeros(numero);
		
		/* Ahora llamamos a las funciones */
		prime = num.esPrimo();
		capicua = num.esCapicua();

		/* Syso de Respuesta */
		System.out.println("El numero es primo: " + prime);
		System.out.println("El número es capicua: " + capicua);

		/* Cierre de Scanner */
		sc.close();

		
	}//FIN MAIN

}
