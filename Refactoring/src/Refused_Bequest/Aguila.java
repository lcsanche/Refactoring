package Refused_Bequest;

public class Aguila /*extends Aves*/{
	public Aves Aves = new Aves(); 
	
	/*Esto es antes de aplicar de refactorizar y corregir el code smell
	
	public void Comer() {
		System.out.println("El ave puede comer");
	}
	public void Volar() {
		System.out.println("El ave puede volar");
	}*/
	
	public void Comer() {
		this.Aves.Comer();
	}
	
	public void Volar() {
		this.Aves.Volar();
	}
}
