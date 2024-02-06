package wallapop.compraventa;

import wallapop.usuarios.Comprador;
import wallapop.usuarios.Vendedor;

public class Trato {
	private Comprador comprador;
	private Vendedor vendedor;
	private Producto producto;

	private boolean firmaComprador;
	private boolean firmaVendedor;

	public Trato(Comprador comprador, Vendedor vendedor, Producto producto) {
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.producto = producto;
		this.firmaComprador = false;
		this.firmaVendedor = false;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void validar(Comprador c) {
		if(this.firmaComprador) {
			throw new IllegalStateException("El trato ya estaba validado"); 
		}
		this.firmaComprador = true;
	}

	public void validar(Vendedor v) {
		if(this.firmaVendedor) {
			throw new IllegalStateException("El trato ya estaba validado"); 
		}
		this.firmaVendedor = true;
	}
}
