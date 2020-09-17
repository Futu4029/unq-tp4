package ejercicio3;
import java.util.Date;

public class IngresoPercibido {

	private Date mes;
	private String concepto;
	private double montoPercibido;
	
	public IngresoPercibido(Date mes, String concepto, double montoPercibido) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public Date getMes() {
		return this.mes;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	
	public double getMontoPercibido() {
		return this.montoPercibido;
	}
	
	public double getMontoImponible() {
		return this.montoPercibido;
	}

}
