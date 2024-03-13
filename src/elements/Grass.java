package elements;

public class Grass extends Pokemon{

	public Grass(String name, int hp) {
		super(name, hp);
	}
	
	public int attack(int opponentHP) {
		System.out.println(name + " uses vine whip attack!");
		return opponentHP - 20;
	}
	

}
