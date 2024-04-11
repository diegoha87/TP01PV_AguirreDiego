package ar.edu.unju.fi.ejercicio6;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		System.out.println("Ingrese el DNI: ");
		long dni = scanner.nextLong();
		persona1.setDni(dni);
		System.out.println("Ingrese el Nombre: ");
		String nombre = scanner.next();
		persona1.setNombre(nombre);
		System.out.println("Ingrese la Fecha de Nacimiento (formato: YYYY-MM-DD): ");
		String fechaNac = scanner.next();
		LocalDate fechaNacimiento = LocalDate.parse(fechaNac);
		persona1.setFecha_nac(fechaNacimiento);
		System.out.println("Ingrese la Provincia: ");
		String provincia = scanner.next();
		persona1.setProvincia(provincia);
		System.out.println("-------------------------------------");
		System.out.println("Constructor por Defecto:");
		persona1.mostraDatos();
		
		System.out.println("-------------------------------------");
		System.out.println("Ingrese el DNI: ");
		long dni2 = scanner.nextLong();
		System.out.println("Ingrese el Nombre: ");
		String nombre2 = scanner.next();
		System.out.println("Ingrese la Fecha de Nacimiento (formato: YYYY-MM-DD): ");
		String fechaNac2 = scanner.next();
		LocalDate fechaNacimiento2 = LocalDate.parse(fechaNac2);
		System.out.println("Ingrese la Provincia: ");
		String provincia2 = scanner.next();
		Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
		System.out.println("-------------------------------------");
		System.out.println("Constructor por Parametrizado:");
		persona2.mostraDatos();
		
		System.out.println("-------------------------------------");
		System.out.println("Ingrese el DNI: ");
		long dni3 = scanner.nextLong();
		System.out.println("Ingrese el Nombre: ");
		String nombre3 = scanner.next();
		System.out.println("Ingrese la Fecha de Nacimiento (formato: YYYY-MM-DD): ");
		String fechaNac3 = scanner.next();
		LocalDate fechaNacimiento3 = LocalDate.parse(fechaNac3);
		Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
		System.out.println("-------------------------------------");
		System.out.println("Constructor por Parametrizado Con Nombre de Provincia por Defecto:");
		persona3.mostraDatos();
	}

}
