package Animais;

public class Main {

	public static void main(String[] args) {
		Animal c = new Cachorro();
		Animal e = new Elefante();
		Animal j = new Jaguar();

		c.CaracterÝsticas();
		System.out.println("---------------------------------------------------");
		e.CaracterÝsticas();
		System.out.println("---------------------------------------------------");
		j.CaracterÝsticas();
	}
}