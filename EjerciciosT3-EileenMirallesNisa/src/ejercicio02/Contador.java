package ejercicio02;

public class Contador {

	/* La func */
	static void contador(int A, int B) {
		
		/* Declaración de variables */
		/* Directamente con ternarios ponemos la variable más grande y la más pequeña */
		int lesser = A > B ? B : A;
		int greater = A > B ? A : B;
			
		for (int i = lesser; i <= greater; i++) {
			
			System.out.println(i);
			
		}//For
		
	}//Fin contador()
	
}
