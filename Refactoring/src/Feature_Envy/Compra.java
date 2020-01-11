/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feature_Envy;

public class Compra {
    private Libros libros;
    private String GeneroPromocion;
    
    public String TotalaPagar(Libros libros){
        double imp = CalcularImpuesto(libros);
        double desc = CalcularDescuento(libros, GeneroPromocion);
        double precio = libros.getPrecio()+ imp - desc;
        
        return "El Total a Pagar es: "+precio;
    }
    
    public double CalcularImpuesto(Libros libros){
        float precio = libros.getPrecio();
        double imp = precio * 0.12;
        return imp;
    }
    /*Codigo Implementado antes de usar la Tecnica de Refactorizacion Move Method
    
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
    }*/
    
    //Luego de usar la Tecnica de Refactorizacion
    public double CalcularDescuento(Libros libros, String GeneroPromocion){
        return libros.CalcularDescuento(GeneroPromocion);
    }
}
