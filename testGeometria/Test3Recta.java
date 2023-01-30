package testGeometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import geometria.Circunferencia;
import geometria.Punto;
import geometria.Recta;

class Test3Recta {

	// 3 Recta. Probaremos varios asserts y parametrizados
	
	@Test
	void pruebaInterseccion1() {
		// test normal de intersección
		Recta r1 = new Recta(0, 1);
		Circunferencia c1 = new Circunferencia(new Punto(2,2), 1);
		Punto[] inter = r1.interseccionConCircunferencia(c1);
		Punto interferenciaEsperada = new Punto(2, 1);
		assertEquals(inter[0].getX(), interferenciaEsperada.getX());
		assertEquals(inter[0].getY(), interferenciaEsperada.getY());
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {1, 2, 3, 4, 5})
	void pruebaParametrica(double valor) {
		// test paramétrico sencillo
		boolean esperado = false;
		if (valor < 10) {
			esperado = true;
		}
		assertTrue(esperado);
	}


}
