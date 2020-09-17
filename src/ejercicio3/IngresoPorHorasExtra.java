package ejercicio3;
import java.util.Date;

public class IngresoPorHorasExtra extends IngresoPercibido{
	private int cantHorasExtras;
	
	public IngresoPorHorasExtra(Date fecha, String concepto, double monto, int horasExtra) {
		super(fecha, concepto, monto);
		this.cantHorasExtras = horasExtra;
	}
	
	public int getHorasExtras() {
		return cantHorasExtras;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}
	
	
}
