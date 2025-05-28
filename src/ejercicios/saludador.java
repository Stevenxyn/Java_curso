package ejercicios;

import java.util.Scanner;

public class saludador {

	/*
	 * Pide un nombre por teclado y haz que te salude
	 * */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("¿Cual es tu nombre? ");
		String nombreUsuario = teclado.nextLine();
		
		System.out.print("WELCOME TO THE JUNGLE " + nombreUsuario + "!");
		
		
		
	}

}
