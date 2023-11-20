package ejercicio04;

public class Funciones {
	
	static boolean vocaloid(String character) {
		
		/* Declaración de Variables */
		/* Declaramos una variable booleana para ver si es vocal o no */
		boolean vocal = false;
		
		/* Literally if its equal to "a e i o u" it's true */
		if(character.equalsIgnoreCase("a") || character.equalsIgnoreCase("e") || character.equalsIgnoreCase("i") || character.equalsIgnoreCase("o") || character.equalsIgnoreCase("u")) {
			
			vocal = true;
			
		}//Fin if vocal
		
		return vocal;
		
	}//Fin vocaloid()

}
