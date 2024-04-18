package ar.edu.unju.fi.ejercicio12.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar fechaNacimiento = Calendar.getInstance();
		int anio;
		int mes;
		int dia;
		System.out.println("Ingrese un nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Fecha de nacimiento: ");
		System.out.println("Ingrese el año: ");
		anio = scanner.nextInt();
		System.out.println("Ingrese el mes: ");
		mes = scanner.nextInt();
		System.out.println("Ingrese el dia: ");
		dia = scanner.nextInt();
		fechaNacimiento.set(anio, mes-1, dia);
		Persona persona1 = new Persona(nombre, fechaNacimiento);
		
		long edad = persona1.calcularEdad();
		String signo = persona1.signoZodiacal();
		String estacion =persona1.estacionAño();
		System.out.println("-----------------------------");
		persona1.mostrarDatos();
		System.out.println("Edad: "+edad);
		System.out.println("Signo: "+signo);
		System.out.println("Estación: "+estacion);
	}

}
