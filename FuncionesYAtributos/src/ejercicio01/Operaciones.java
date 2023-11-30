package ejercicio01;

public class Operaciones {

	/* Declaración de Atributos */
	/* Declaramos los numeros con los que vamos a operar */
	private double num1;
	private double num2;
	
	/* Constructores */
		/* Sin parametros */
	public Operaciones() {
		
		/* Inicializamos Atributos */
		num1 = 0;
		num2 = 0;
		
	}
	
		/* Con parametros */
	public Operaciones(double num1, double num2) {
		
		/* Asignamos las variables a los atributos */
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	/* Getters and Setters */
		/* Getters */
			/* Get num1 */
	public double getNum1() {
		
		return num1;
		
	}
	
			/* Get num2 */
	public double getNum2() {
		
		return num2;
		
	}
	
		/* Setters */
			/* Set num1 */
	public void setNum1(double num1) {
		
		this.num1 = num1;
		
	}
	
			/* Set num2 */
	public void setNum2(double num2) {
		
		this.num2 = num2;
		
	}
	
			/* Set Both */
	public void setNums(double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	/* Methods */
		/* Operaciones */
			/* Suma */
	public double suma() {
		
		return num1 + num2;
		
	}
	
			/* Resta */
	public double resta() {
		
		return num1 - num2;
		
	}
	
			/* Múltiplo */
	public double multiplicacion() {
		
		return num1 * num2;
		
	}
	
			/* División */
	public double division() {
		
		/* Lets do a TryCatch to avoid arithmetic exceptions */
		/* First we declare a result value and then we proceed with the arithmetics */
		double res;
		
		try {
			
			res = num1 / num2;
			
		}catch(ArithmeticException e) {
			
			res = 0;
			
		}//Fin Try-catch
		
		return res;
		
	}
	
			/* Máximo */
	public double max() {
		
		return num1 >= num2 ? num1 : num2;
		
	}
	
			/* Mínimo */
	public double min() {
		
		return num1 >= num2 ? num2 : num1;
		
	}
	
}

