/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Clumps;

public class Cliente {
    private String Nombre;
    private String Cedula;
    private String Telefono;
    /*
    Antes de utilizar la tecnica de refactorizacion tenia varios atributos que reflejaban
    lo mismo, por esta razon se uso el metodo Extract Class para moverlos a una nueva 
    clase y que formaran parte de un solo objeto
    public String Pais;
	public String Ciudad;
	public String Direccion;
	public String CodigoPostal;
     */
    
    //Luego de usar la tecnica de refactoriacion
    private Direccion direccion = new Direccion();


	public Cliente(String Nombre, String Cedula, String Telefono, String Pais, String Ciudad, String Direccion, String CodigoPostal) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.direccion.Pais = Pais;
        this.direccion.Ciudad = Ciudad;
        this.direccion.Direccion = Direccion;
        this.direccion.CodigoPostal = CodigoPostal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getPais() {
        return direccion.Pais;
    }

    public void setPais(String Pais) {
        this.direccion.Pais = Pais;
    }

    public String getCiudad() {
        return direccion.Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.direccion.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return direccion.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion.Direccion = Direccion;
    }

   public String getCodigoPostal() {
        return direccion.CodigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.direccion.CodigoPostal = CodigoPostal;
    }
    
    
}
