package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int calcularSumatoria() {
		int acum=0;
		for (int k = this.n;0 < k; k--) {
			acum = acum + (int)Math.pow((k*(k+1))/2, 2);
		}
		return acum;
	}
	
	public int calcularProductoria() {
		int acum=1;
		for (int k = n;0 < k; k--) {
			acum = acum * (k*(k+4));
		}
		return acum;
	}
}
