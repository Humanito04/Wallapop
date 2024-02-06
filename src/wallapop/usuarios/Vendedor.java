package wallapop.usuarios;

public class Vendedor {
	//Atributos
			private String nombre;
			private int productosVendidos[];
			
			//Constructores
			public  Vendedor(String nombre,int productosVendidos[]) {
				this.nombre = nombre;
				this.productosVendidos = productosVendidos;
			}

			//Getters y setters
			public String getNombre() {
				return nombre;
			}

			
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			
			public int[] getProductosVendidos() {
				return productosVendidos;
			}

			
			public void setProductosVendidos(int[] productosVendidos) {
				this.productosVendidos = productosVendidos;
			}
			
			
			
}
