package testGeometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometria.Circunferencia;
import geometria.Punto;

class Test2Circunferencia {

	// 2 Circunferencia. Probaremos más asserts
	// assertEquals – dos valores iguales
	// assertTrue – este método será existoso si obtiene true
	// assertFalse – este método será existoso si obtiene false
	// assertNotNull – será exitoso si el contenido es diferente de null
	// assertNull – será exitoso si el contenido es null
	// assertSame – dos objetos que son el mismo
	// assertNotSame – dos objetos no son el mismo
	// assertArrayEquals – dos arrays iguales  
	
	// asserts para gestionar excepciones
	
	@Test
	void probandoAssertTrue() {
		// quiero probar que una circunferencia de radio 3
		// es mayor a una de radio 1
		boolean respuesta;
		Circunferencia c1 = new Circunferencia();
		Circunferencia c2 = new Circunferencia(new Punto(), 3);
		if (c1.getRadio() < c2.getRadio()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		assertTrue(respuesta);
	}
	
	@Test
	void probandoAssertFalse() {
		// quiero probar que una circunferencia de radio 3
		// tiene mas area que una de radio 1
		boolean respuesta;
		Circunferencia c1 = new Circunferencia();
		Circunferencia c2 = new Circunferencia(new Punto(), 3);
		if (c1.calcularArea() > c2.calcularArea()) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		assertFalse(respuesta);
	}
	
	@Test
	void probandoNotNull() {
		// quiero probar que si inicializo una circunferencia con un
		// constructro vacio su punto no es null
		Circunferencia c1 = new Circunferencia();
		assertNotNull(c1.getCentro());
	}
	
	@Test
	void probandoSame () {
		// probando que dos vbles son el mismo objeto
		Circunferencia c1 = new Circunferencia();
		assertSame(c1, c1);
	}
	
	@Test
	void probandoNotSame () {
		// probando que dos vbles son diferente objeto
		Circunferencia c1 = new Circunferencia();
		Circunferencia c2 = new Circunferencia();
		assertNotSame(c1, c2);
	}
	
	@Test
	void probandoArrayEquals () {
		// probando que dos arrays son iguales
		int[] a1 = new int[2];
		a1[0] = 1;
		a1[1] = 2;
		int[] a2 = new int[2];
		a2[0] = 1;
		a2[1] = 2;
		assertArrayEquals(a1, a2);		
	}

}
