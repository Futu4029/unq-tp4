package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtraTest {
	private IngresoPorHorasExtra extraMesFebrero;
	private Date fecha2 = new Date (120, 2, 37);
	
	@BeforeEach
	public void setUp(){
		extraMesFebrero = new IngresoPorHorasExtra(fecha2, "Horas Extra", 5000, 25);
	}
	@Test
	void testMontoPercibido() {
		assertEquals(extraMesFebrero.getMontoPercibido(), 5000);
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(extraMesFebrero.getMontoImponible(), 0);
	}

}
