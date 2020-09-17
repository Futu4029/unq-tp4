package supermercado;

public class Producto {
	String nombre;
	double precio;
	boolean esPrecioCuidado = false;

	public void meterAlProgramaPC() {
		esPrecioCuidado = true;
	}

	public Producto(String nombre, double precio, boolean tienePrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = tienePrecioCuidado;
	}

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		this.precio = precio + aumento;
	}

}
