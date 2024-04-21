package ar.edu.unju.fi.ejercicio17.main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <Jugador> jugador = new ArrayList<Jugador>();
		int opcion = 0;
		String nombre;
		String apellido;
		String nacionalidad;
		int anio = 0;
		int mes = 0;
		int dia = 0;
		LocalDate fechaNacimiento;
		double estatura = 0;
		double peso = 0;
		int edad = 0;
		String posicion = null;;
		do{
			System.out.println("************************MENÚ******************************");
			System.out.println("1- Agregar jugador.");
			System.out.println("2- Mostrar los datos de jugador.");
			System.out.println("3- Mostrar todos los jugadores ordenados por apellido.");
			System.out.println("4- Modificar los datos de un jugador.");
			System.out.println("5- Eliminar un jugador.");
			System.out.println("6- Mostrar la cantidad de jugadores.");
			System.out.println("7- Mostrar la cantidad de jugadores de una nacionalidad.");
			System.out.println("8- Salir.");
			System.out.println("**********************************************************");
			System.out.println("Ingrese una opción: ");
			opcion = scanner.nextInt();	
			
			switch(opcion) {
			case 1:
				System.out.println("-------Alta de Jugador-----------");
				System.out.println("Ingrese el nombre: ");
				nombre = scanner.next();
				System.out.println("Ingrese el apellido: ");
				apellido = scanner.next();
				System.out.println("Ingrese el nacionalidad: ");
				nacionalidad = scanner.next();
				try {
				System.out.println("--Ingrese la fecha de nacimiento--: ");
				System.out.println("Ingrese el año: ");
				anio = scanner.nextInt();
				
				}
				catch (Exception e1) {
					System.out.println("------------------------------------------------");
					System.out.println("Debe ingresar un valor númerico en el campo año.");
					System.out.println("------------------------------------------------");
				}
				try {
					System.out.println("Ingrese el mes: ");
					mes = scanner.nextInt();
				}
				catch (Exception e2) {
					System.out.println("------------------------------------------------");
					System.out.println("Debe ingresar un valor númerico en el campo mes.");
					System.out.println("------------------------------------------------");
				}
				try {
					System.out.println("Ingrese el dia: ");
					dia = scanner.nextInt();
					
				}
				catch (Exception e3) {
					System.out.println("------------------------------------------------");
					System.out.println("Debe ingresar un valor númerico en el campo dia.");
					System.out.println("------------------------------------------------");
				}
				
				try {
					System.out.println("Ingrese la estatura: ");
					estatura = scanner.nextDouble();
				}
				catch (Exception e3) {
					System.out.println("-----------------------------------------------------");
					System.out.println("Debe ingresar un valor númerico en el campo estatura.");
					System.out.println("-----------------------------------------------------");
				}
				try {
					System.out.println("Ingrese el peso: ");
					peso = scanner.nextDouble();
					
				}
				catch (Exception e3) {
					System.out.println("-----------------------------------------------------");
					System.out.println("Debe ingresar un valor númerico en el campo peso.");
					System.out.println("-----------------------------------------------------");
				}
				try {
					System.out.println("Ingrese la posición: ");
					posicion = scanner.next();		
				}
				catch (Exception e4) {
					System.out.println("-----------------------------------------------------");
					System.out.println("Debe ingresar un valor númerico en el campo posición.");
					System.out.println("-----------------------------------------------------");
				}
				try {
					fechaNacimiento = LocalDate.of(anio, mes, dia);
					Jugador jugador1 = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
					jugador.add(jugador1);
					System.out.println("-----------------------------------------------------");
					System.out.println("El jugador se agrego exitosamente.");
					System.out.println("-----------------------------------------------------");
				}
				catch (Exception e5) {
					System.out.println(" ");
				}
				break;
			case 2:
				if (jugador.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------Datos del Jugador-----------");
					System.out.println("Ingrese el nombre: ");
					nombre = scanner.next();
					System.out.println("Ingrese el apellido: ");
					apellido = scanner.next();
					boolean band = false;
					for (Jugador j: jugador) {
						if (j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
							System.out.println("---------------------------");
							System.out.println("Nombre: "+j.getNombre());
							System.out.println("Apellido: "+j.getApellido());
							System.out.println("Fecha de nacimiento: "+j.getFechaNacimiento());
							edad = j.calcularEdad();
							System.out.println("Edad: "+edad);
							System.out.println("Nacionalidad: "+j.getNacionalidad());
							System.out.println("Estatura: "+j.getEstatura());
							System.out.println("Peso: "+j.getPeso());
							System.out.println("Posición: "+j.getPosicion());
							System.out.println("---------------------------");
							band = true;
						}
					}
					if (band == false) {
						System.out.println("---------------------------");
						System.out.println("El jugador no existe.");
						System.out.println("---------------------------");
					}
				}
				
				break;
			case 3:
				if (jugador.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					jugador.sort(Comparator.comparing(Jugador::getApellido));
					for (Jugador j: jugador) {
							System.out.println("---------------------------");
							System.out.println("Nombre: "+j.getNombre());
							System.out.println("Apellido: "+j.getApellido());
							System.out.println("Fecha de nacimiento: "+j.getFechaNacimiento());
							edad = j.calcularEdad();
							System.out.println("Edad: "+edad);
							System.out.println("Nacionalidad: "+j.getNacionalidad());
							System.out.println("Estatura: "+j.getEstatura());
							System.out.println("Peso: "+j.getPeso());
							System.out.println("Posición: "+j.getPosicion());
							System.out.println("---------------------------");
					}
				}
				
				break;
			case 4:
				if (jugador.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------Modificar Datos del Jugador-----------");
					System.out.println("Ingrese el nombre: ");
					nombre = scanner.next();
					System.out.println("Ingrese el apellido: ");
					apellido = scanner.next();
					boolean band3 = false;
					for (int i = 0;i < jugador.size() && band3 == false;i++) {
						Jugador elementoLista = jugador.get(i);
						if (elementoLista.getNombre().equals(nombre) && elementoLista.getApellido().equals(apellido)) {
							boolean band5 = false;
							Iterator iterator = jugador.iterator();
							while(iterator.hasNext() && band5 == false) {
								Jugador j = (Jugador) iterator.next();
								if (j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
									iterator.remove();
									band5 = true;
								}
							}
							System.out.println("-------------------------------------");
							System.out.println("Ingrese el nombre: ");
							nombre = scanner.next();
							System.out.println("Ingrese el apellido: ");
							apellido = scanner.next();
							System.out.println("Ingrese el nacionalidad: ");
							nacionalidad = scanner.next();
							posicion = elementoLista.getPosicion();
							try {
								System.out.println("--Ingrese la fecha de nacimiento--: ");
								System.out.println("Ingrese el año: ");
								anio = scanner.nextInt();
								
								}
								catch (Exception e1) {
									System.out.println("------------------------------------------------");
									System.out.println("Debe ingresar un valor númerico en el campo año.");
									System.out.println("------------------------------------------------");
								}
								try {
									System.out.println("Ingrese el mes: ");
									mes = scanner.nextInt();
								}
								catch (Exception e2) {
									System.out.println("------------------------------------------------");
									System.out.println("Debe ingresar un valor númerico en el campo mes.");
									System.out.println("------------------------------------------------");
								}
								try {
									System.out.println("Ingrese el dia: ");
									dia = scanner.nextInt();
									
								}
								catch (Exception e3) {
									System.out.println("------------------------------------------------");
									System.out.println("Debe ingresar un valor númerico en el campo dia.");
									System.out.println("------------------------------------------------");
								}
								
								try {
									System.out.println("Ingrese la estatura: ");
									estatura = scanner.nextDouble();
								}
								catch (Exception e3) {
									System.out.println("-----------------------------------------------------");
									System.out.println("Debe ingresar un valor númerico en el campo estatura.");
									System.out.println("-----------------------------------------------------");
								}
								try {
									System.out.println("Ingrese el peso: ");
									peso = scanner.nextDouble();
									
								}
								catch (Exception e3) {
									System.out.println("-----------------------------------------------------");
									System.out.println("Debe ingresar un valor númerico en el campo peso.");
									System.out.println("-----------------------------------------------------");
								}
								try {
									
									System.out.println("Ingrese la posición: ");
									posicion = scanner.next();		
								}
								catch (Exception e4) {
									System.out.println("-----------------------------------------------------");
									System.out.println("Debe ingresar un valor númerico en el campo posición.");
									System.out.println("-----------------------------------------------------");
								}
								try {
									
									fechaNacimiento = LocalDate.of(anio, mes, dia);
									Jugador jugador2 = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
									jugador.add(i, jugador2);
								}
								catch (Exception e5) {
									System.out.println(" ");
								}
							band3 = true;
						}
					}
					
					if (band3 == false) {
						System.out.println("---------------------------");
						System.out.println("El jugador no existe.");
						System.out.println("---------------------------");
					}
					else {
						System.out.println("-----------------------------");
						System.out.println("El jugador ha sido modificado.");
						System.out.println("-----------------------------");

					}
				}
				
				break;
			case 5:
				if (jugador.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------------Eliminar Jugador-----------");
					System.out.println("Ingrese el nombre: ");
					nombre = scanner.next();
					System.out.println("Ingrese el apellido: ");
					apellido = scanner.next();
					boolean band4 = false;
					Iterator iterator = jugador.iterator();
					while(iterator.hasNext() && band4 == false) {
						Jugador j = (Jugador) iterator.next();
						if (j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
							iterator.remove();
							System.out.println("-----------------------------");
							System.out.println("El jugador ha sido eliminado.");
							System.out.println("-----------------------------");
							band4 = true;
						}
					}
					if (band4 == false) {
						System.out.println("---------------------------");
						System.out.println("El jugador no existe.");
						System.out.println("---------------------------");
					}
				}
				
				break;
			case 6:
				System.out.println("---------------------------------------");
				System.out.println("La cantidad de jugadores es: "+jugador.size());
				System.out.println("---------------------------------------");
				break;
			case 7:
				if (jugador.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------Cantidad por Nacionalidad-----------");
					System.out.println("Ingrese la nacionalidad: ");
					nacionalidad = scanner.next();
					int cont = 0;
					boolean band2 = false;
					for (Jugador j: jugador) {
						if (j.getNacionalidad().equals(nacionalidad)) {
							cont = cont + 1;
							band2 = true;
						}
					}
					
					if (band2 == false) {
						System.out.println("--------------------------------------------------");
						System.out.println("No hay jugadores registrados con esa Nacionalidad.");
						System.out.println("--------------------------------------------------");
					}
					else {
						System.out.println("-------------------------------------------------------------------");
						System.out.println("La cantidad de jugadores de nacionalidad "+nacionalidad+" es: "+cont);
						System.out.println("-------------------------------------------------------------------");
					}
				}
				
				break;
			case 8:
				break;
			default:
				System.out.println("**********************************************************");
				System.out.println("Debe ingresar una opción correcta.");
				break;
			}
		}while(opcion != 8);
	}

}
