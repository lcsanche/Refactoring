package Divergent_Change;

public class Producto {
	protected String Nombre;
	protected String Tipo;
	protected String Modelo;
	protected String Marca;
	protected double Precio;
	
	public Producto(String Nombre, String Tipo, String Modelo, String Marca, double Precio) {
		this.Nombre = Nombre;
		this.Tipo = Tipo;
		this.Modelo = Modelo;
		this.Marca = Marca;
		this.Precio = Precio;
	}
	
	/* Debido a que esta funcion tiene esta clase presenta doble responsabilidad, violando los principios
	   solid, se procedera a usar la tecnica de refactorizacion Extract Method
	
	public void AgregarProducto(Producto producto) {
		ListaProductos.add(producto);
	}
	
	public double Promocion(String Tipo) {
		if (Tipo=="Regrigeradora") {
			return 0.20;
		}else if(Tipo == "Cocina"){
			return 0.15;
		}else if(Tipo == "Televisores") {
			return 0.25;
		}else {
			return 0;
		}
	}
	
	public double PrecioF(String Tipo, double Precio) {
		double PrecioT = Precio-(Precio*Promocion(Tipo));
		return PrecioT;
	}
	
	public double TotalaPagar(ArrayList<Producto> ListaProductos) {
		double Total= 0;
		for (int i=0; i<ListaProductos.size(); i++) {
			Producto pro = ListaProductos.get(i);
			Total += pro.PrecioF(pro.getTipo(), pro.getPrecio());
		}
		return Total;
	}
	 */
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}	
}
