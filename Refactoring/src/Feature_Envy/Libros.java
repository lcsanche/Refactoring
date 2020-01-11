/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feature_Envy;

public class Libros {
    private String Nombre;
    private String Autor;
    private String Genero;
    private String Editorial;
    private String Edicion;
    private float Precio;
    
    public Libros(String Nombre, String Autor, String Genero, String Editorial, String Edicion, float Precio){
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Edicion = Edicion;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public double CalcularDescuento(String GeneroPromocion) {
        double desc = 0;
        if (this.getPrecio() > 30) {
            if (this.getPrecio() > 50) {
                desc += 20.0;
            } else {
                desc += 10.0;
            }
        } else {
            desc += 0;
        }
        if (this.getGenero() == GeneroPromocion) {
            desc += 5.0;
        }
        return desc;
    }
    
    
    
    
}
