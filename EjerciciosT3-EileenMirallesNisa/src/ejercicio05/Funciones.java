package ejercicio05;

public class Funciones {

	/* Pretty straightforward, literally from numbers 1 to 10 it multiplies N with them thorugh a FOR loop */
	static void multiplicationTable(int N) {
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(N + " * " + i + " = " + N*i);
			
		}//Fin FOR
		
	}//Fin multiplicationTable()
	
}
