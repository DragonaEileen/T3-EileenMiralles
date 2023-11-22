package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/** Realiza una función que calcule y muestre el área y el volumen de un cilindro, según se especifique. 
	 * Para distinguir un caso de otro se le pasará como opción un número: 1 (para el área) o 2 (para el volumen). 
	 * Además, hay que pasarle a la función el radio de la base y la altura del cilindro.  **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada:	0, 0, 0			| S.Esperada: Reintroduce	| S.Obtenida: Reintroduce
	 * Entrada:	hola, hola, hola| S.Esperada: Excepción		| S.Obtenida: Excepción
	 * Entrada:	1, 10, 10		| S.Esperada: 1256.63706	| S.Obtenida: 86~
	 * 		Error: un + en vez de * en la formula
	 * Entrada:	1, 10, 10		| S.Esperada: 1256.63706	| S.Obtenida: 1256.63706
	 * Entrada:	2, 10, 10		| S.Esperada: 3141.59265	| S.Obtenida: 3141.59265
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {

		/* Declaración de variables */
		/* Declaramos lo que son las variables de input, que van a ser:
		 * La opción, la altura del cilindro, y el radio del cilindro */
		byte option = 0;
		double altura = 0;
		double radio = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Syso de Información */
		System.out.println("Vamos a calcular el volumen de un cilindro, para ello necesitamos su altura y su radio.");
		
		/* Recogida de Datos */
		/* Para la altura y el radio se nos tiene que introducir un número positivo, así que para que sea positivo 
		 * hacemos un do-while, y para asegurarnos que se introduce un número usamos un try-catch.
		 * Para la opción tiene que ser 1 o 2, así que mismo procedimiento pero el do-while se repetirá mientras que no sea 1 o 2 */
		/* Recogida de la opción */
		do {
			
			try {
				
				System.out.print("Para calcular el área introduce 1, y para el volumen introduce 2: ");
				option = sc.nextByte();
				
			} catch (InputMismatchException e) {

				System.err.println("Dato no válido");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(option != 1 && option != 2);
		
		/* Recogida de la altura */
		do {
			
			try {
				
				System.out.print("Introduce la altura: ");
				altura = sc.nextDouble();
				
			} catch (InputMismatchException e) {

				System.err.println("Dato no válido");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(altura <= 0);
		
		/* Recogida del radio */
		do {
			
			try {
				
				System.out.print("Introduce el radio: ");
				radio = sc.nextDouble();
				
			} catch (InputMismatchException e) {

				System.err.println("Dato no válido");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(radio <= 0);
		
		/* Algoritmo */
		/* Vamos a llamar a la funcion cilinder() pasandole la opción, la altura y el radio, y desde esa función se harán
		 * los calculos necesarios */
		Funciones.Cylinder(option, altura, radio);
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
