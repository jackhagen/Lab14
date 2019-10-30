package co.grandcircus;

public enum RoshamboEnum {

	ROCK, PAPER, SCISSORS;

	@Override
	public String toString() {
		switch (this) {
		case ROCK:
			return "Rock";

		case PAPER:
			return "Paper";

		default:
			return "Scissors";
		}
	}

}
