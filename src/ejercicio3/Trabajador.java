package ejercicio3;
import java.util.ArrayList;

public class Trabajador {
	private ArrayList<IngresoPercibido> ingresosPercibidos = new ArrayList<IngresoPercibido>();
	private ArrayList<IngresoPorHorasExtra> ingresosExtra = new ArrayList<IngresoPorHorasExtra>();
	
	public Trabajador() {
		super();
	}
	
	public void registrarIngreso(IngresoPercibido ingreso) {
		ingresosPercibidos.add(ingreso);
	}
	
	public void registrarIngresoExtra(IngresoPorHorasExtra ingreso) {
		ingresosExtra.add(ingreso);
	}
	
	public double getImpuestoAPagar() {
		double impuestosTotales = this.ingresosPercibidos.stream().mapToDouble(ingreso -> ingreso.getMontoImponible()).sum()*0.02;
		return impuestosTotales;
	}
	
	public double getMontoImponible() {
		double montoImponible = this.ingresosPercibidos.stream().mapToDouble(ingreso -> ingreso.getMontoImponible()).sum();
		return montoImponible;
	}
	
	public double getTotalPercibido() {
		double ingPercibidos = this.ingresosPercibidos.stream().mapToDouble(ingreso -> ingreso.getMontoPercibido()).sum();
		double ingExtra = this.ingresosExtra.stream().mapToDouble(ingreso -> ingreso.getMontoPercibido()).sum();
		return ingPercibidos+ingExtra;
	}
}
