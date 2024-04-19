package ar.edu.unju.fi.ejercicio14;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean band = false;
		int num = 0;
		while (band == false) {
			System.out.println("Ingrese un numero entre [3, 10]: ");

				num = scanner.nextInt();
				if (num <= 10 && num >=3) {
					band = true;
				}
		}
		
		int [] numeros = new int [num];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un número en la posición "+i+" : ");
			int n = scanner.nextInt();
			numeros[i] = n;
		}
		
		System.out.println("-------------------------------------------");
		for (int j = 0; j < numeros.length; j++) {
			System.out.println("numero ["+j+"] :"+numeros[j]);
		}
		
	}

}
