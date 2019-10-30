package co.grandcircus;

public class PlayerHuman extends Player {

	private String userChoice;

	public String getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	@Override
	public RoshamboEnum generateRoshambo() {

		if (userChoice.toLowerCase().startsWith("r")) {
			return RoshamboEnum.ROCK;
		} else if (userChoice.toLowerCase().startsWith("s")) {
			return RoshamboEnum.SCISSORS;
		} else {
			return RoshamboEnum.PAPER;
		}

	}

	public String toString() {
		return "PlayerHuman [userChoice=" + userChoice + "]";
	}

}
