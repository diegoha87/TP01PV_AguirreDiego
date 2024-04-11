package ar.edu.unju.fi.ejercicio7.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("DATOS DEL NUEVO EMPLEADO: ");
			System.out.println("Ingrese el nombre del empleado: ");
			String nombre = scanner.next();
			System.out.println("Ingrese el legajo del empleado: ");
			long legajo = scanner.nextLong();
			System.out.println("Ingrese el salario del empleado: ");
			double salario = scanner.nextDouble();
			
			Empleado empleado = new Empleado(nombre, legajo, salario);
			System.out.println("-------DATOS DEL EMPLEADO----------");
			empleado.mostrarDatos();
			System.out.println("-------AUMENTO----------");
			empleado.darAumento();
			empleado.mostrarDatos();
			
		}
		catch (Exception e) {
			System.out.println("Debe ingresar un valor numerico en legajo y/o salario");
		}
		

	}

}
