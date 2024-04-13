package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private double descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public void calcularDescuento() {
		if (this.descuento == 0) {
			System.out.println("Precio del Producto: "+this.precio);
			System.out.println("Descuento: "+0.0);
			System.out.println("TOTAL: "+this.precio);
		}
		else {
			if (this.descuento > 0 && this.descuento <= 50) {
				System.out.println("Precio del producto: "+precio);
				System.out.println("Descuento: "+(this.precio * this.descuento)/100);
				System.out.println("TOTAL: "+(this.precio-(this.precio * this.descuento)/100));
			}
			
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del producto: "+this.nombre);
		System.out.println("Código del producto: "+this.codigo);
	}
}
