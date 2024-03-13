package elements;

public class Electric extends Pokemon{

	public Electric(String name, int hp) {
		super(name, hp);
	}
	
	public int attack(int opponentHP) {
		System.out.println(name + " uses thunderbolt attack!");
		return opponentHP - 30;
	}
	
}
