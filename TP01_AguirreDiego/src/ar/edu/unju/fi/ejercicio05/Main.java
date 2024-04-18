package ar.edu.unju.fi.ejercicio05;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		try {
			System.out.println("Ingrese un numero del 1 al 9: ");
			numero = scanner.nextInt();
			if (numero <= 9 && numero >= 1) {
				for (int i = 0;i <= 10; i++) {
					System.out.println(i+" x "+numero+" : "+i*numero);
				}
			}
			else
			{
				System.out.println("Debe ingresar un numero del 1 al 9.");
			}
		}
		catch (Exception e) {
			System.out.println("Debe Ingresar un valor numerico.");
		}
		
		
	}

}
