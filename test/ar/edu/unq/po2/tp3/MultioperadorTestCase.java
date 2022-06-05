package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	
	private Multioperador multioperador;

	@BeforeEach
	public void Setup() throws Exception {
		
		multioperador = new Multioperador();
		
		multioperador.add(1);
		multioperador.add(2);
		multioperador.add(3);
		multioperador.add(4);
		
	}
	
	@Test
	void sumarTodosTest() {
		int arregloPSuma = multioperador.sumarTodos();
		assertEquals(10,arregloPSuma);
		//fail("Not yet implemented");
	}
	
	@Test
	void multTodosTest() {
		int arregloPMult = multioperador.multTodos();
		assertEquals(24,arregloPMult);
		//fail("Not yet implemented");
	}

	@Test
	void restarTodosTest() {
		int arregloPRest = multioperador.restarTodos();
		assertEquals(-10,arregloPRest);
		//fail("Not yet implemented");
	}
}
