
public class OperadoresLogicos {

	public static void main(String[] args) {

		//Declaracion de variables necesarias
		int valor1 = 58;
		int valor2 = 10;
		
		//Operadores Logicos
		boolean mayor = valor1 > valor2;
		boolean mayorIgual = valor1 >= valor2;
		boolean menor = valor1 < valor2;
		boolean menorIgual = valor1 <= valor2;
		boolean igual = valor1 == valor2;
		boolean distinto = valor1 != valor2;
		boolean inverso = !distinto;
		
		//Mostrando por consola los resultados de las operaciones logicas
		System.out.println("¿Es " + valor1 + " mayor que " + valor2 + " ?: " + mayor);
		System.out.println("¿Es " + valor1 + " mayor o igual que " + valor2 + " ?: " + mayorIgual);
		System.out.println("¿Es " + valor1 + " menor que " + valor2 + " ?: " + menor);
		System.out.println("¿Es " + valor1 + " menor o igual que " + valor2 + " ?: " + menorIgual);
		System.out.println("¿Es " + valor1 + " igual a " + valor2 + " ?: " + igual);
		System.out.println("¿Es " + valor1 + " distinto que " + valor2 + " ?: " + distinto);
		System.out.println("¿cual es el inverso de distinto?: " + inverso);
		
	
			
	}

}
