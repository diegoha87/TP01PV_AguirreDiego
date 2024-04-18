package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public long calcularEdad() {
		Calendar hoy = Calendar.getInstance();
		long miliSegundos =hoy.getTimeInMillis() - this.fechaNacimiento.getTimeInMillis();
		long anios = miliSegundos/1000/60/60/24/365;
		return anios;
	}
	
	public String signoZodiacal() {
		int opcion = this.fechaNacimiento.get(Calendar.MONTH)+1;
		int dia = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		String signo = null;
		switch (opcion) 
		{
		case 1:
			if (dia >= 1 && dia <=19)
			{
				return signo = "Capricornio.";
			}
			
			if (dia >= 20 && dia <=31)
			{
				 signo = "Acuario.";
			}
			break;
		case 2:
			if (dia >= 1 && dia <=18)
			{
				return signo = "Acuario.";
			}
			
			if (dia >= 19 && dia <=28)
			{
				 signo = "Piscis.";
			}
			break;
		case 3:
			if (dia >= 1 && dia <=20)
			{
				 signo = "Piscis.";
			}
			
			if (dia >= 21 && dia <=31)
			{
				 signo = "Aries.";
			}
			break;
		case 4:
			if (dia >= 1 && dia <=19)
			{
				 signo = "Aries.";
			}
			
			if (dia >= 20 && dia <=30)
			{
				 signo = "Tauro.";
			}
			break;
		case 5:
			if (dia >= 1 && dia <=20)
			{
				 signo = "Tauro.";
			}
			
			if (dia >= 22 && dia <=31)
			{
				 signo = "Géminis.";
			}
			break;
		case 6:
			if (dia >= 1 && dia <=20)
			{
				 signo = "Géminis.";
			}
			
			if (dia >= 21 && dia <=30)
			{
				 signo = "Cáncer.";
			}
			break;
		case 7:
			if (dia >= 1 && dia <=22)
			{
				 signo = "Cáncer.";
			}
			
			if (dia >= 23 && dia <=31)
			{
				 signo = "Leo.";
			}
			break;
		case 8:
			if (dia >= 1 && dia <=22)
			{
				 signo = "Leo.";
			}
			
			if (dia >= 23 && dia <=31)
			{
				 signo = "Virgo.";
			}
			break;
		case 9:
			if (dia >= 1 && dia <=22)
			{
				 signo = "Virgo.";
			}
			
			if (dia >= 23 && dia <=30)
			{
				 signo = "Libra.";
			}
			break;
		case 10:
			if (dia >= 1 && dia <=22)
			{
				 signo = "Libra.";
			}
			
			if (dia >= 23 && dia <=31)
			{
				 signo = "Escorpio.";
			}
			break;
		case 11:
			if (dia >= 1 && dia <=21)
			{
				 signo = "Escorpio.";
			}
			
			if (dia >= 22 && dia <=30)
			{
				 signo = "Sagitario.";
			}
			break;
		case 12:
			if (dia >= 1 && dia <=21)
			{
				 signo = "Sagitario.";
			}
			
			if (dia >= 22 && dia <=31)
			{
				 signo = "Capricornio.";
			}
			break;
		}
		return signo;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Fecha de Nacimiento: "+new SimpleDateFormat("dd/MM/yyyy").format(this.fechaNacimiento.getTime()));
	}
	
	public String estacionAño() {
		int mes = this.fechaNacimiento.get(Calendar.MONTH)+1;
		int dia = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		String estacion = null;
		if (mes == 12 || mes == 1 || mes == 2 || mes == 3) {
			if (mes == 12) {
				if (dia >= 21) {
					estacion = "Verano.";
				}
			}
			else
			{
				if (mes == 3) {
					if (dia <= 20) {
						estacion = "Verano.";
					}
				}
				else
				{
					estacion = "Verano.";
				}
			}
		}
		
		if (mes == 3 || mes == 4 || mes == 5 || mes == 6) {
			if (mes == 3) {
				if (dia >= 21) {
					estacion = "Otoño.";
				}
			}
			else
			{
				if (mes == 6) {
					if (dia <= 20) {
						estacion = "Otoño.";
					}
				}
				else
				{
					estacion = "Otoño.";
				}
			}
		}
		
		if (mes == 6 || mes == 7 || mes == 8 || mes == 9) {
			if (mes == 6) {
				if (dia >= 21) {
					estacion = "Invierno.";
				}
			}
			else
			{
				if (mes == 9) {
					if (dia <= 20) {
						estacion = "Invierno.";
					}
				}
				else
				{
					estacion = "Invierno.";
				}
			}
		}
		
		if (mes == 9 || mes == 10 || mes == 11 || mes == 12) {
			if (mes == 9) {
				if (dia >= 21) {
					estacion = "Primavera.";
				}
			}
			else
			{
				if (mes == 12) {
					if (dia <= 20) {
						estacion = "Primavera.";
					}
				}
				else
				{
					estacion = "Primavera.";
				}
			}
		}
		return estacion;
	}

}
