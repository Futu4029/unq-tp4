package supermercado;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productosComercializados = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public void agregarProducto(Producto prod) {
		productosComercializados.add(prod);
	}

	public int getCantidadDeProductos() {
		return productosComercializados.size();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getPrecioTotal() {
		double contador = 0;
		for (int i = 0; i < productosComercializados.size(); i++) {
			contador = contador + productosComercializados.get(i).getPrecio();
		}
		return contador;
	}

}
