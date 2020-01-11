package Long_Class;

import java.util.ArrayList;

import Divergent_Change.Producto;

public class Gerente {
	protected String Usuario;
	protected String Clave;
	/*
	 * Debido  la presencia de muchas variables se procedio a usar el metodo de refactorizacion de
	 * Extract Class con la finalidad de dividir las funcionalidades de la clase
	 */
	public Data_Empleados data = new Data_Empleados();
	ArrayList<Producto> Inventario = new ArrayList<Producto>();
	ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
	
	public Gerente(String Usuario, String Clave, String Nombre, String Cedula, String Edad, String EstadoCivil, String Telefono, String Direccion) {
        this.Usuario = Usuario;
        this.Clave = Clave;
		this.data.Nombre = Nombre;
        this.data.Cedula = Cedula;
        this.data.Edad = Edad;
        this.data.EstadoCivil = EstadoCivil;
        this.data.Telefono = Telefono;
        this.data.Direccion = Direccion;
        
    }
	
	public boolean VerificarCredenciales(String usuario, String clave) {
		if(usuario == Usuario && clave == Clave) {
			return true;
		}else {
			return false;
		}
	}
	
	public void AgregarProducto(Producto producto) {
		Inventario.add(producto);
	}
	
	public void AgregarEmpleado(Empleado empleado) {
		ListaEmpleados.add(empleado);
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public Data_Empleados getData() {
		return data;
	}

	public void setData(Data_Empleados data) {
		this.data = data;
	}
}
