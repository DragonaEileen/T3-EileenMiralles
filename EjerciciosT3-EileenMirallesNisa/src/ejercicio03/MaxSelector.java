package ejercicio03;

public class MaxSelector {

	/* Función para elegir el máximo entre dos numeros */
	static int maxSelector(int A, int B) {
		
		int max = 0;
		
		/* Con un ternario se saca fácil el máximo */
		max = A > B ? A : B;
		
		return max;
		
	}//Fin maxSelector
	
}
