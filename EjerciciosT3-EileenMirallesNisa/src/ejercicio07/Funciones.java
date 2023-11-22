package ejercicio07;

public class Funciones {
	
	/* Creamos una función que devuelva true si un número pasado es primo o false si es not */
	static boolean esPrimo(int N) {
		
		/* Declaración de Variables */
		/* Por claridad del code definimos una variable booleana para devolver */
		boolean res = true;
		
		/* Algoritmo */
		/* Como en ejercicios anteriores, vamos a ver si el numero es divisible 
		 * por cualquier otro número entre 2 y la raiz cuadrada de si mismo mediante
		 * un loop for */
		for(int i = 2; i <= Math.sqrt(N); i++) {
			
			if(N % i == 0){
				
				res = false;
				break;
				
			}//Fin If --> Prime Check
			
		}//Fin For --> Prime Check
		
		return res;
		
	}//Fin esPrimo()

}
