import java.util.Scanner;

public class ObjetoScanner {

	public static void main(String[] args) {

		//Crear el objeto Scanner
		Scanner teclado = new Scanner(System.in);
		
		
		//Recibir nombre / String
		System.out.print("Cual es tu nombre: ");
		String nombreUsuario = teclado.nextLine();
		
		System.out.print("Cual es tu edad: ");
		int edad = teclado.nextInt();
		
		System.out.print("Cuanto es tu salario x hora: ");
		float salario = teclado.nextFloat(); 
		
		System.out.print("¿Trabajas los fines de semana?: (true/false) ");
		boolean trabajaFinSemana = teclado.nextBoolean();
		
		System.out.print(
				"Bienvenido " + nombreUsuario + " tu edad es de " + edad + 
				" tu salario es de " + salario + ". ¿Los fines de semana trbajas? " + trabajaFinSemana);
		
		
		
	}

}
