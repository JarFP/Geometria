package geometria;

public class Recta {
	
	private double pendiente, desplazamiento;
	
	public Recta() {
		this.pendiente = 1;
		this.desplazamiento = 0;
	}
	
	public Recta(double pendiente, double desplazamiento) {
		this.pendiente = pendiente;
		this.desplazamiento = desplazamiento;
	}

	public double getPendiente() {
		return pendiente;
	}

	public void setPendiente(double pendiente) {
		this.pendiente = pendiente;
	}

	public double getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(double desplazamiento) {
		this.desplazamiento = desplazamiento;
	}
	
	@Override
	public String toString() {
		if (this.desplazamiento == 0) {
			return "La función de la recta es: y=" + this.pendiente + "x";
		} else if (this.desplazamiento > 0)
		return "La función de la recta es: y=" + this.pendiente + "x+" + this.desplazamiento;
		else {
			return "La función de la recta es: y=" + this.pendiente + "x" + this.desplazamiento;
		}
	}
	
	
	
	// INTERSECCIÓN CON CIRCUNFERENCA
	 public Punto[] interseccionConCircunferencia(Circunferencia c) {
	        double a = 1 + pendiente * pendiente;
	        double b = -2 * c.getCentro().getX() + 2 * pendiente * desplazamiento - 2 * c.getCentro().getY() * pendiente;
	        double cc = c.getCentro().getX() * c.getCentro().getX() + desplazamiento * desplazamiento + c.getCentro().getY() * c.getCentro().getY() - 2 * c.getCentro().getY() * desplazamiento - c.getRadio() * c.getRadio();
	        double delta = b * b - 4 * a * cc;
	        if (delta < 0) {
	            return new Punto[0];
	        } else if (delta == 0) {
	            double x = -b / (2 * a);
	            double y = pendiente * x + desplazamiento;
	            Punto[] puntos = {new Punto(x, y)};
	            return puntos;
	        } else {
	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double y1 = pendiente * x1 + desplazamiento;
	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            double y2 = pendiente * x2 + desplazamiento;
	            Punto[] puntos = {new Punto(x1, y1), new Punto(x2, y2)};
	            return puntos;
	        }
	    }
	

}
