package Divergent_Change;

import java.util.ArrayList;

public class Venta {
	ArrayList<Producto> ListaProductos = new ArrayList<Producto>();
	
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
			Total += PrecioF(pro.getTipo(), pro.getPrecio());
		}
		return Total;
	}
	
}