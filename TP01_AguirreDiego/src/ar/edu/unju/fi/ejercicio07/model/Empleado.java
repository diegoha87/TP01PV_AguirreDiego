package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {
	private String nombre;
	private long legajo;
	private double salario;
	
	public final double SALARIOMINIMO = 210000.00;
	public final double AUMENTO = 20000.00;
	
	public Empleado(String nombre, long legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= SALARIOMINIMO) {
			this.salario = salario;
		}
		else
		{
			this.salario = SALARIOMINIMO;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario $: "+salario);
	}
	
	public void darAumento() {
		this.salario = this.salario + AUMENTO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
