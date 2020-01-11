package Long_Class;

public class Empleado {
	private String Nombre;
    private String Cedula;
    private String Telefono;
    
    public Empleado(String Nombre, String Cedula, String Telefono) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}
