package ar.edu.unju.fi.ejercicio08.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Ingrese un numero entero: ");
			int numero = scanner.nextInt();
			CalculadoraEspecial calculadora = new CalculadoraEspecial();
			calculadora.setN(numero);
			int sumatoria = calculadora.calcularSumatoria();
			int productoria = calculadora.calcularProductoria();
			
			System.out.println("El calculo de la sumatoria es: "+ sumatoria);
			System.out.println("El calculo de la productoria es: "+ productoria);
		}
		catch (Exception e) {
			System.out.println("Debe ingresar un valor numérico entero.");
		}
		

	}

}
