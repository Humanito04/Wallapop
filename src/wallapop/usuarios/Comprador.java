package wallapop.usuarios;
 import java.util.Arrays;

import wallapop.compraventa.Producto;

public class Comprador {
	private String nombre;
	private int productosComprados[];
	private double dineroDisponible;

	public Comprador(String nombre, int productosComprados[], double dineroDisponible) {
		this.nombre = nombre;
		this.productosComprados = productosComprados;
		this.dineroDisponible = dineroDisponible;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] productosComprados() {
		return productosComprados;
	}

	public void setProductosComprados(int productosComprados[]) {
		this.productosComprados = productosComprados;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
	public void addProducto(Producto p) {
		for (int i = 0; i < this.productosComprados.length; i++) {
			if (i == this.productosComprados.length - 1 && this.productosComprados()[i] != null) {
				throw new IllegalArgumentException("No puedes añadir más productos");
			}
			if(this.productosComprados[i].getCodigo() == p.getCodigo()) {
				this.productosComprados[i] = null;
			}
		}
	}

	public void removeProducto(Producto p) {
		for (int i = 0; i < this.productosComprados.length; i++) {
			if (this.productosComprados[i].getCodigo() == p.getCodigo()) {

			}
		}
	}

}
