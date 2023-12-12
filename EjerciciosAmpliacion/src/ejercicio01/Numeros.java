package ejercicio01;

public class Numeros {

	/* Declaración de Atributos */
	/* Declaramos la variable número donde guardaremos el número */
	private int numero;
	
	
	/* Constructores */
		/* SIN Parametros */
	public Numeros() {
		
		numero = 1;
		
	}//Fin SIN
	
		/* CON Parametros */
	public Numeros(int numero) {
		
		this.numero = numero;
		
	}//Fin CON
	
	/* Getters and Setters */
		/* Getters */
	public int getNumero() {
		
		return numero;
		
	}//Fin getNumero()
	
		/* Setters */
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}//Fin setNumero()
	
	/* Methods */
		/* Primo */
		/* Creamos un método que devuelva un booleano true si el numero es primo y false
		 * en el caso contrario */
	public boolean esPrimo() {
		
		/* Declaración de Variables */
		/* Declaramos una variable booleana para devolver por claridad del código */
		boolean prime = true;
		
		/* Algoritmo */
		/* Para averiguar si el número es primo vamos a ver si es divisible por 
		 * todos los números desde el 2 hasta la raiz cuadrada del numero con un loop for */
		for(int i = 2; i <= Math.sqrt(numero); i++) {
			
			if (numero % i == 0) {	//Comprobación de divisibilidad
				
				prime = false;
				break;
				
			}//Fin IF Prime Check
			
		}//Fin For Prime Check
		
		/* Return */
		return prime;
		
	}//Fin esPrimo()
	
		/* Capicúa */
		/* Vamos a ver si el número es palindromo. Si lo es, esta función devolverá true, 
		 * si no, devolverá false. */
	public boolean esCapicua() {
		
		/* Declaración de Variables */
		/* Declaramos una variable booleana a devolver por claridad del código;
		 * una variable para modificar el número;
		 * una variable para guardar el número invertido;
		 * y una última auxiliar para guardar un número que mover. */
		boolean capicua = true;
		int modNum = numero;
		int reversed = 0;
		int aux = 0;
		
		
		/* Algoritmo */
		/* Para esta función vamos a modificar la variable modNum, y vamos a ir 
		 * quitandole números de la derecha para stackearlos en reversed, hasta 
		 * que modNum se quede sin numeros */
		while(modNum >= 1) {
			
			aux = modNum % 10;
			reversed = reversed*10 + aux;
			modNum = modNum / 10;
			
		}//Fin WHILE
		
		
		/* Ahora comprobamos si los dos numeros son iguales con un if */
		if (numero != reversed) {
			
			capicua = false;
			
		}//Fin IF capicua Check
		
		/* Return */
		return capicua;
		
	}//Fin esCapicua()
	
}
