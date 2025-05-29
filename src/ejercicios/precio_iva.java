package ejercicios;

import java.util.Scanner;

public class precio_iva {

	/*
	 * Pide el precio de un producto sin IVA y calcula su precio con IVA
	 * Al precio limitalo para que muestre dos decimales
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final double IVA = 0.21;
		
		System.out.print("Ingresa el precio del producto: ");
		double producto = teclado.nextDouble();
		
		double asignandoIva = (producto * IVA) + producto;
		
		System.out.printf("El precio del producto con IVA es de: %.2f" , asignandoIva);
		System.out.println(" ");
		System.out.println("El precio del IVA agregado fue de: " + (asignandoIva - producto));
		
		
		
	}

}
