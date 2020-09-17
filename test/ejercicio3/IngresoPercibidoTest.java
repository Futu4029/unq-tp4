package ejercicio3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.Date;

import org.junit.jupiter.api.Test;

class IngresoPercibidoTest {
	
	private Date fecha1 = new Date (120, 1, 31);
	private IngresoPercibido sueldoMesEnero;
	
	
	@BeforeEach
	public void setUp() {
		
		sueldoMesEnero = new IngresoPercibido(fecha1, "Sueldo", 24300.1f);
		
	}
	@Test
	void testMontoPercibido() {
		assertEquals(sueldoMesEnero.getMontoPercibido(), 24300.099609375);
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(sueldoMesEnero.getMontoImponible(), 24300.099609375);
	}

}
