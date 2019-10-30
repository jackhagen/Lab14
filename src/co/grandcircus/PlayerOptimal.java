package co.grandcircus;

public class PlayerOptimal extends Player {

	public PlayerOptimal() {
		super();
	}

	public PlayerOptimal(String name) {
		super(name);
	}

	@Override
	public RoshamboEnum generateRoshambo() {

		int i = (int) (Math.random() * 3) + 1;

		switch (i) {

		case 1:
			return RoshamboEnum.ROCK;

		case 2:
			return RoshamboEnum.PAPER;

		default:
			return RoshamboEnum.SCISSORS;
		}

	}

}
