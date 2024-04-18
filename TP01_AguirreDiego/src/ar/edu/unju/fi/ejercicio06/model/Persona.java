package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private long dni;
	private String nombre;
	private LocalDate fecha_nac;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(long dni, String nombre, LocalDate fecha_nac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.provincia = provincia;
	}

	public Persona(long dni, String nombre, LocalDate fecha_nac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.provincia = "Jujuy";
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni2) {
		this.dni = dni2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fecha_nac, fechaActual);
		return periodo.getYears();
	}
	
	public boolean verificarEdad() {
		return calcularEdad() >= 18;
		
	}
	
	public void mostraDatos() {
		System.out.println("Dni: "+dni);
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha de Nacimiento: "+fecha_nac);
		System.out.println("Edad: "+calcularEdad());
		System.out.println("Provincia: "+provincia);
		
		if (verificarEdad()) {
			System.out.println("La persona es mayor de edad.");
		}
		else
		{
			System.out.println("La persona NO es mayor de edad.");
		}
	}
	
	
	
	
}
