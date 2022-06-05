package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplosTestCase {
	
	private Multiplos multiplos;
	
	@BeforeEach
	public void setUp() throws Exception {
		multiplos = new Multiplos();
	}
	
	@Test
	// highest mult of
	public void highestMultOf() {
		int highestM = multiplos.elMultMasAltoDe(9);
		assertEquals(highestM,999);
	}
	
	@Test
	// pruebo el multiplo mas alto entre 2 y 7
	public void testMaxMultBetweenNonMultiplesNum() {
		int highestMult = multiplos.multiploMasAlto(7,2);
		assertEquals(highestMult,-1);
	}
	

	
	@Test
	// pruebo el multiplo mas alto entre 2 y 16
	public void testMaxMultBetweenTwoMultipleNum() {
		int highestMult = multiplos.multiploMasAlto(9,3);
		assertEquals(highestMult,999);
	}

}
