package wallapop.compraventa;

public class Producto {
	// Atributos
	private int codigo;
	private String nombre;
	private double precio;
	private EstadoProducto estado;

	private static int contadorCod;
	
	private static Producto masCaro;
	private static Producto masBarato;
	private static Producto ultimoVendido;

	// Constructores
	public Producto(String nombre, String estado, int codigo) {
		this.codigo = contadorCod + 1;
		this.nombre = nombre;
		this.precio = 0.0;
		this.estado = EstadoProducto.NUEVO;

		contadorCod++;
		actualizaEstadistica(precio);
	}

	public Producto(String nombre, String estado, double precio) {
		this.codigo = contadorCod + 1;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = EstadoProducto.valueOf(estado);
		contadorCod++;
		actualizaEstadistica(precio);
	}
	public Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public static int getCodigo() {
		return contadorCod;
	}

	public static void setCodigo(int codigo) {
		Producto.contadorCod = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public EstadoProducto getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = EstadoProducto.valueOf(estado);
	}

	private void actualizaEstadistica(double precio) {
		if(precio > masCaro.getPrecio()) {
			masCaro = this;
		}
		if(precio < masBarato.getPrecio()) {
			masCaro = this;
		}
	}

}
