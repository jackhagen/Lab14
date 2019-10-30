package co.grandcircus;

public class PlayerRock extends Player {

	public PlayerRock() {

	}

	public PlayerRock(String name) {
		super(name);
	}

	@Override
	public RoshamboEnum generateRoshambo() {
		return RoshamboEnum.ROCK;
	}

	@Override
	public String toString() {
		return "PlayerRock [toString()=" + super.toString() + "]";
	}

}
