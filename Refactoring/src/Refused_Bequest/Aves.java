package Refused_Bequest;

public /*abstract */class Aves {
	protected String Nombre;
	protected int Edad;
	
	public Aves() {
		this.Nombre = Nombre;
		this.Edad = Edad;
	}
	/*Antes de Aplicar la refactorizacion
	  abstract public void Comer();
	  abstract public void Nadar();
	  abstract public void Volar();
	*/
	
	public void Comer() {
		System.out.println("El ave puede comer");
	};
	public void Nadar() {
		System.out.println("El ave puede nadar");
	};
	public void Volar() {
		System.out.println("El ave puede volar");
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	};
	
	
}