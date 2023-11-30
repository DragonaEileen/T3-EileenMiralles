package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Pruebas */
	/* 	Entrada: 1, 1, 1 		 | S. Esperada: 4			|S. Obtenida: 4
	 * 	Entrada: 1, 1, 2		 | S. Esperada: 1			|S. Obtenida: 1
	 *  Entrada: hola, hola, hola| S. Esperada: Exceptions	|S. Obtenida: Exceptions
	 * */
	
	/* Apertura de Scanner Estático */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/* Declaraciones */
			/* Variables */
			/* Declaramos un entero para guardar la opción del menu;
			 * Y declaramos dos dobles para guardar el ancho y el alto */
		int menu;
		double alto, ancho;
		
			/* Objetos */
			/* Declaramos el Objeto de clase Rectangulo */
		Rectangulo rectangle;
		
		/* Algoritmo */
		/* Primero pedimos el ancho y el alto */
		ancho = pideAncho();
		alto = pideAlto();
		
		/* Luego mostramos el menu y pedimos la opción */
		menu = menu();
		
		/* Ahora Construimos con el ancho y el alto el rectangulo */
		rectangle = new Rectangulo(alto, ancho);
		
		/* Según la opción llamamos a una función u otra */
		switch (menu) {
		case 1: 
			
			System.out.println("El perímetro es " + rectangle.perimetro());
			break;
			
		case 2:
			
			System.out.println("El area es " + rectangle.area());
			break;
			
		case 0:
			
			System.out.println("Bye Bye");
			break;
			
		default:
			
			throw new IllegalArgumentException("Unexpected value: " + menu);
			
		}//Fin Switch --> Options
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN
	
	/* Métodos */
		/* Menú */
		/* Mostrará las opciones y pedirá un numero entero que devolverá */
	public static int menu() {
		
		/* Declaración de Variables */
		int menu = -1;
		
		/* Presentación de Opciones */
		System.out.println("1. Perímetro\r\n"
				+ "2. Área\r\n"
				+ "0. Salir\r\n");
		
		/* Leemos el dato a introducir, un dato entero entre 0 y 2 */
		do{
			
			try{
				
				System.out.print("Introduce la Opción: ");
				menu = sc.nextInt();
				
			}catch(InputMismatchException e){
				
				System.err.println("Dato no válido.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(menu > 2 || menu < 0);
		
		/* Devolvemos Variable */
		return menu;
		
	}//Fin menu() method
	
		/* Ancho */
		/* Pide que se introduzca el ancho (double), comprueba que es correcto, y lo devuelve */
	public static double pideAncho() {
		
		/* Declaración de Variables */
		/* Declaramos el Ancho como un Doble */
		double ancho = 0;
		
		/* Recogida de Datos */
		/* Con un Do-Try nos aseguramos que es un número y mayor que 0 */
		do{
			
			try{
				
				System.out.print("Introduce el Ancho: ");
				ancho = sc.nextDouble();
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong Data. Try Again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(ancho <= 0);
		
		/* Return */
		return ancho;
		
	}//Fin pideAncho()
	
		/* Altura */
		/* Pedimos la altura, lo comprobamos, y lo devolvemos */
	public static double pideAlto() {
		
		/* Declaración de Variables */
		/* Declaramos un doblem Alto */
		double alto = 0;
		
		/* Recogida de Datos */
		/* Para comprobar que es un número y es mayor a 0, usamos un Do-Try */
		do{
			
			try{
				
				System.out.print("Introduce la altura: ");
				alto = sc.nextDouble();
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong data type. Try Again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(alto <= 0);
		
		/* Return */
		return alto;

	}//Fin pideAlto()
	
}
