package ejercicio06;

public class Funciones {

	/* Según la opción (1 o 2), calculará el area o el volumen respectivamente. */
	static void Cylinder(byte option, double height, double radius) {
		
		/* Declaración de variables */
		/* Para más claridad declaramos una variable para el area y otra para el volumen */
		double area;
		double volume;
		
		/* Algoritmo */
		/* Mediante un switch iremos hacia la opcion 1 o 2, y realizaremos el problema 
		 * con cuentas sencillas */
		switch (option) {
		case 1:
			
			area = 2 * Math.PI * radius * (height + radius);
			
			/* Syso de Respuesta */
			System.out.println("El area es de: " + area);
			
			break;
			
		case 2:
			
			volume = Math.PI * Math.pow(radius, 2) * height;
			
			/* Syso de Respuesta */
			System.out.println("El volumen es de: " + volume);
			
			break;
			
		default:
			
			throw new IllegalArgumentException("Unexpected value: " + option);
			
		}//Fin Switch
		
		
	}//Fin Cilinder()
	
}
