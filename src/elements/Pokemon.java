package elements;

import gym.Gym;

public class Pokemon extends Gym{ //superclass
	protected String name;
	protected int hp;
	
	public Pokemon(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
	
	public String getMaster() {
		System.out.println("--- Cerulean Master ---");
		return super.getMaster();
	}
	
	public String getName() {
		return name;
	}
	
	public int getHP() {
		return hp;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}

}
