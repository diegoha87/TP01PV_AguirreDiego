package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] elementos = new String [5];
		
		for (int i = 0; i < elementos.length; i++) {
			System.out.println("Ingrese un nombre en la posición "+i+" : ");
			String nombre = scanner.next();
			elementos[i] = nombre;
		}
		System.out.println("-------------------------------------------");
		int j = 0;
		while (j < elementos.length) {
			System.out.println("nombre ["+j+"] :"+elementos[j]);
			j++;
		}
		System.out.println("-------------------------------------------");
		System.out.println("Tamaño de arrays: "+elementos.length);
		System.out.println("-------------------------------------------");
		
		byte indice = 0;
		int tamanio = elementos.length-1;
		System.out.println(" ");
		
		boolean band = false;
		
		do {
			System.out.println("Ingrese un valor a eliminar, entre [0, "+ tamanio +"]: ");
			indice = scanner.nextByte();
			if (indice <= tamanio && indice >= 0) {
				band = true;
			}
			else
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("Debe ingresar un valor entre, entre [0, "+ tamanio +"]: ");
				System.out.println("--------------------------------------------------------");
			}	
		}while(band == false);
		
		for (int k = indice; k < elementos.length-1; k++) {
			
				elementos[k] = elementos[k+1];
		}
		
		System.out.println("-------------------------------------------");
		int m = 0;
		while (m < elementos.length-1) {
			System.out.println("nombre ["+m+"] :"+elementos[m]);
			m++;
		}
	}

}
