package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un numero entero: ");
		numero = scanner.nextInt();
		
		
		if (numero % 2 == 0) {
			System.out.println("El numero es: "+numero*3);
		}
		else
		{
			System.out.println("El numero es: "+numero*2);
		}
		
	}

}
