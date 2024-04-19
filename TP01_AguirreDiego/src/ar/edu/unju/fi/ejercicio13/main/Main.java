package ar.edu.unju.fi.ejercicio13.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] numeros = new int [8];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un número en la posición "+i+" : ");
			int num = scanner.nextInt();
			numeros[i] = num;	
		}
		System.out.println("-------------------------------------------");
		for (int j = 0; j < numeros.length; j++) {
			System.out.println("numero ["+j+"] :"+numeros[j]);
		}
	}

}
