package testGeometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import geometria.Punto;

class Test1Punto {

	// 1 Punto. JUnit algunas pruebas básicas
	
	static Punto p;
	
	@BeforeAll
	static void creamosPuntoParaProbar () {
		p = new Punto(3, 5);
	}
	
	@Test
	void siempreFallaTest() {
		fail("Usando la función fail el test siempre falla.");
	}
	
	@Test
	void puntoGetXTest() {
		// probamos si la función getX es funciona correctamente
		double esperado, resultado;
		esperado = 3;
		resultado = p.getX();
		assertEquals(esperado, resultado);
	}
	
	@Test
	void puntoGetYTest() {
		// probamos si la función getX es funciona correctamente
		double esperado, resultado;
		esperado = 5;
		resultado = p.getY();
		assertEquals(esperado, resultado);
	}

}



