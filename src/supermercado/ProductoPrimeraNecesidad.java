package supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean tienePrecioCuidado) {
		super(nombre, precio * 0.9, tienePrecioCuidado);
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean tienePrecioCuidado, double descuento) {
		super(nombre, precio * (1 - (descuento / 100)), tienePrecioCuidado);
	}

}
