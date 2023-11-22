package ejercicio08;

public class Funciones {
	
	public static int primeDivider(int N) {
		
		/* Declaración de Variables */
		/* Por claridad del código declaramos la variable que se devuelve */
		int primeDiv = 0;
		
		/* Algoritmo */
		/* Vamos a ir de uno en uno, viendo si el número es divisible, y en caso 
		 * de que lo sea, devolvemos el numero que lo divide.
		 * Este método no va a devolver nunca un número no primo, porque los numeros 
		 * no primos estarán formados por números primos que van antes en las 
		 * iteraciones del for */
		for (int i = 2; i <= Math.sqrt(N); i++) {
			
			if (N % i == 0) {
				
				primeDiv = i;
				break;
				
			}//Fin If --> checking 1 by 1
			
		}//Fin For --> checking 1 by 1
		
		return primeDiv;
		
	}//Fin primeDivider()

}
