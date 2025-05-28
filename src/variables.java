
public class variables {

	public static void main(String[] args) {

		// Numeros enteros
		byte variableByte = 127;
		short variableShort = 32767;
		int variableInt = 2147483647;
		long variableLong = 9223372036854775807L;
		
		//Numeros reales
		float variableFloat = 350.9999F;
		double variableDouble = 500.1234567890123456D;
		
		//Booleano
		boolean variableBoolean;
		variableBoolean = true;
		
		//Cadenas y caracteres
		String variableString;
		variableString = "Que tal, ¡esta es una prueba de la variable String!";
		char variableChar = 'A';
		
		
		//Las constantes se deben inicializar y asignar valor de una vez, no permite ser modificadas
		final int VALOR_CONSTANTE = 100;
		final String VALOR_CONSTANTE_STRING = "Steven";
		

		System.out.println("Valor de variableByte: " + variableByte);
		System.out.println("Valor de variableShort: " + variableShort);
		System.out.println("Valor de variableInt: " + variableInt);
		System.out.println("Valor de variableLong: " + variableLong);
		System.out.println("Valor de variableFloat: " + variableFloat);
		System.out.println("Valor de variableDouble: " + variableDouble);
		
		System.out.println("Valor de variableBoolean: " + variableBoolean);
		
		System.out.println("Valor de variableString: " + variableString);
		System.out.println("Valor de variableChar: " + variableChar);
		
		System.out.println("Valor de VALOR_CONSTANTE: " + VALOR_CONSTANTE);
		System.out.println("Valor de VALOR_CONSTANTE_STRING: " + VALOR_CONSTANTE_STRING);


	}

}
