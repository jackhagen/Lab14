package co.grandcircus;

public abstract class Player {

	public Player() {
	}

	public Player(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public abstract RoshamboEnum generateRoshambo();
}
