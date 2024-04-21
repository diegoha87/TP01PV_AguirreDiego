package ar.edu.unju.fi.ejercicio18.main;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <DestinoTuristico> destinoTuristico = new ArrayList <DestinoTuristico>();
		List <Pais> pais = new ArrayList <Pais>();
		Pais pais1 = new Pais("C1765", "Colombia");
		Pais pais2 = new Pais("E4276", "España");
		Pais pais3 = new Pais("J8027", "Japón");
		pais.add(pais1);
		pais.add(pais2);
		pais.add(pais3);
		int opcion = 0;
		String codigo;
		String nombre;
		double precio = 0;
		String codigoPais;
		int cantidadDias = 0;
		Pais paisNuevo = new Pais();
		
		do {
			System.out.println("************************MENÚ******************************");
			System.out.println("1- Agregar destino turistico.");
			System.out.println("2- Mostrar todos los destinos turisticos.");
			System.out.println("3- Modificar el país de un destino turístico.");
			System.out.println("4- Limpiar destinos turísticos.");
			System.out.println("5- Eliminar un destino turístico.");
			System.out.println("6- Mostrar los destinos turísticos ordenados por nombre.");
			System.out.println("7- Mostrar todos los paises.");
			System.out.println("8- Mostrar los destinos turísticos que pertenecen a un país.");
			System.out.println("9- Salir.");
			System.out.println("**********************************************************");
			System.out.println("Ingrese una opción: ");
			opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("-------Alta de Destino Turistico-----------");
				System.out.println("Ingrese el código: ");
				codigo = scanner.next();
				System.out.println("Ingrese el nombre: ");
				nombre = scanner.next();
				try {
					System.out.println("Ingrese el precio: ");
					precio = scanner.nextDouble();
					boolean band = false;
					do {
						System.out.println("Ingrese el codigo del país de destino: ");
						codigoPais = scanner.next();
						
						for (int i = 0;i <pais.size() && band == false;i++) {
							Pais elementoLista = pais.get(i);
							if (elementoLista.getCodigo().equals(codigoPais)) {
								paisNuevo = elementoLista;
								band = true;
							}
						}
						if (band == false) {
							System.out.println("------------------------------------------------");
							System.out.println("Debe ingresar un código de pais valido.");
							System.out.println("------------------------------------------------");
						}
						
					}while(band == false);
				}
				catch(Exception e1) {
					System.out.println("Debe ingresar un valor númerico.");
				}
				
				
				try {
					System.out.println("Ingrese la cantidad de dias: ");
					cantidadDias = scanner.nextInt();
				}
				catch(Exception e2) {
					System.out.println("Debe ingresar un valor númerico.");
				}
				
				try {
					DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, paisNuevo, cantidadDias);
					destinoTuristico.add(destino);
					System.out.println("--------------------------------------------");
					System.out.println("Se agrego exitosamente el destino turistico.");
					System.out.println("--------------------------------------------");
				}
				catch (Exception e3) {
					System.out.println("--------------------------------------------------");
					System.out.println("No agrego el destino turistico. Intentelo de nuevo");
					System.out.println("--------------------------------------------------");
				}
				break;
			case 2:
				if (destinoTuristico.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------Destinos Turisticos-----------");
					for (DestinoTuristico d: destinoTuristico ) {
						System.out.println("-------------"+d.getPais().getNombrePais()+"--------------");
						System.out.println("Codigo: "+d.getCodigo());
						System.out.println("Nombre: "+d.getNombre());
						System.out.println("Precio: "+d.getPrecio());
						d.getPais().mostrarPais();
						System.out.println("Cantidad de días: "+d.getCantidadDias());
						System.out.println("---------------------------");
					}
				}
				
				break;
			case 3:
				if (destinoTuristico.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------Modificar país de destino turistico-----------");
					System.out.println("Ingrese el código del destino turistico: ");
					codigo = scanner.next();
					boolean band2 = false;
					for (int i = 0;i < destinoTuristico.size() && band2 == false;i++) {
						DestinoTuristico elementoLista = destinoTuristico.get(i);
						if (elementoLista.getCodigo().equals(codigo)) {
						band2 = true;
						boolean band3 = false;
						codigo = elementoLista.getCodigo();
						boolean band6 = false;
						Iterator iterator = destinoTuristico.iterator();
						while(iterator.hasNext() && band6 == false) {
							DestinoTuristico j = (DestinoTuristico) iterator.next();
							if (j.getCodigo().equals(codigo)) {
								iterator.remove();
								band6 = true;
							}
						}
						System.out.println("Ingrese el nombre: ");
						nombre = scanner.next();
						System.out.println("Ingrese el precio: ");
						precio = scanner.nextDouble();
						do {
							System.out.println("Ingrese el codigo del país de destino: ");
							codigoPais = scanner.next();
							
							for (int j = 0;j <pais.size() && band3 == false;j++) {
								Pais elementoLista2 = pais.get(j);
								if (elementoLista2.getCodigo().equals(codigoPais)) {
									paisNuevo = elementoLista2;
									band3 = true;
								}
							}
							if (band3 == false) {
								System.out.println("------------------------------------------------");
								System.out.println("Debe ingresar un código de pais valido.");
								System.out.println("------------------------------------------------");
							}
							
						}while(band3 == false);
						System.out.println("Ingrese la cantidad de dias: ");
						cantidadDias = scanner.nextInt();
						DestinoTuristico destino2 = new DestinoTuristico(codigo, nombre, precio, paisNuevo, cantidadDias);
						destinoTuristico.add(i, destino2);
						System.out.println("----------------------------------------------");
						System.out.println("Se modifico exitosamente el destino turistico.");
						System.out.println("----------------------------------------------");
						}
					}
					if (band2 == false) {
						System.out.println("------------------------------------------------");
						System.out.println("Debe ingresar un código del destino turistico valido.");
						System.out.println("------------------------------------------------");
					}
				}
				break;
			case 4:
				if (destinoTuristico.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					destinoTuristico.clear();
					System.out.println("---------------------------");
					System.out.println("La lista ha sido limpiada.");
					System.out.println("---------------------------");
				}
				
				break;
			case 5:
				if (destinoTuristico.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------------Eliminar destino turistico-----------");
					System.out.println("Ingrese el código del destino turistico: ");
					codigo = scanner.next();
					boolean band4 = false;
					Iterator iterator = destinoTuristico.iterator();
					while(iterator.hasNext() && band4 == false) {
						DestinoTuristico j = (DestinoTuristico) iterator.next();
						if (j.getCodigo().equals(codigo)) {
							iterator.remove();
							System.out.println("---------------------------------------");
							System.out.println("El destino turistico ha sido eliminado.");
							System.out.println("---------------------------------------");
							band4 = true;
						}
					}
					if (band4 == false) {
						System.out.println("------------------------------");
						System.out.println("El destino turistico no existe.");
						System.out.println("------------------------------");
					}
				}
				
				break;
			case 6:
				if (destinoTuristico.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					destinoTuristico.sort(Comparator.comparing(DestinoTuristico::getNombre));
					for (DestinoTuristico d: destinoTuristico ) {
						System.out.println("----------"+d.getNombre()+"-----------------");
						System.out.println("Codigo: "+d.getCodigo());
						System.out.println("Nombre: "+d.getNombre());
						System.out.println("Precio: "+d.getPrecio());
						d.getPais().mostrarPais();
						System.out.println("Cantidad de días: "+d.getCantidadDias());
						System.out.println("---------------------------");
					}
				}
				break;
			case 7:
				System.out.println("----------Paises---------");
				for (Pais p: pais) {
					System.out.println("______"+p.getNombrePais()+"________");
					p.mostrarPais();
				}
				break;
			case 8:
				if (destinoTuristico.isEmpty()) {
					System.out.println("---------------------");
					System.out.println("La lista esta vacia.");
					System.out.println("---------------------");
				}
				else {
					System.out.println("-------Destinos turisiticos de un determinado país-----------");
					System.out.println("Ingrese el código del país: ");
					codigoPais = scanner.next();
					boolean band5 = false;
					for (DestinoTuristico d: destinoTuristico) {
						if (d.getPais().getCodigo().equals(codigoPais)) {
							System.out.println("----------"+d.getPais().getNombrePais()+"----------------");
							System.out.println("Codigo: "+d.getCodigo());
							System.out.println("Nombre: "+d.getNombre());
							System.out.println("Precio: "+d.getPrecio());
							d.getPais().mostrarPais();
							System.out.println("Cantidad de días: "+d.getCantidadDias());
							System.out.println("---------------------------");
							band5 = true;
						}
					}
					
					if (band5 == false) {
						System.out.println("---------------------------");
						System.out.println("No hay destinos turisticos registrados con ese codigo.");
						System.out.println("---------------------------");
					}
				}
				break;
			case 9:
				break;
			default:
				System.out.println("Ingrese una opción valida.");
				break;
			}
		}while(opcion != 9);

	}

}
