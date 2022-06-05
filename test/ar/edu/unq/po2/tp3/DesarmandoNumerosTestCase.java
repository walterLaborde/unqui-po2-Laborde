package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmandoNumerosTestCase {
	
	private DesarmandoNumeros desarmandoNumeros;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	desarmandoNumeros = new DesarmandoNumeros();
	//Se agregan los numeros. Un solo par y nueve impares
	desarmandoNumeros.addNumber(12113);
	desarmandoNumeros.addNumber(34442);
	desarmandoNumeros.addNumber(44609);
	desarmandoNumeros.addNumber(99335);
	}
	
	
	@Test
	void test() {
		//getting the numbers disarmed
		int greatestEvenDigitsQty = desarmandoNumeros.desarmandoNumeros();
		assertEquals(greatestEvenDigitsQty,34442);
	}

}
