package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private String codigo;
	private String nombrePais;
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}

	public Pais(String codigo, String nombrePais) {
		this.codigo = codigo;
		this.nombrePais = nombrePais;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	public void mostrarPais() {
		System.out.println("Código del País: "+this.codigo);
		System.out.println("Nombre del País: "+this.nombrePais);
	}
	
}
