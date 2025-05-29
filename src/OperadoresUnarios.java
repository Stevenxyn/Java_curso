
public class OperadoresUnarios {

	public static void main(String[] args) {
		int operando1 = 5;

		// El valor no se actualiza hasta la siguiente linea
		System.out.println("Sufijo ++: " + (operando1++));
		System.out.println("Valor: " +  operando1);
		
		// El valor no se actualiza hasta la siguiente linea
		System.out.println("Sufijo --: " + (operando1--));
		System.out.println("Valor: " +  operando1);
		
		// El valor  se actualiza antes de la siguiente linea
		System.out.println("Prefijo ++: " + (++operando1));
		System.out.println("Valor: " +  operando1);
		
		// El valor  se actualiza antes de la siguiente linea
		System.out.println("Prefijo --: " + (--operando1));
		System.out.println("Valor: " +  operando1);
		
	}

}
