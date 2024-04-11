package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int i = 1;
		
		try {
			System.out.println("Ingrese un numero del 0 al 10: ");
			numero = scanner.nextInt();
			
			if(numero <=10 && numero >= 0) {
				while(0 < numero) {
					i = i * numero;
					numero--;
				}
				System.out.println("El factorial del numero es: "+i);
			}
			else {
				System.out.println("Debe ingresar un numero entre 0 y 10.");
			}
			
		}
		catch (Exception e) {
			System.out.println("Debe ingresar un valor numerico.");
		}
		
	}

}
