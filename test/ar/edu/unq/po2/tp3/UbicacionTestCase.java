package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class UbicacionTestCase {
	//setUp
	
	Ubicacion ubicacion1;
	Ubicacion ubicacion2;
	Ubicacion ubicacion3;
	Ubicacion ubicacion4;
	
	ArrayList<Ubicacion> ubicacionesATestear;
	
	@BeforeEach
	public void setup() throws Exception {
		ubicacion1 = new Ubicacion(-34.718532, -58.252806);
		ubicacion2 = new Ubicacion(-34.719519, -58.254598);
		ubicacion3 = new Ubicacion(-34.719701, -58.257358);
		ubicacion4 = new Ubicacion(-34.706891, -58.278547);
		
		ubicacionesATestear = new ArrayList<Ubicacion>();
		//ubicacionesATestear.add(ubicacion1);
		ubicacionesATestear.add(ubicacion2);
		ubicacionesATestear.add(ubicacion3);
		ubicacionesATestear.add(ubicacion4);
	}
	
	@Test
	// quiero que me devuelva la latitud de una ubicacion
	public void testLatitudUbicacion1() {  
		// excercise
		double latitudPedida = ubicacion1.getLatitud();
		
		// verify
		assertEquals(-34.718532,latitudPedida);
	}
	
	@Test
	// quiero que me devuelva la longitud de una ubicacion
	public void testLongitudUbicacion1() {  
		// excercise
		double longitudPedida = ubicacion2.getLongitud();
		
		// verify
		assertEquals(-58.254598,longitudPedida);
	}
	
	@Test
	// quiero que me devuelva la distancia entre dos ubicaciones
	public void testDeDistanciaEntreUbicaciones() {  
		// excercise
		double distanciaPedida = ubicacion1.distanciaHacia(ubicacion2);
		
		// verify
		assertEquals(0.20458330821444068,distanciaPedida);
	}
	
	@Test
	// quiero que me devuelva las ubicaciones cercanas a ubicacion1
	public void testDeUbicacionesCercanasAUbicacion1() {  
		// excercise
		ArrayList<Ubicacion> ubicacionesCercanas = ubicacion1.ubicacionesCercanasRespectoA(ubicacionesATestear, 1.40);
		
		// verify
		ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
		ubicaciones.add(ubicacion2);
		ubicaciones.add(ubicacion3);
		assertEquals(ubicaciones,ubicacionesCercanas);
	}
}
