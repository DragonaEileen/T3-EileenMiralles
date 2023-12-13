package ejercicio04;

public class FuncionesRecursivas {

	/* Methods */
		/* Sumatorio */
		/* Entrada: int
		 * Salida: int
		 * Funcionalidad: la funcion devolverá la suma de dos numeros: el numero de entrada, y el numero de entrada menos uno,
		 * hasta que el numero de entrada sea 1.*/
	static int sumatorio(int numero) {
		
		/* Declaraciones */
			/* Declaramos una variable resultado, que almacenará el resultado de la suma del numero de entrada y el numero de salida*/
		int resultado;
		
		/* Recursividad */
		if(numero == 1) {	//Caso Base
			
			resultado = 1;
			
		}else {		//Caso Recursivo
			
			resultado =  numero + sumatorio(numero - 1);
			
		}//Fin IF recursivo
		
		/* Return */
		return resultado;
		
	}//Fin sumatorio()
	
		/* Potencia */
		/* Entrada: un double y un entero
		 * Salida: un double
		 * Funcionalidad: esta función devuelve el resultado de el doble elevado al entero. Para ello
		 * usaremos recursividad, siendo el caso más sencillo resultado 1 cuando n sea 0, y la recursividad 
		 * será el doble multiplicado por la recursiva con parametros de3 el doble y el entero menos uno */
	static double potencia(double a, int n) {
		
		/* Declaraciones */
			/* Variable resultado para almacenar el resultado de la multiplicación */
		double resultado;
		
		/* Recursividad */
		if(n == 0) {	//Caso Base
			
			resultado = 1;
			
		}else {
			
			resultado = a * potencia(a, n-1);
			
		}//Fin If recursivo
		
		/* Return */
		return resultado;
		
	}//Fin potencia()
	
		/* Fibonacci */
		/* Entrada: int numero
		 * Salida: int
		 * Funcionalidad: esta función nos devolverá el término correspondiente de la serie de Fibonacci.
		 * El enésimo valor de la serie de Fibonacci se calcula sumando los dos valores anteriores de la serie. */
	static int serieFibonacci(int numero) {
		
		/* Declaraciones */
			/* Variable resultado para almacenar el resultado de la serie */
		int resultado;
		
		/* Recursividad */
		if(numero == 0 ) {	//Caso Base
			
			resultado = 0;
			
		}else if(numero == 1){	//Caso Base
			
			resultado = 1;
			
		}else {	//Caso recursivo
			
			resultado = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
			
		}//Fin recursiva
		
		/* Return */
		return resultado;
		
	}
	
}
