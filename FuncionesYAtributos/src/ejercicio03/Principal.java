package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Pruebas */
	/* 	Entrada: 1, 0 		| S. Esperada: Bye			|S. Obtenida: Bye
	 * 	Entrada: 1, 1		| S. Esperada: 2*PI			|S. Obtenida: 2*PI
	 *  Entrada: 1, 2		| S. Esperada: PI			|S. Obtenida: PI
	 *  Entrada: hola, hola	| S. Esperada: Exceptions	|S. Obtenida: Exceptions
	 * */
	
	/* Apertura de Scanner Estático */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/* Declaraciónes */
			/* Variables */
			/* Declaramos un entero donde guardar la opción del menu;
			 * Luego declaramos una variable doble para guardar el radio; */
		int menu;
		double radio;
		
			/* Objetos */
			/* Creamos un objeto de clase Circulo */
		Circulo circle;
		
		/* Algoritmo */
		/* Primero pedimos, como dice en el enunciado, el radio */
		radio = pideRadio();
		
		/* Segundo, mostramos el menú y guardamos la opción elegida */
		menu = menu();
		
		/* Tercero rellenamos el objeto */
		circle = new Circulo(radio);
		
		/* Cuarto, llamamos al método de cálculo según la opción */
		switch(menu) {
		
		case 0:		//Opción Salir
			
			System.out.println("Bye Bye.");
			break;
			
		case 1:		//Opción Circunferencia
			
			System.out.println("La circunferencia es: " + circle.circunferencia());
			break;
			
		case 2:
			
			System.out.println("El area es: " + circle.area());
			break;
			
		default:
			
			System.err.println("Unexpected value found " + menu);
			break;
		
		};
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN
	
	
	/* Methods */
		/* Menu */
		/* Shows a Menu with options and asks for an option that it returns */
	public static int menu() {
		
		/* Declaración de Variables */
		/* Declaramos un entero menu, donde guardaremos la opción elegida */
		int menu = -1;
		
		/* Menu Print */
		System.out.println("1. Circunferencia\r\n"
				+ "2. Área\r\n"
				+ "0. Salir\r\n");
		
		/* Recogida de Datos */
		/* With the use of a Do-Try we ensure it's a number and an integer between 0 and 2 */
		do{
			
			try{
				
				System.out.print("Introduce la opción: ");
				menu = sc.nextInt();
				
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong data type. Try again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(menu < 0 || menu > 2);
		
		/* Return */
		return menu;
		
	}//Fin menu()
	
		/* Radio */
		/* This method asks for a valid radius, a double larger than 0, and returns it */
	public static double pideRadio() {
		
		/* Declaración de Variables */
		/* Declaramos la variable radio donde se introducirá su valor */
		double radio = 0;
		
		/* Recogida de Datos */
		/* With a Do-Try we ensure the number is positive and is indeed a number */
		do{
			
			try{
				
				System.out.print("Introduce el radio: ");
				radio = sc.nextDouble();
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong data type. Try again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while(radio <= 0);
		
		/* Return */
		return radio;
		
	}

}
