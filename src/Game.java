import elements.Electric;
import elements.Grass;

public class Game {

	public static void main(String [] args) {
		Electric pikachu = new Electric("Pikachu", 100);
		Grass balbasaur = new Grass("Balbasaur", 80);
		System.out.println(pikachu.getMaster());
		balbasaur.setHP(pikachu.attack(balbasaur.getHP()));
		pikachu.setHP(balbasaur.attack(pikachu.getHP()));
		viewState(pikachu, balbasaur);
	}

	private static void viewState(Electric pikachu, Grass balbasaur) {
		System.out.println();
		System.out.println(pikachu.getName() + "[" + pikachu.getHP()+ "]");
		System.out.println(balbasaur.getName() + "[" + balbasaur.getHP() + "]");
	}

}
