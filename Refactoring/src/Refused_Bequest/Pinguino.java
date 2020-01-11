package Refused_Bequest;
import Refused_Bequest.Aves;

public class Pinguino /*extends Aves*/{
	public Aves Aves = new Aves(); 
	
	/*Esto es antes de aplicar de refactorizar y corregir el code smell
	
	public void Comer() {
		System.out.println("El ave puede comer");
	}
	public void Nadar() {
		System.out.println("El ave puede nadar");
	}*/
	
	public void Comer() {
		this.Aves.Comer();
	}
	
	public void Nadar() {
		this.Aves.Nadar();
	}
}
