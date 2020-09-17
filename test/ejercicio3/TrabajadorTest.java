package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

class TrabajadorTest {
	
	private Trabajador jimmy = new Trabajador();
	private Date fecha1 = new Date (120, 1, 31);
	private Date fecha2 = new Date (120, 2, 37);
	private IngresoPercibido sueldoMesEnero;
	private IngresoPercibido sueldoMesFebrero;
	private IngresoPorHorasExtra extraMesFebrero;
	
	@BeforeEach
	public void setUp() {
		
		sueldoMesEnero = new IngresoPercibido(fecha1, "Sueldo", 24300.1);
		sueldoMesFebrero = new IngresoPercibido(fecha2, "Sueldo", 26300.1);
		extraMesFebrero = new IngresoPorHorasExtra(fecha2, "Horas Extra", 5000, 25);
		jimmy.registrarIngreso(sueldoMesEnero);
		jimmy.registrarIngreso(sueldoMesFebrero);
		jimmy.registrarIngresoExtra(extraMesFebrero);
		
	}
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(jimmy.getImpuestoAPagar(), 1012.004);
	}
	
	 @Test
	 void testMontoImponible() {
		assertEquals(jimmy.getMontoImponible(), 50600.2);
	 }
	 
	 @Test
	 void testTotalPercibido() {
		assertEquals(jimmy.getTotalPercibido(), 55600.2);
	 }

}
