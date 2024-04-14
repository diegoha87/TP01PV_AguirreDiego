package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i <= 3) {
				System.out.println("Ingrese un diametro (20, 30 o 40): ");
				int diametro =scanner.nextInt();
		
				if (diametro == 20 || diametro == 30 || diametro == 40) {
						System.out.println("Ingrese si tiene o no ingredientes especiales (true o false): ");
						boolean ingredientesEspeciales = scanner.nextBoolean();
						Pizza pizza = new Pizza();
						pizza.setDiametro(diametro);
						pizza.setIngredientesEspeciales(ingredientesEspeciales);
						pizza.calcularPrecio();
						pizza.calcularArea();
						System.out.println(" ");
						System.out.println("----------------------------");
						System.out.println("** Piza "+i+" **");
						pizza.mostrarDatos();
						System.out.println(" ");
						System.out.println("----------------------------");
						i++;
					
				}
				else
				{
					System.out.println("Debe ingresar 20, 30 o 40 como diametro.");
					i = 1;
					System.out.println(" ");
					System.out.println("----------------------------");
					
				}
			}
			
		}
		
}


