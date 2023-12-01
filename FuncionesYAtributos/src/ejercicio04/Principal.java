package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Pruebas */
	/* 	Entrada: 1, 1, 0			| S. Esperada: Bye			|S. Obtenida: Bye
	 * 	Entrada: 1, 1, 1			| S. Esperada: PI			|S. Obtenida: PI
	 *  Entrada: 1, 1, 2			| S. Esperada: 4*PI			|S. Obtenida: 4*PI
	 *  Entrada: hola, hola, hola	| S. Esperada: Exceptions	|S. Obtenida: Exceptions
	 * */
	
	/* Apertura de Scanner Estático */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		/* Declaraciónes */
			/* Variables */
			/* Declaramos una variable entera para guardar la opción del menu;
			 * Declaramos dos variables para guardar el radio y la altura; */
		int menu;
		double radioBase, altura;
		
			/* Objetos */
			/* Declaramos un objeto de clase cilindro */
		Cilindro cylinder;
		
		/* Algoritmo */
		/* Según el enunciado, primero pedimos la altura y el radio */
		radioBase = pideRadioBase();
		altura = pideAltura();
		
		/* Segundo, llamamos al menu() */
		menu = menu();
		
		/* Tercero, construimos el objeto con los datos obtenidos */
		cylinder = new Cilindro(radioBase, altura);
		
		/* Cuarto y último, llamamos a la función de cálculo según la opción elegida 
		 * en el menu */
		switch(menu) {
		
		case 0:		//Opción Salir
			
			System.out.println("Bye Bye");
			break;
			
		case 1:		//Opción Volumen
			
			System.out.println("El volumen del cilindro es de " + cylinder.volumen());
			break;
			
		case 2:		//Opción Área
			
			System.out.println("El area del cilindro es de " + cylinder.area());
			break;
			
		default:
				
			System.err.println("Unexpected value found: " + menu);
			break;
			
		};
		
	}//FIN MAIN

	/* Methods */
		/* Menu */
		/* Muestra el menu y pregunta por una opción entera */
	public static int menu() {
		
		/* Declaración de Variables */
		/* Por claridad del código se declara una variable menu, que se devolverá */
		int menu = -1;
		
		/* Muestra del Menu */
		System.out.println("1. Volumen\r\n"
				+ "2. Área\r\n"
				+ "0. Salir\r\n");
		
		/* Recogida de Datos */
		/* Mediante un Do-Try, nos aseguramos que sea un tipo de dato válido y que
		 * este entre 0 y 2 */
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
		
	}
	
		/* Radio Base */
		/* Se pide un número doble y se devuelve */
	public static double pideRadioBase() {
		
		/* Declaración de Variables */
		/* Declaramos la variable doble que se devolverá */
		double radioBase = 0;
		
		/* Recogida de Datos */
		/* Se pide un número y nos aseguramos que s3e introduce un número y además un
		 * número positivo mediante un do-try */
		do{
			
			try{
				
				System.out.print("Introduce un radio de la base: ");
				radioBase = sc.nextDouble();
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong data type. Try again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while( radioBase <= 0 );
		
		/* Return */
		return radioBase;
		
	}//Fin pideRadioBase()
	
		/* Altura */
		/* Se pide un número doble y se devuelve */
	public static double pideAltura() {
		
		/* Declaración de Variables */
		/* Declaramos la variable doble que se devolverá */
		double altura = 0;
		
		/* Recogida de Datos */
		/* Se pide un número y nos aseguramos que s3e introduce un número y además un
		 * número positivo mediante un do-try */
		do{
			
			try{
				
				System.out.print("Introduce una altura: ");
				altura = sc.nextDouble();
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong data type. Try again.");
				sc.nextLine();
				
			}//Fin Try-Catch
			
		}while( altura <= 0 );
		
		/* Return */
		return altura;
		
	}//Fin pideAltura()
	
}
