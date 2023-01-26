package geometria;

public class Circunferencia {
	
	private Punto centro;
	private double radio;
	
	public Circunferencia() {
		this.centro = new Punto();
		this.radio = 1;
	}
	
	public Circunferencia(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularDiametro() {
		return this.radio*2;
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*this.radio;
	}
	
	public double calcularArea() {
		return Math.PI*this.radio*this.radio;
	}
	
	@Override
	public String toString() {
		return "Circunferencia -> centro: x=" + this.centro.getX() + " y=" + this.centro.getY() + " / radio: " + this.radio;
	}
	
	
	
	

}
