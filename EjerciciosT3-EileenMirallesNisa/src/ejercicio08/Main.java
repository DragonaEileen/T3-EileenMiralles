package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/** Escribe una función a la que se le pase como parámetro un número entero 
	 * y devuelva el número de divisores primos que tiene. Para ello llama a la 
	 * función que definiste en el ejercicio anterior, esPrimo(), para determinar 
	 * si el divisor es primo o no. Diseña un método main() que pruebe el funcionamiento 
	 * de dicha función. **/
	
	/* Pruebas */
	/* Comienzo Pruebas -->
	 * Entrada:	0		| S.Esperada: Reintroduce	| S.Obtenida: Reintroduce
	 * Entrada:	hola	| S.Esperada: Excepción		| S.Obtenida: Excepción
	 * Entrada:	6		| S.Esperada: 2 3			| S.Obtenida: 
	 * Entrada:	7		| S.Esperada: Primo			| S.Obtenida: 
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos la variable del numero que se va a introducir;
		 * luego la variable booleana de si es primo o no;
		 * y otra variable para modificar N, y otra modificadora de N */
		int inputN = 0;
		boolean res;
		int modN;
		int primeDiv;

		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Syso de Información */
		System.out.println("Vamos a dividir un número en sus múltiplos primos.");

		/* Recogida de Datos */
		/* Usamos en do-while para que el número sea positivo, y un try-catch para que sea 
		 * un numero entero */
		do{
			
			try{
				
				System.out.print("Introduce un número: ");
				inputN = sc.nextInt();
				
			}catch(InputMismatchException e){
				
				System.err.println("Dato no válido.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(inputN < 1);
		
		/* Algoritmo */
		/* Primero llamamos a la función esPrimo(), si es true, entonces no hace falta nada más,
		 * puesto que es solo divisible por si mismo. Si es false, entonces pasamos al bloque
		 * false en el que usaremos la función primeDivider(), que nos pasará un primo. */
		res = ejercicio07.Funciones.esPrimo(inputN);
		
		if(res){
			
			/* Syso de Respuesta True Block */
			System.out.println("El número es primo y solo divisible por si mismo.");
			
		}else{
			
			/* Algoritmo False Block */
			/* La función primeDivider nos pasará un número primo divisor de N, 
			 * por tanto vamos a ir dividiendo el número hasta que se quede en 
			 * un número primo */
			modN = inputN;
			
			while(modN > 1) {
				
				primeDiv = Funciones.primeDivider(modN);
				
				System.out.print(primeDiv + " * ");
				
				res = ejercicio07.Funciones.esPrimo(modN);
				
				if (res) {
					
					System.out.print(modN);
					break;
					
				}else {
					
					modN = modN / primeDiv;
					
				}//Fin IF --> continue
				
				
			}//Fin While --> modN
			
		}//Fin IF --> esPrimo()

		/* Cierre de Scanner */
		sc.close();

		
	}//FIN MAIN

}
