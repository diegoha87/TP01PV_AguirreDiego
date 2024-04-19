package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean band = false;
		int num= 0;
		
		while (band == false) {
			System.out.println("Ingrese un numero entre [5, 10]: ");
			num = scanner.nextInt();
			
			if (num <= 10 && num >= 5) {
				band = true;
			}
		}
		
		String [] cadena = new String[num];
		
		for (int i = 0; i < cadena.length; i++) {
			System.out.println("Ingrese un nombre en la posición "+i+" : ");
			String nombre = scanner.next();
			cadena[i] = nombre;
		}
		System.out.println("-------------------------------------------");
		for (int j = cadena.length - 1; j >= 0 ; j--) {
			System.out.println("nombre ["+j+"] :"+cadena[j]);
		}

	}

}
