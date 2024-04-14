package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	public final int ESPECIALES20 = 500;
	public final int ESPECIALES30 = 750;
	public final int ESPECIALES40 = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	public void calcularPrecio() {
		switch(this.diametro) 
		{
		case 20:
			if(this.ingredientesEspeciales==true) {
				this.precio = 4500 + ESPECIALES20;
			}
			else
			{
				this.precio = 4500;
			}
			break;
		case 30:
			if(this.ingredientesEspeciales==true) {
				this.precio = 4800 + ESPECIALES30;
			}
			else
			{
				this.precio = 4800;
			}
			break;
		case 40:
			if(this.ingredientesEspeciales==true) {
				this.precio = 5500 + ESPECIALES40;
			}
			else
			{
				this.precio = 5500;
			}
			break;
		default:
			
		}
	}
	
	public void calcularArea() {
		this.area = Math.PI * Math.pow(this.diametro/2, 2);
	}
	
	public void mostrarDatos() {
		System.out.println("Diámetro = "+this.diametro);
		System.out.println("Ingredientes especiales = "+this.ingredientesEspeciales);
		System.out.println("Precio Pizza= "+this.precio);
		System.out.println("Área de la pizza = "+this.area);
	}
}
