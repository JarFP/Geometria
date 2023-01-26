package geometria;

public class Geometria {

	public static void main(String[] args) {
		System.out.println("Este es mi programa de geometría");
		
		System.out.println("-----PUNTOS-----");
		Punto miPunto1 = new Punto();
		System.out.println("las coordenadas de mi primer punto son: x=" + miPunto1.getX() + " y=" + miPunto1.getY());
		Punto miPunto2 = new Punto(4.72, 9.11);
		System.out.println("las coordenadas de mi segundo punto son: x=" + miPunto2.getX() + " y=" + miPunto2.getY());

		System.out.println("------------");
		System.out.println("-----MÁS PUNTOS-----");
		
		System.out.println(miPunto1.toString());
		System.out.println(miPunto2.toString());
		
		System.out.println("------------");
		System.out.println("-----RECTAS-----");
		
		Recta miRecta1 = new Recta();
		System.out.println(miRecta1.toString());
		Recta miRecta2 = new Recta(5, 8);
		System.out.println(miRecta2.toString());
		Recta miRecta3 = new Recta(2.1, -5);
		System.out.println(miRecta3.toString());
		
		System.out.println("------------");
		System.out.println("-----CIRCUNFERENCIAS-----");
		
		Circunferencia miCirc1 = new Circunferencia();
		System.out.println(miCirc1.toString());
		Circunferencia miCirc2 = new Circunferencia(miPunto2, 7);
		System.out.println(miCirc2.toString());
		System.out.println("Diametro de la circunferencia es: " + miCirc2.calcularDiametro());
		System.out.println("Perímetro de la circunferencia es: " + miCirc2.calcularPerimetro());
		System.out.println("Área de la circunferencia es: " + miCirc2.calcularArea());
		
		System.out.println("------------");
		System.out.println("-----INTERSECCIÓN RECTA CIRCUNFERENCIA-----");
		Punto[] p = miRecta1.interseccionConCircunferencia(miCirc1);
		System.out.println("Los puntos de intersección entre la recta y la circunferencia son:");
		for (Punto punto: p){
			System.out.println(punto.toString());
		}
	
	}

}
