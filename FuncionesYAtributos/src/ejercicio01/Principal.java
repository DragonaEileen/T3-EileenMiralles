package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Pruebas */
	/*	Entrada: 0 		 | S. Esperada: Bye	|S. Obtenida: Bye and a bunch of other tings
	 * 	Entrada: 1, 1, 1 | S. Esperada: 2	|S. Obtenida: 2
	 * 	Entrada: 2, 1, 1 | S. Esperada: 0	|S. Obtenida: 0
	 * 	Entrada: 5, 1, 2 | S. Esperada: 2	|S. Obtenida: 2
	 *  Entrada: 0		 | S. Esperada: Bye	|S. Obtenida: Bye
	 * */
	
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/* Declaración de Variables */
		/* Declaramos un entero para guardar la opción del menu;
		 * y dos dobles a introducir;
		 * y un doble de resultado */
		int menu;
		double num1 = 0, num2 = 0, res = 0;
		
		/* Algoritmo */
		/* Llamamos al menu */
		menu = menu();
		
		/* Pedimos los dos numeros */
		/* Solo si el menu no es 0 */
		if (menu != 0) {
		
			System.out.print("Num1: ");
			num1 = sc.nextDouble();
			
			System.out.print("Num2: ");
			num2 = sc.nextDouble();
		
		}//Fin IF --> Menu = 0
		
		/* Objeto */
		Operaciones operador = new Operaciones(num1, num2);
		
		/* Switchcase time */
		switch (menu) {
		case 0: 
			
			System.out.println("Bye bye");
			break;
		
		case 1:
			
			res = operador.suma();
			break;
			
		case 2:
			
			res = operador.resta();
			break;
			
		case 3:
			
			res = operador.multiplicacion();
			break;
			
		case 4:
			
			res = operador.division();
			break;
			
		case 5:
			
			res = operador.max();
			break;
			
		case 6:
			
			res = operador.min();
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + menu);
		}
		
		/* If Salir Option then do nothing */
		if(menu != 0) {
			
			/* Resultado */
			System.out.println("El resultado es: " + res);
			
		}//Fin break salir
		
		
		/* Cierre de Scanner */
		sc.close();
	
	}//FIN MAIN

	/* Métodos */
		/* Menú */
		/* Presenta una serie de opciones a elegir y devuelve el número de la opción elegida */
	public static int menu() {
		
		/* Declaración de variables */
		/* Declaramos el entero a devolver */
		double menu = -1;
		
		/* Mostramos el Menú */
		System.out.println("1. Suma\r\n"
				+ "2. Resta\r\n"
				+ "3. Multiplicación\r\n"
				+ "4. División\r\n"
				+ "5. Máximo\r\n"
				+ "6. Mínimo\r\n"
				+ "0. Salir");
		
		/* Leemos el entero */
		while (menu > 6 || menu < 0) {
			System.out.print("Introduce la opción: ");
			menu = pideNumero();
		}//Fin While
		
		/* Devolvemos el número */
		return (int) menu;
		
	}//Fin menu()
	
		/* Pide Número */
		/* Básicamente se lee y se devuelve un número */
	public static double pideNumero() {
		
		/* Declaración de Variables */
		/* Declaramos un número doble que vamos a leer y devolver */
		double num = 0;
		
		/* Leemos el dato */
			try{
				
				num = sc.nextDouble();
				
			}catch(InputMismatchException e){
				
				System.err.println("Dato erroneo, finalizando programa");
				
			}//Fin Try-Catch
			
			/* Devolvemos el dato */
			return num;
		
	}
	
}
