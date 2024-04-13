package ar.edu.unju.fi.ejercicio9.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Producto producto = new Producto();
		try {
			for (int i = 1; i<=3;i++) {
				System.out.println("Ingrese el nombre del producto: ");
				String nombre = scanner.next();
				System.out.println("Ingrese el codigo del producto: ");
				String codigo =scanner.next();
				System.out.println("Ingrese el precio del producto: ");
				double precio =scanner.nextDouble();
				System.out.println("Ingrese el descuento entre el 0% y 50%");
				double descuento =scanner.nextDouble();
				
				if (descuento >= 0 && descuento <= 50) {
					producto.setNombre(nombre);
					producto.setCodigo(codigo);
					producto.setPrecio(precio);
					producto.setDescuento(descuento);
					System.out.println("------------------------------");
					producto.mostrarDatos();
					producto.calcularDescuento();
					System.out.println(" ");
					System.out.println("------------------------------");
				}
				else {
					System.out.println("Debe ingresar un descuento entre el 0% y el 50%.");
					System.out.println(" ");
					System.out.println("------------------------------");
				}
				
			}
		}
		catch (Exception e) {
			System.out.println("Los valores en precio y descuento deben ser numericos.");
			
		}
		
	
	}

}
